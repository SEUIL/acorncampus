package com.d0309.practice;

public class QuestionHard03 {

    public static void main(String[] args) {
        // ( 배열의 크기는 10으로 한다 , 수는 10개 이내로 입력 )
        //3)   임의의 수가 입력되고  입력한 수에 대한 약수를 배열에 저장하고 출력하기
        //        - 배열사용하지 않기
        //        - 배열을 사용하여 약수를 모두 구한 후 한꺼번에 출력하기

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("임의의 수를 입력하세요: ");
        int num = scanner.nextInt();

        // 1. 배열 사용하지 않고 약수 출력하기
        System.out.print("배열 미사용 약수: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 2. 배열을 사용하여 약수를 모두 구한 후 한꺼번에 출력하기
        int[] divisors = new int[10];
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (count < 10) {
                    divisors[count] = i;
                    count++;
                } else {
                    break; // 배열 크기 10을 초과하면 중단
                }
            }
        }

        System.out.print("배열 사용 약수: ");
        for (int i = 0; i < count; i++) {
            System.out.print(divisors[i] + " ");
        }
        System.out.println();

        scanner.close();

    }
}
