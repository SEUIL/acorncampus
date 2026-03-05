package com.d0227;

import java.util.ArrayList;
import java.util.Scanner;

public class IsPositiveAndOddEvenCount {
    /*
     * 10개의 수가 입력될 때 양수의 개수와 음수의 개수를 구하고 양수 중에서 홀수와 짝수의 개수를 구하시오
     * */

    /*
    1. 숫자 10개 입력받기 (UserInputNumber)
       가장 먼저 Scanner를 사용해 사용자로부터 10개의 숫자를 입력받습니다.

       포인트: 입력값을 즉시 계산하지 않고 일단 String[] 배열에 담아두어, 입력과 연산 로직을 깔끔하게 분리했습니다.
       이는 향후 유지보수가 쉬운 코드를 만드는 방법입니다.

    2. 양수와 음수의 "바구니" 나누기 (IsPositive)
       입력된 10개의 숫자 중 무엇이 양수고 음수인지 분류하는 핵심 단계입니다.

       ArrayList의 활용: 입력된 값 중 양수가 몇 개일지, 음수가 몇 개일지 미리 알 수 없습니다.
                        그래서 크기가 고정된 배열 대신, 추가하는 대로 크기가 늘어나는 ArrayList를 임시 바구니로 사용했습니다.

       데이터 변환: ArrayList에 담긴 데이터를 다시 일반 int[] 배열로 옮겨 담아
                  2차원 배열(int[][]) 형태로 반환합니다. 첫 번째 방([0])에는 양수들을,
                  두 번째 방([1])에는 음수들을 모아 한 번에 전달하는 효율적인 방식을 선택했습니다.

    3. 양수 속의 홀수와 짝수 찾기 (IsOddEven)
       분류된 양수 데이터들만 가져와서 다시 한번 판별합니다.

       나머지 연산자(%): num % 2 == 0이면 짝수, 아니면 홀수로 판별합니다.

       자바의 기본적인 산술 연산을 활용해 논리적으로 개수를 카운트합니다.
    */


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
        for (int i = 0; i < positiveList.size(); i++){
            positive[i] = positiveList.get(i);
        }

        int[] negative = new int[negativeList.size()];
        for (int i = 0; i < negativeList.size(); i++){
            negative[i] = negativeList.get(i);
        }

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
