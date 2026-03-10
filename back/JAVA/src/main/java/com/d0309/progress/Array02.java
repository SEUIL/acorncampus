package com.d0309.progress;

import java.util.Random;

public class Array02 {

    //2차원 배열 실습
    public static void main(String[] args) {

        String[][] menu = {
            {"김밥", "라면", "떡볶이"},
            {"짜장면", "짬뽕", "탕수육"},
            {"치킨", "피자", "햄버거"}
        };

        Random random = new Random();

        // 랜덤 인덱스 추출
        int row = random.nextInt(menu.length);
        int col = random.nextInt(menu[row].length);

        System.out.println("오늘의 추천 메뉴: " + menu[row][col]);
    }

}
