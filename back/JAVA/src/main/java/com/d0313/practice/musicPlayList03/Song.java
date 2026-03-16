package com.d0313.practice.musicPlayList03;

/*
* 노래 1개를 표현하는 데이터 클래스
* - 앨범명, 곡명, 장르, 가수명의 정보 저장
* - Playlist는 Song 객체를 여러 개 저장해서 플레이리스트 구현
* */

public class Song {
    private String albumName;   // 앨범명
    private String songName;    // 곡명
    private String genre;       // 장르
    private String singer;      // 가수명

    /*Song 객체 생성자
    * - 노래 1개를 만들 때에 기본 정보를 초기화
    * - 객체를 생성하는 순간 사용 가능하도록 한다.(객체 존재 x-> method 호출 x)*/
    public Song(String albumName, String songName,  String genre, String singer){
        this.albumName = albumName;
        this.songName = songName;
        this.genre = genre;
        this.singer = singer;
    }

    // 외부에서 private 필드에 접근할 수 없으므로 getter로 값을 읽어옴
    public String getAlbumName(){
        return this.albumName;
    }
    public String getSongName(){
        return this.songName;
    }
    public String getGenre(){
        return this.genre;
    }
    public String getSinger(){
        return this.singer;
    }

    /*
    Song 객체 내부의 정보를 한번에 수정하는 method(setter 대체)
    Playlist 객체의 수정 기능에서 특정 Song 객체의 상태를 변경할 때 사용
    */
    public void updateInfo(String albumName, String songName, String genre, String singer){
        this.albumName = albumName;
        this.songName = songName;
        this.genre = genre;
        this.singer = singer;
    }

    /*Playlist 객체의 조회 기능에서 출력용으로 사용*/
    public String showInfo() {
        return "앨범 : " + albumName + ", 곡명 : " + songName +
                ", 장르 : " + genre + ", 가수 : " + singer;
    }
}

