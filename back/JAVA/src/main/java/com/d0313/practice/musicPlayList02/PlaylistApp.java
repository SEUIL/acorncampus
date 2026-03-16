package com.d0313.practice.musicPlayList02;

import java.util.*;

public class PlaylistApp {
    // 공통으로 사용할 리스트와 스캐너
    static ArrayList<Music> playlist = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- 멜론(?) 부럽지 않은 플레이리스트 ---");
            System.out.println("1.추가 2.수정 3.삭제 4.조회 5.종료");
            int menu = Integer.parseInt(scanner.nextLine()); // 숫자 입력 오류 방지

            if (menu == 1) addMenu();
            else if (menu == 2) editMenu();
            else if (menu == 3) deleteMenu();
            else if (menu == 4) searchMenu();
            else if (menu == 5) break;
            else System.out.println("잘못된 입력입니다.");
        }
    }

    // --- [1. 추가 관련 함수] ---
    private static void addMenu() {
        System.out.print("1.곡 단위 2.앨범 단위: ");
        int type = Integer.parseInt(scanner.nextLine());
        if (type == 1) {
            System.out.print("제목/가수/앨범/장르(순서대로 입력): ");
            playlist.add(new Music(scanner.next(), scanner.next(), scanner.next(), scanner.next()));
            scanner.nextLine(); // 버퍼 비우기
        } else {
            addAlbum();
        }
    }

    private static void addAlbum() {
        System.out.print("앨범명: ");
        String album = scanner.nextLine();
        System.out.print("추가할 곡 수: ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번 곡 제목/가수/장르: ");
            playlist.add(new Music(scanner.next(), scanner.next(), album, scanner.next()));
            scanner.nextLine();
        }
    }

    // --- [2. 수정 관련 함수] ---
    private static void editMenu() {
        System.out.print("수정할 곡 제목 입력: ");
        String title = scanner.nextLine();
        for (Music m : playlist) {
            if (m.title.equals(title)) {
                System.out.print("새 곡 이름: ");
                m.title = scanner.nextLine();
                System.out.print("새 장르 이름: ");
                m.genre = scanner.nextLine();
                System.out.println("수정 완료!");
                return;
            }
        }
        System.out.println("곡을 찾을 수 없습니다.");
    }

    // --- [3. 삭제 관련 함수] ---
    private static void deleteMenu() {
        System.out.print("1.곡 삭제 2.앨범 삭제: ");
        int type = Integer.parseInt(scanner.nextLine());
        if (type == 1) {
            System.out.print("삭제할 곡 제목: ");
            String title = scanner.nextLine();
            playlist.removeIf(m -> m.title.equals(title));
        } else {
            System.out.print("삭제할 앨범 이름: ");
            String album = scanner.nextLine();
            playlist.removeIf(m -> m.album.equals(album));
        }
        System.out.println("삭제 처리가 완료되었습니다.");
    }

    // --- [4. 조회 관련 함수] ---
    private static void searchMenu() {
        System.out.println("1.전체 2.장르 3.가수 4.앨범");
        int type = Integer.parseInt(scanner.nextLine());

        if (type == 1) {
            for (Music musics : playlist){
                musics.showInfo();
            }
        } else if (type == 2) {
            System.out.print("조회할 장르: ");
            String genre = scanner.nextLine();
            for (Music musics : playlist) {
                if (musics.genre.equals(genre)) {
                    musics.showInfo();
                }
            }
        } else if (type == 3) {
            System.out.print("조회할 가수: ");
            String artist = scanner.nextLine();
            for (Music m : playlist) if (m.artist.equals(artist)) m.showInfo();
        } else if (type == 4) {
            System.out.print("조회할 앨범: ");
            String album = scanner.nextLine();
            for (Music m : playlist) if (m.album.equals(album)) m.showInfo();
        }
    }
}