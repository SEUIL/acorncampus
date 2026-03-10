package com.d0309.practice;

public class QuestionHard02 {
    public static void main(String[] args) {
        // ( 배열의 크기는 10으로 한다 , 수는 10개 이내로 입력 )
        //2)   배열의 평균값보다 큰 요소의 개수 구하기
        //         int[]  Temperatures  =  { 33 ,35,32 ,35  ,36 ,35 ,34  }  ;

        int[] temperatures = {33, 35, 32, 35, 36, 35, 34};
        int sum = 0;

        for (int temp : temperatures) {
            sum += temp;
        }

        double average = (double) sum / temperatures.length;
        int count = 0;

        for (int temp : temperatures) {
            if (temp > average) {
                count++;
            }
        }

        System.out.println("평균: " + average);
        System.out.println("평균보다 큰 요소의 개수: " + count);

    }
}
