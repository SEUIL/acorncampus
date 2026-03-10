package com.d0310.practice;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        // 1.화폐매수 구하기  문제
        // : 사원명과  출장비가 입력될 때  출장비에 대한 화폐매수 (고액권부터)를 구하시오
        //   화폐단위는 다음과 같다  50000,10000,5000,1000,500,100, 50,10
        //
        // ex)
        //   361200  - > 오만원: 7   만원:1  , 오천원: 0 , 천원: 1, 오백원: 0 , 백원: 2 , 오십원: 0 , 십원 :0

        Scanner sc = new Scanner(System.in);
        String name = "홍길동";

        System.out.print("금액을 입력 : ");
        int money = sc.nextInt();
        int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        System.out.println("사원명: " + name);
        System.out.println("출장비: " + money);

        for (int unit : units) {
            int count = money / unit;
            money %= unit;

            String unitName = switch (unit) {
                case 50000 -> "오만원";
                case 10000 -> "만원";
                case 5000 -> "오천원";
                case 1000 -> "천원";
                case 500 -> "오백원";
                case 100 -> "백원";
                case 50 -> "오십원";
                case 10 -> "십원";
                default -> "";
            };
            System.out.print(unitName + ": " + count + "  ");
        }
        System.out.println();


    }
}
