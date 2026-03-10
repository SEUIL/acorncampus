package com.d0309.progress;

public class Array01Double {
    public static void main(String[] args){
        //실수형 데이터 5개 배열 사용해서 출력
        //double 배열은 기본값으로 초기화
        //double형의 기본값은 0.0
        double[] doubles = new double[5];

        //실수형 데이터 5개 배열 선언 및 초기화
        double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5};

        //1. 출력
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //2. 반복문 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 배열 선언 및 초기화
        double[] scores = new double[]{90.5, 88.2, 76.4};

        //출력
        for (double score : scores) {
            System.out.println("점수: " + score);
        }

        //배열 선언 및 초기화
        double[] temperatures = new double[3];
        temperatures[0] = 36.5;
        temperatures[1] = 37.2;
        temperatures[2] = 35.8;

        //출력
        for (int i = 0; i < temperatures.length; i++) {
            System.out.printf("체온 %d: %.1f\n", (i + 1), temperatures[i]);
        }


    }
}
