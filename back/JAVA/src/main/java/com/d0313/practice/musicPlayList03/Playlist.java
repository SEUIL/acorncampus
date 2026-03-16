package com.d0313.practice.musicPlayList03;

import java.util.Scanner;

/*
* 플레이리스트 전체를 관리하는 클래스
* - Song 객체들을 배열에 저장한다.[객체배열]
* - 추가, 수정, 삭제, 조회 기능
* + 현재는 입력(Scanner)와 메뉴 처리 기능(원래는 Main에서 입력은 받던지 아니면 따로 분리해야 하지만)
*
* 객체지향
* - Song : 노래 1개의 데이터 객체
* - Playlist : 여러개의 Song 객체를 관리하는 객체
* */
public class Playlist {
    //사용자 입력 위한 Scanner 객체(Playlist 객체 method 내부에서 입력[Scanner] 필요)
    private final Scanner sc = new Scanner(System.in);

    // Song 객체를 저장하는 배열
    private final Song[] songs = new Song[120];

    /* 배열 크기 유한하기 떄문에
    현재 저장된 곡 개수 = songCount*/
    private int songCount = 0;

    /*앨범명과 곡명 기준으로 해당 곡의 index 찾기 method
    * - 수정, 삭제 기능에서 사용
    * - 찾으면 해당 index, 못 찾으면 -1 반환
    * - Playlist 객체 내부에서만 호출되므로 private */
    private int findSongIndex(String albumName, String songName) {
        for (int i = 0; i < songCount; i++) {
            if (songs[i].getSongName().equals(songName) && songs[i].getAlbumName().equals(albumName)) {
                return i;
            }
        }
        return -1;
    }

    /*메뉴 입력 검증 method
    - startNum ~ endNum 범위 안에 숫자 입력할 때까지 반복해서 입력 받음
    - 범위 내의 숫자 입력이 아니라면 다시 입력 검증 / 문자 입력 시에는 보완 필요
    * */
    private int isValidRangeNumber(int startNum,int endNum){
        while(true){
            int input = Integer.parseInt(sc.nextLine());

            if(input < startNum || input > endNum){
                System.out.printf("%d ~ %d 사이의 숫자만 입력해주세요.%n", startNum, endNum);
                continue;
            }
            return input;
        }
    }

    /*메뉴 입력 검증 method
    * - isValidRangeNumber() 호출
    * - 추후에 run()을 선언하고 안에 기능별로 method 분리하기*/
    public int selectMenu() {
        return isValidRangeNumber(1,5);
    }

    /* 추가 메뉴 담당 Method
    - 앨범 / 곡 단위 추가 선택 입력
    - 선택 결과 따라서 addAlbum() 또는 addSong() 호출
    * */
    public void addMenu() {
        System.out.println("1. 앨범 추가 / 2. 음악 추가");
        int menu = isValidRangeNumber(1, 2);
        if(menu == 1){
            addAlbum();
        } else{
            addSong();
        }


    }

    /*앨범 단위 곡 추가 method
    * - */
    private void addAlbum() {
        System.out.println("앨범명 / 장르 / 가수명 / 입력할 곡 개수 순서로 입력");
        System.out.print("앨범명 : ");
        String album = sc.nextLine();

        System.out.print("장르 : ");
        String genre = sc.nextLine();

        System.out.print("가수명 : ");
        String singer = sc.nextLine();

        System.out.print("곡 수 :");
        int count = 0;

        boolean isValid = false; //

        while (!isValid) {
            count = Integer.parseInt(sc.nextLine());
            if (count >= 1) {
                if (songCount + count > songs.length) {
                    System.out.println("저장공간이 가득 차서 더이상 추가할 수 없습니다");
                    System.out.printf("0보다 크고 %d과 같거나 작은 숫자를 입력하세요.%n", 120 - songCount);
                } else {
                    System.out.printf("%d개 곡 추가를 하겠습니다%n", count);
                    isValid = true;
                }
            } else {
                System.out.println("1 미만의 값을 입력하였습니다.");
                System.out.printf("1이상 %d 이하의 정상 범위 내에 숫자를 입력하세요.", 120 - songCount);
            }
        }


        System.out.println("곡명을 입력하세요 ");
        for (int i = 0; i < count; i++) {
            System.out.printf("%d번 곡명 : ", (i + 1));
            String songName = sc.nextLine();

            songs[songCount++] = new Song(album, songName, genre, singer);
        }
        System.out.println("앨범 단위 추가 완료");
        System.out.printf("추가로 입력 가능한 곡 개수 : %d%n", (120 - songCount));
        System.out.println("추가를 종료합니다.");


    }

    private void addSong() {
        System.out.print("입력할 곡 개수:");
        int count = 0;

        boolean isValid = false; //

        while (!isValid) {
            count = Integer.parseInt(sc.nextLine());
            if (count >= 1) {
                if (songCount + count > songs.length) {
                    System.out.println("저장공간이 가득 차서 더이상 추가할 수 없습니다");
                    System.out.printf("0보다 크고 %d과 같거나 작은 숫자를 입력하세요.%n", 120 - songCount);
                } else {
                    System.out.printf("%d개 곡 추가를 하겠습니다%n", count);
                    isValid = true;
                }
            } else {
                System.out.println("1 미만의 값을 입력하였습니다.");
                System.out.printf("1이상 %d 이하의 정상 범위 내에 숫자를 입력하세요.", 120 - songCount);
            }

        }
        for (int i = 0; i < count; i++) {
            System.out.println("앨범명 / 곡명 / 장르 / 가수명 순서로 입력");
            System.out.print("앨범명 : ");
            String album = sc.nextLine();

            System.out.print("곡명 :");
            String songName = sc.nextLine();

            System.out.print("장르 : ");
            String genre = sc.nextLine();

            System.out.print("가수명 : ");
            String singer = sc.nextLine();


            songs[songCount++] = new Song(album, songName, genre, singer);
            System.out.printf("%d번 곡 추가 완료%n", (i + 1));
        }
        System.out.printf("추가로 입력 가능한 곡 개수 : %d%n", (120 - songCount));


    }

    public void editMusic() {
        if (songCount == 0) {
            System.out.print("수정할 곡이 없습니다\n입력 후에 시도하세요.");
            return;
        }

        System.out.print("수정할 곡명을 입력하세요:");
        String editSong = sc.nextLine();

        System.out.print("입력한 곡명의 앨범명을 입력하세요:");
        String editAlbum = sc.nextLine();


        int editIndex = findSongIndex(editAlbum, editSong);
        if(editIndex == -1){
            System.out.println("존재 하지 않는 곡명, 앨범명입니다. 수정을 종료합니다.");
            return;
        }

        System.out.println("앨범명 / 곡명 / 장르 / 가수명 순서로 입력");
        System.out.print("앨범명 : ");
        String album = sc.nextLine();

        System.out.print("곡명 :");
        String songName = sc.nextLine();

        System.out.print("장르 : ");
        String genre = sc.nextLine();

        System.out.print("가수명 : ");
        String singer = sc.nextLine();

        songs[editIndex].updateInfo(album, songName, genre, singer);
        System.out.print("수정이 완료되었습니다\n 수정을 종료합니다");


    }

    public void deleteMusic() {
        if (songCount == 0) {
            System.out.print("삭제할 곡이 없습니다\n입력 후에 시도하세요.");
            return;

        }
        String deleteSongs = "";
        String deleteAlbum = "";

            System.out.print("삭제할 곡명을 입력하세요:");
            deleteSongs = sc.nextLine();

            System.out.print("삭제할 곡명의 앨범명을 입력하세요:");
            deleteAlbum = sc.nextLine();

            int deleteIdx = findSongIndex(deleteAlbum, deleteSongs);
            if(deleteIdx == -1){
                System.out.println("존재하지 않는 곡명과 앨범명 입니다.");
                return;
            }
            removeSong(deleteIdx);
    }

    private void removeSong(int deleteIdx){
        /*삭제된 부분을 제외하고 index 한칸씩 앞으로 덮어씌우기*/
        for (int i = deleteIdx; i < songCount - 1; i++) {
            songs[i] = songs[i + 1];
        }
        /*마지막 index 부분 하나씩 앞으로 덮어씌웠으므로 원래 마지막 index 객체 지우기*/
        songs[songCount - 1] = null;
        songCount--; // index 하나를 삭제했으니 전체 index 하나 감소
        System.out.println("삭제가 완료되었습니다.");
    }

    public void searchMenu() {
        if (songCount == 0) {
            System.out.print("조회할 곡이 없습니다\n입력 후에 시도하세요.");
            return;
        }
        System.out.println("1.전체 2.장르 3 가수 4.앨범");
        int searchNum = isValidRangeNumber(1,4);

        switch (searchNum) {
            case 1 -> {
                for (int i = 0; i < songCount; i++) {
                    System.out.println(songs[i].showInfo());
                }
            }
            case 2 -> {
                System.out.print("조회할 장르 :");
                String searchGenre = sc.nextLine();

                boolean found = false;

                for (int i = 0; i < songCount; i++) {
                    if (songs[i].getGenre().equals(searchGenre)) {
                        System.out.println(songs[i].showInfo());
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("해당 장르의 곡이 없습니다.");
                }
            }
            case 3 -> {
                System.out.print("조회할 가수 :");
                String searchSinger = sc.nextLine();
                boolean found = false;
                for (int i = 0; i < songCount; i++) {
                    if (songs[i].getSinger().equals(searchSinger)) {
                        System.out.println(songs[i].showInfo());
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("해당 가수명의 곡이 없습니다.");
                }
            }
            case 4 -> {
                System.out.print("조회할 앨범 :");
                String searchAlbum = sc.nextLine();

                boolean found = false;
                for (int i = 0; i < songCount; i++) {
                    if (songs[i].getAlbumName().equals(searchAlbum)) {
                        System.out.println(songs[i].showInfo());
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("해당 앨범의 곡이 없습니다.");
                }
            }
            default -> {
                System.out.println("잘못된 조회 메뉴 입력입니다.");
                System.out.println("조회를 종료합니다");
                return;
            }
        }
    }


}
