package com.d0310.practice;

import java.util.Scanner;

public class Question03_02 {
    // 2. 일정관리프로그램
    // 하루일정은 5개 이내로 한다.
    // 1)  하루일정을 관리하는 프로그램 작성하기     (일차원배열 사용하기)
    // 2) 일주일 일정을 관리하는 프로그램 작성하기 (2차원배열 사용하기 )

    public static void main(String[] args) {
        // 2) 일주일 일정을 관리하는 프로그램 (2차원배열)
        // 행: 요일(7일), 열: 일정(최대 5개)

        String[][] weeklySchedule = new String[7][5];
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        Scanner scanner = new Scanner(System.in);

        // 직접 데이터 입력 받기
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + "요일 일정을 입력하세요 (최대 5개, '종료' 입력 시 다음 요일로)");
            for (int j = 0; j < 5; j++) {
                System.out.print((j + 1) + "번째 일정: ");
                String input = scanner.nextLine();

                if (input.equals("종료")) {
                    break;
                }

                weeklySchedule[i][j] = input;
            }
            System.out.println();
        }
        scanner.close();

        System.out.println("--- 일주일 일정 ---");
        for (int i = 0; i < weeklySchedule.length; i++) {
            System.out.print(days[i] + "요일: ");
            boolean hasSchedule = false;
            for (int j = 0; j < weeklySchedule[i].length; j++) {
                if (weeklySchedule[i][j] != null) {
                    System.out.print("[" + weeklySchedule[i][j] + "] ");
                    hasSchedule = true;
                }
            }
            if (!hasSchedule) {
                System.out.print("일정 없음");
            }
            System.out.println();
        }
    }
}
