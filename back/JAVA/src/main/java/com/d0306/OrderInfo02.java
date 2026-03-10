package com.d0306;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderInfo02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- 메뉴판 ---");
        System.out.println("1. 아메리카노 (3000원)");
        System.out.println("2. 카페라떼 (3500원)");
        System.out.println("3. 에이드 (4000원)");

        System.out.print("원하시는 메뉴 번호를 입력하세요: ");
        int choice = sc.nextInt();

        System.out.print("수량을 입력하세요: ");
        int count = sc.nextInt();

        int price = 0;

        switch (choice) {
            case 1:
                price = 3000;
                break;
            case 2:
                price = 3500;
                break;
            case 3:
                price = 4000;
                break;
            default:
                System.out.println("잘못된 번호를 선택하셨습니다.");
        }

        if (price > 0) {
            int totalAmount = price * count;
            System.out.println("주문 금액은 총 " + totalAmount + "원입니다.");
        }
    }


}
