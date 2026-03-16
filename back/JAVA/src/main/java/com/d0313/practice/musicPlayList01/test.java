package com.d0313.practice.musicPlayList01;

public class test {
    public static void main(String[] args) {
        MusicPlayList playList = new MusicPlayList();

        // 1. 추가
        playList.addMusic("Hype Boy", "NewJeans", "K-POP", "New Jeans 1st EP");
        playList.addMusic("Attention", "NewJeans", "K-POP", "New Jeans 1st EP");
        playList.addMusic("Ditto", "NewJeans", "K-POP", "OMG");
        playList.addMusic("Dynamite", "BTS", "Pop", "BE");

        // 4. 전체 조회
        playList.printAll();

        // 2. 수정
        playList.updateMusic("Dynamite", "Butter", "K-POP");

        // 3. 삭제 (음악 단위)
        playList.deleteMusic("Hype Boy");

        // 3. 삭제 (앨범 단위) - "New Jeans 1st EP" 앨범의 남은 곡(Attention) 삭제됨
        playList.deleteAlbum("New Jeans 1st EP");

        playList.printAll();
    }
}
