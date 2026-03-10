package com.d0309.practice;

public class QuestionHard04 {
    public static void main(String[] args) {
        //4) char 2차원배열(5*5)  배열을 만들고 배열의  테두리 요소에   '*' 넣기

        char[][] arr = new char[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                //i가 0 or 5 or j가 0 or 5일때 * 찍기
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = '*';
                } else {
                    arr[i][j] = ' ';
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
