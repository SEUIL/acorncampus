package com.d0306;

import java.util.Scanner;

public class OperatorValidator {
    /*
      연산자를 입력받아
      "+", "-", "*", "/", "%", "=", "<", ">", "!", "&&", "||"
      (해당되면 연산자이다, 연산자가 아니다 출력) 연산자
      여부를 출력하는 프로그램을 작성하시오
    */

    private final Scanner scanner;

    public OperatorValidator() {
        scanner = new Scanner(System.in);
        run();
    }

    public void run(){
        System.out.print("연산자를 입력하시오 : ");
        String input = scanner.nextLine();

        if (isOperator(input)) {
            System.out.println("연산자입니다.");
        } else {
            System.out.println("연산자가 아닙니다.");
        }
    }

    private boolean isOperator(String input) {
        String[] operators = {"+", "-", "*", "/", "%", "=", "<", ">", "!", "&&", "||"};
        for (String op : operators) {
            if (op.equals(input)) {
                return true;
            }
        }
        return false;

    }

}
