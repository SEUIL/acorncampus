package com.d0309.practice;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionHard01 {
    public static void main(String[] args) {
        // ( 배열의 크기는 10으로 한다 , 수는 10개 이내로 입력 )
        //         1)   수가 입력될 때  짝수만 배열에 담고 출력하기   (0이 입력되면 종료)
        Scanner sc = new Scanner(System.in);

        int[] index = new int[10];

        int count = 0;

        while (count < 10) {
            System.out.print("수를 입력 (0이 입력되면 종료): ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                index[count] = num;
                count++;
            }
        }

        System.out.print("입력된 값중 짝수값:");
        for (int i = 0; i < count; i++) {
            System.out.print(index[i] + " ");
        }
        System.out.println();

    }
}
