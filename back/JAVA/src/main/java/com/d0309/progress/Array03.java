package com.d0309.progress;

public class Array03 {
    public static void main(String[] args){

        // int형 2차원 배열 사용해서 로또 번호 출력 시스템 만들기

        int[][] lotto = new int[5][6];

        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto[i].length; j++) {
                lotto[i][j] = (int) (Math.random() * 45) + 1;

                // 중복 제거
                for (int k = 0; k < j; k++) {
                    if (lotto[i][j] == lotto[i][k]) {
                        j--;
                        break;
                    }
                }
            }

            // 정렬 (선택 정렬)
            for (int j = 0; j < lotto[i].length - 1; j++) {
                for (int k = j + 1; k < lotto[i].length; k++) {
                    if (lotto[i][j] > lotto[i][k]) {
                        int temp = lotto[i][j];
                        lotto[i][j] = lotto[i][k];
                        lotto[i][k] = temp;
                    }
                }
            }
        }

        // 출력
        for (int i = 0; i < lotto.length; i++) {
            System.out.print((i + 1) + "회차: ");
            for (int j = 0; j < lotto[i].length; j++) {
                System.out.print(lotto[i][j] + " ");
            }
            System.out.println();
        }



    }


}
