package com.d0313.practice.musicPlayList03;

/*프로그램 실행 클래스
* main() 메서드에서 Playlist 객체를 생성
* 사용자에게 메뉴를 보여주고 선택하게 한다.
* 메뉴(추가, 삭제, 수정, 조회)를 Playlist 객체에 요청*/

public class PlaylistMain {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        System.out.println("=== \t플레이리스트\t===");

        /*사용자가 5번 종료를 입력하기 전까지 계속 반복 */
        loop:
        while (true) {
            System.out.println("1.추가 / 2.삭제 / 3.수정 / 4.조회 / 5.종료");
            /*
            숫자 입력 검증 : method 내부에서 처리(숫자 입력 범위에 대한 입력검증)
            문자 입력 검증 : try-catch로 확장 가능(미학습)
            */

            int menu = playlist.selectMenu();
            switch (menu) {
                case 1 -> {
                    System.out.println("===\t      추가    \t===");
                    playlist.addMenu();
                }
                case 2 -> {
                    System.out.println("===\t      삭제    \t===");
                    playlist.deleteMusic();
                }
                case 3 -> {
                    System.out.println("===\t      수정    \t===");
                    playlist.editMusic();
                }
                case 4 -> {
                    System.out.println("===\t      조회    \t===");
                    playlist.searchMenu();
                }
                case 5 -> {
                    System.out.println("===\t      종료    \t===");
                    break loop;
                }
            }
        }
    }
}
