package com.d0316.practice.objectStaticPractice;

public class ObjectMethodPractice {

    // 인스턴스 변수 (객체 변수)
    int instanceVariable = 10;

    // static 변수 (클래스 변수)
    static int staticVariable = 20;

    // -객체매서드
    public void instanceMethod() {
        System.out.println("인스턴스 메서드 호출");
        System.out.println("인스턴스 변수 접근: " + instanceVariable);
        System.out.println("static 변수도 접근 가능: " + staticVariable);
    }

    // -static 메서드
    public static void staticMethod() {
        System.out.println("static 메서드 호출");
        // System.out.println("인스턴스 변수 접근 불가: " + instanceVariable); // 컴파일 에러
        System.out.println("static 변수 접근: " + staticVariable);
    }

    public static void main(String[] args) {
        // 1. static 메서드 호출
        // 객체 생성 없이 클래스 이름으로 직접 호출 가능
        ObjectMethodPractice.staticMethod();

        System.out.println("-------------------------");

        // 2. 객체 생성 및 인스턴스 메서드 호출
        // 반드시 객체를 생성한 후 호출해야 함
        ObjectMethodPractice obj = new ObjectMethodPractice();
        obj.instanceMethod();
    }
}
