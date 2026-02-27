package com.d0227;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsPositiveAndOddEvenCount02 {
    /*
     * 10개의 수가 입력될 때 양수의 개수와 음수의 개수를 구하고 양수 중에서 홀수와 짝수의 개수를 구하시오
     * */

    private final List<Integer> numbers;
    private final Scanner scanner;

    public IsPositiveAndOddEvenCount02() {
        this.numbers = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        run();
    }

    public void run() {
        inputNumbers();
        Statistics stats = calculateStatistics();
        printStatistics(stats);
    }

    // 1. 사용자 입력을 받고 유효성을 검사하여 리스트에 저장
    private void inputNumbers() {
        System.out.println("양수와 음수 숫자를 10개 입력하시오 (0은 제외) ");
        int count = 0;
        while (count < 10) {
            System.out.print((count + 1) + "번 : ");
            String input = scanner.nextLine();
            try {
                int num = Integer.parseInt(input);
                if (num == 0) {
                    System.out.println("0은 제외입니다. 다시 입력해주세요.");
                    continue;
                }
                numbers.add(num);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("유효한 숫자를 입력해주세요.");
            }
        }
    }

    // 2. 계산
    private Statistics calculateStatistics() {
        int positiveCount = 0;
        int negativeCount = 0;
        int positiveOddCount = 0;
        int positiveEvenCount = 0;

        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
                if (num % 2 == 0) {
                    positiveEvenCount++;
                } else {
                    positiveOddCount++;
                }
            } else if (num < 0) {
                negativeCount++;
            }
        }
        return new Statistics(positiveCount, negativeCount, positiveOddCount, positiveEvenCount);
    }

    // 3. 출력
    private void printStatistics(Statistics stats) {
        System.out.println("양수의 개수 : " + stats.positiveCount);
        System.out.println("음수의 개수 : " + stats.negativeCount);
        System.out.println("양수 중 홀수의 개수 : " + stats.positiveOddCount);
        System.out.println("양수 중 짝수의 개수 : " + stats.positiveEvenCount);
    }

    // DTO
    private static class Statistics {
        final int positiveCount;
        final int negativeCount;
        final int positiveOddCount;
        final int positiveEvenCount;

        public Statistics(int positiveCount, int negativeCount, int positiveOddCount, int positiveEvenCount) {
            this.positiveCount = positiveCount;
            this.negativeCount = negativeCount;
            this.positiveOddCount = positiveOddCount;
            this.positiveEvenCount = positiveEvenCount;
        }
    }
}



