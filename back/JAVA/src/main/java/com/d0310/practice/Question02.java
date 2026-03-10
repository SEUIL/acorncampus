package com.d0310.practice;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        // 1) 사원명과  출장비가 입력되면  화폐매수를 출력하는 프로그램을 작성하시오  (배열 사용 안하는거,  배열사용 하는 거)
        // 2) stop 입력될 때 까지  사원명과 출장비가 입력되면 화폐매수를 출력하는 프로그램 작성하시오
        // 3) 2과 동일하고 반복이 종료되면 각 화폐별 매수를 출력하는 프로그램을 작성하시오

        Scanner sc = new Scanner(System.in);

        int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        int[] totalCounts = new int[units.length];

        while (true) {
            System.out.print("사원명 (종료: stop): ");
            String name = sc.next();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.print("출장비: ");
            int tempMoney = sc.nextInt();

            System.out.println("[" + name + " 사원의 화폐 매수]");
            for (int i = 0; i < units.length; i++) {
                int count = tempMoney / units[i];
                System.out.println(units[i] + "원: " + count + "매");
                totalCounts[i] += count;
                tempMoney %= units[i];
            }
            System.out.println("---------------------------");
        }

        System.out.println("\n[전체 화폐별 총 매수]");
        for (int i = 0; i < units.length; i++) {
            System.out.println(units[i] + "원 권: 총 " + totalCounts[i] + "매");
        }
        sc.close();

    }
}
