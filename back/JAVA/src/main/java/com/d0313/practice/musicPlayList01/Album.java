package com.d0313.practice.musicPlayList01;


public class Album {
    // 필드 접근 제어자를 private으로 변경하고 Getter/Setter 사용 권장
    private String music;
    String singerName;
    private String genre;
    String albumName; // 앨범 단위 관리를 위한 필드 추가

    public Album(String music, String singerName, String genre, String albumName) {
        this.music = music;
        this.singerName = singerName;
        this.genre = genre;
        this.albumName = albumName;
    }

    // 수정 기능을 위한 Setter
    public void setMusic(String music) {
        this.music = music;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // 조회 기능을 위한 Getter
    public String getMusic() {
        return music;
    }

    // 정보 출력 메서드 (Override 없이 구현)
    public void printInfo() {
        // String.format 등을 안 배웠다면 + 연산자 사용
        System.out.println("곡명: " + music + " | 가수: " + singerName +
                " | 장르: " + genre + " | 앨범: " + albumName);
    }
}
