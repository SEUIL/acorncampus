package com.d0306.teamProj;

public class TotalSum {

    /*
    * 1~99까지의 합 구하기
    * */

    public static void main(String[] args){

        int sum = 0;
        int N = 0;

        for (N = 0; N < 100; N = N + 1){
            if (N/2 != 0){
                sum = sum + N;
            }
        }
        System.out.println(sum);

    }

}
