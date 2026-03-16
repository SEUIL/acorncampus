package com.d0316.practice.book;

class Book {
    // 필드 정의
    private String title;
    private String author;
    private int price;

    // 1. 생성자를 이용하여 책정보 저장하기
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 1. toString 메서드를 이용하여 정보 출력하기 좋게 재정의(Override)
    @Override
    public String toString() {
        return "Book [제목: " + title + ", 저자: " + author + ", 가격: " + price + "원]";
    }
}

public class Question01_02_03_황스일 {
    public static void main(String[] args) {
        // 2. 책정보 객체 3개를 만들고 출력하기
        System.out.println("=== 2. 개별 객체 생성 및 출력 ===");
        Book book1 = new Book("자바의 정석", "남궁성", 30000);
        Book book2 = new Book("클린 코드", "로버트 C. 마틴", 33000);
        Book book3 = new Book("이펙티브 자바", "조슈아 블로크", 36000);

        System.out.println(book1.toString());
        System.out.println(book2); // 출력문에 객체를 넣으면 자동으로 toString()이 호출됩니다.
        System.out.println(book3);

        // 3. 책정보 3개를 객체 배열로 만들고 출력하기
        System.out.println("\n=== 3. 객체 배열 생성 및 출력 ===");
        Book[] bookArr = new Book[3];
        bookArr[0] = book1;
        bookArr[1] = book2;
        bookArr[2] = book3;

        for (int i = 0; i < bookArr.length; i++) {
            System.out.println((i + 1) + "번째 책: " + bookArr[i]);
        }
    }
}
