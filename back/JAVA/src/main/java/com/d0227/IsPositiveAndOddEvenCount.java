package com.d0227;

import java.util.ArrayList;
import java.util.Scanner;

public class IsPositiveAndOddEvenCount {
    /*
     * 10개의 수가 입력될 때 양수의 개수와 음수의 개수를 구하고 양수 중에서 홀수와 짝수의 개수를 구하시오
     * */


    public IsPositiveAndOddEvenCount() {
        run();
    }

    /**
     * 사용자에게 입력 받기
     */
    private String[] UserInputNumber() {
        String[] userInput = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("양수와 음수 숫자를 10개 입력하시오 (0은 제외) ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번 : ");
            userInput[i] = sc.nextLine();
        }
        return userInput;
    }

    /**
     * 양수 음수 배열화
     *
     * @userInput - 사용자 입력 값
     */
    private int[][] IsPositive(String[] userInput) {
        ArrayList<Integer> positiveList = new ArrayList<>();
        ArrayList<Integer> negativeList = new ArrayList<>();

        for (int i = 0; i < userInput.length; i++) {
            int num = Integer.parseInt(userInput[i]);
            if (num > 0) {
                positiveList.add(num);
            } else if (num < 0) {
                negativeList.add(num);
            }
        }

        int[] positive = new int[positiveList.size()];
        for (int i = 0; i < positiveList.size(); i++) positive[i] = positiveList.get(i);

        int[] negative = new int[negativeList.size()];
        for (int i = 0; i < negativeList.size(); i++) negative[i] = negativeList.get(i);

        return new int[][]{positive, negative};
    }

    /**
     * 양수중 홀수 짝수 개수 파악
     *
     * @positiveAndNegative - 양수 음수 배열화 값
     */
    private int[] IsOddEven(int[][] positiveAndNegative) {
        int[] positive = positiveAndNegative[0];
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < positive.length; i++) {
            if (positive[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[]{oddCount, evenCount};
    }

    public void run() {
        String[] userInput = UserInputNumber();
        int[][] positiveAndNegative = IsPositive(userInput);
        int[] oddAndEven = IsOddEven(positiveAndNegative);

        System.out.println("양수의 개수 : " + positiveAndNegative[0].length);
        System.out.println("음수의 개수 : " + positiveAndNegative[1].length);
        System.out.println("양수의 홀수의 개수 : " + oddAndEven[0]);
        System.out.println("양수의 짝수의 개수 : " + oddAndEven[1]);
    }

}
