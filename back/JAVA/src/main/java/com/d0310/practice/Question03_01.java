package com.d0310.practice;

import java.util.Scanner;

public class Question03_01 {
    // 2. 일정관리프로그램
    // 하루일정은 5개 이내로 한다.
    // 1)  하루일정을 관리하는 프로그램 작성하기 (일차원배열 사용하기)
    // 2) 일주일 일정을 관리하는 프로그램 작성하기 (2차원배열 사용하기 )

    public static void main(String[] args) {

        // 1) 하루일정을 관리하는 프로그램 (일차원배열)
        String[] dailySchedule = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < dailySchedule.length; i++){
            System.out.print((i+1) + "번 일정을 입력하세요 : ");

            String input = scanner.nextLine();
            dailySchedule[i] = input;
        }

        System.out.println("--- 하루 일정 ---");
        for (int i = 0; i < dailySchedule.length; i++) {
            if (dailySchedule[i] != null) {
                System.out.println((i + 1) + ". " + dailySchedule[i]);
            }
        }

        System.out.println();


    }
}

