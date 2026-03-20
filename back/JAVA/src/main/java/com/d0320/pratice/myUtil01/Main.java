package com.d0320.pratice.myUtil01;

public class Main {
    public static void main(String[] args) {
        MyUtil_황스일 util = new MyUtil_황스일();
        
        System.out.println("=== 1. 익명 클래스를 사용하는 전통적인 방법 ===");
        util.runThreeTimes(new Runnable() {
            @Override
            public void run() {
                System.out.println("안녕하세요! 익명 클래스입니다.");
            }
        });
        
        System.out.println("=== 2. 람다식(Lambda Expression)을 사용하는 깔끔한 방법 ===");
        // 자바 8 이상부터는 람다식을 통해 아래처럼 코드를 아주 간결하게 전달할 수 있습니다.
        // 괄호 ()는 매개변수가 없음을 의미하고, -> 뒤의 코드가 실행될 내용입니다.
        util.runThreeTimes(() -> System.out.println("반갑습니다! 람다식입니다."));
    }
}