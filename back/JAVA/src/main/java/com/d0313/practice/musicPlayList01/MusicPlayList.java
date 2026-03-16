package com.d0313.practice.musicPlayList01;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayList {

    private final List<Album> album = new ArrayList<>();
    // 아래 정의된 Album 정적 클래스의 인스턴스들을 저장하는 리스트

    // 1. 추가하기 (음악 단위)
    public void addMusic(String music, String singerName, String genre, String albumName) {
        album.add(new Album(music, singerName, genre, albumName));
        System.out.println("♪ 음악 추가됨: " + music);
    }

    // 1. 추가하기 (앨범 단위 - 여러 곡을 한 번에)
    public void addAlbumBatch(List<Album> albumList) {
        for (int i = 0; i < albumList.size(); i++) {
            album.add(albumList.get(i));
        }
        System.out.println("♪ 앨범(여러 곡) 추가 완료");
    }

    // 2. 수정 (음악 이름으로 찾아서 수정)
    public void updateMusic(String oldName, String newName, String newGenre) {
        for (int i = 0; i < album.size(); i++) {
            Album item = album.get(i);
            if (item.getMusic().equals(oldName)) {
                item.setMusic(newName);
                item.setGenre(newGenre);
                System.out.println("! 수정 완료: " + oldName + " -> " + newName);
                return;
            }
        }
        System.out.println("! 수정 실패: 해당 곡을 찾을 수 없습니다.");
    }

    // 3. 삭제하기 (음악 단위 - 제목으로 삭제)
    public void deleteMusic(String musicName) {
        for (int i = 0; i < album.size(); i++) {
            if (album.get(i).getMusic().equals(musicName)) {
                album.remove(i);
                System.out.println("- 삭제 완료: " + musicName);
                return;
            }
        }
    }

    // 3. 삭제하기 (앨범 단위 - 앨범명이 같은 모든 곡 삭제)
    public void deleteAlbum(String albumName) {
        // 리스트 삭제 시 인덱스 오류를 방지하기 위해 뒤에서부터 반복
        int count = 0;
        for (int i = album.size() - 1; i >= 0; i--) {
            if (album.get(i).albumName.equals(albumName)) {
                album.remove(i);
                count++;
            }
        }
        System.out.println("- 앨범 삭제 완료: " + albumName + " (" + count + "곡 삭제됨)");
    }

    // 4. 조회하기 (전체, 가수별, 장르별)
    public void printAll() {
        System.out.println("=== 전체 재생 목록 ===");
        for (int i = 0; i < album.size(); i++) {
            album.get(i).printInfo();
        }
    }

    public void searchBySinger(String singer) {
        System.out.println("=== 가수 검색: " + singer + " ===");
        for (int i = 0; i < album.size(); i++) {
            if (album.get(i).singerName.equals(singer)) {
                album.get(i).printInfo();
            }
        }
    }


}
