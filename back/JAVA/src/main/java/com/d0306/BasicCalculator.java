package com.d0306;

import java.util.Scanner;

public class BasicCalculator {
    /*
    * 연산자와 두 수가 입력되면  사칙연산하는 프로그램을 작성하시오
     * */

    private final Scanner scanner;

    public BasicCalculator(){
        scanner = new Scanner(System.in);
        run();
    }

    public void run(){
        System.out.print("연산자(+, -, *, /)와 두 수를 입력하세요 (예: + 10 20): ");
        String operator = scanner.next();
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double result = calculate(operator, num1, num2);
        System.out.println("결과: " + result);
    }

    private double calculate(String operator, double n1, double n2) {
        double res = 0;
        switch (operator) {
            case "+":
                res = n1 + n2;
                break;
            case "-":
                res = n1 - n2;
                break;
            case "*":
                res = n1 * n2;
                break;
            case "/":
                if (n2 != 0) res = n1 / n2;
                else System.out.println("0으로 나눌 수 없습니다.");
                break;
        }
        return res;
    }
}
