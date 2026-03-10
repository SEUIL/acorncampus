package com.d0306;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderInfo {
    /*주문수량, 메뉴를 입력받아
    해당 주문의 주문금액을 출력하는 프로그램 작성하시오*/

    private final Scanner scanner;
    private final ArrayList<Menu> menus = new ArrayList<>();
    private static long nextId = 1;

    private static class Menu {
        long id;
        String name;
        int price;

        public Menu(String name, int price) {
            this.id = nextId++;
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return " " + id + ". " + name + " - " + price + "원";
        }
    }

    public OrderInfo(){
        scanner = new Scanner(System.in);

        //DB
        menus.add(new Menu("아메리카노", 2000));
        menus.add(new Menu("카페라떼", 2900));
        menus.add(new Menu("에이드", 4000));
        menus.add(new Menu("스무디", 4500));
        menus.add(new Menu("메가리카노", 3300));
        menus.add(new Menu("할메가커피", 2100));
        menus.add(new Menu("할메가미숫커피", 2900));

    }

    public void run(){
        System.out.println("주문 프로그램을 실행합니다.");
        while (true) {
            System.out.println("------------------------");
            System.out.print("1.메뉴 조회 2.메뉴 선택 3.종료 : ");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.println("--------메뉴 조회---------");
                printAllMenus();
            }else if (input.equals("2")) {
                System.out.println("--------메뉴 선택---------");
                printAllMenus();
                System.out.print("메뉴의 번호를 입력하시오 : ");
                long id = scanner.nextLong();
                System.out.print("수량을 입력하시오 : ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // 버퍼 비우기

                try {
                    int price = calculateMenu(id, quantity);
                    System.out.println("가격은 " + price + "원 입니다.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    //메뉴 조회
    private void printAllMenus() {
        for (Menu menu : menus){
            System.out.println(menu); //오버라이딩 된 toString() 호출
        }
    }

    //메뉴 선택 및 계산
    private int calculateMenu(long id, int quantity){
        for (Menu menu : menus){
            if (menu.id == id){
                return menu.price * quantity;
            }
        }
        throw new IllegalArgumentException("오류: 존재하지 않는 메뉴 번호(" + id + ")입니다.");
    }
}
