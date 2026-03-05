package com.d0305;

import java.util.Scanner;

public class ConditionalGugudan {

    /*
    * 조건부 구구단
    * */

    private final Scanner scanner;

    public ConditionalGugudan() {
        this.scanner = new Scanner(System.in);
        run();
    }

    private void run() {
        System.out.print("숫자를 하나 입력하시오 : ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j <= num){
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
            }
        }

    }
}
