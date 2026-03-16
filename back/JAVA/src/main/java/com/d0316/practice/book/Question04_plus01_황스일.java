package com.d0316.practice.book;

import java.util.Scanner;

public class Question04_plus01_황스일 {
    //4.  접근제어자 관련 예제 만들기  ( private, public , default )
    static class Book {
        private String title;  // private
        String author;         // default
        public int price;      // public

        public Book(String title, String author, int price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        // private 필드인 title을 외부에서 읽을 수 있도록 제공하는 public 메서드 (Getter)
        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return "제목: " + title + ", 저자: " + author + ", 가격: " + price + "원";
        }
    }

    // 추가문제
    // 1. 메뉴를 제공하여 객체배열에  (책)정보를 저장하고 출력하기  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] bookList = new Book[10]; // 책 정보를 최대 10개까지 저장할 수 있는 객체 배열
        int bookCount = 0; // 현재 저장된 책의 개수

        while (true) {
            System.out.println("\n========== 책 관리 프로그램 ==========");
            System.out.println("1. 책 정보 저장하기");
            System.out.println("2. 책 정보 출력하기");
            System.out.println("3. 프로그램 종료");
            System.out.print("메뉴를 선택하세요 (1~3): ");
            
            int menu = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼 비우기 (엔터키 처리)

            if (menu == 1) {
                if (bookCount >= bookList.length) {
                    System.out.println("더 이상 책을 저장할 수 없습니다. (최대 10권)");
                    continue;
                }
                System.out.print("책 제목을 입력하세요: ");
                String title = scanner.nextLine();
                
                System.out.print("저자를 입력하세요: ");
                String author = scanner.nextLine();
                
                System.out.print("가격을 입력하세요: ");
                int price = scanner.nextInt();
                
                bookList[bookCount] = new Book(title, author, price);
                bookCount++;
                System.out.println("책 정보가 정상적으로 저장되었습니다!");
            } else if (menu == 2) {
                System.out.println("\n========== 저장된 책 목록 ==========");
                if (bookCount == 0) {
                    System.out.println("저장된 책 정보가 없습니다.");
                } else {
                    for (int i = 0; i < bookCount; i++) {
                        System.out.println((i + 1) + ". " + bookList[i].toString());
                    }
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 1에서 3 사이의 숫자를 입력해주세요.");
            }
        }
        scanner.close();
    }
}
