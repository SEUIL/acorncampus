package com.d0312.progress;

import com.d0312.progress.MyMathLib;

public class TestLib {

    public static void main(String[] args){
        System.out.println("--- 라이브러리 테스트 시작 ---\n");

        MyMathLib myMathLib = new MyMathLib();

        // 1. 약수 구하기 라이브러리 사용
        int num = 20;
        String divisors = MyMathLib.getDivisors(num);
        System.out.println(divisors);

        System.out.println();

        // 2. 화폐 매수 구하기 라이브러리 사용
        int money = 158760;
        MyMathLib.printCurrencyCount(money);

        System.out.println("\n3. Max 기능 테스트: " + MyMathLib.max(100, 255));
    }

}
