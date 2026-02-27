package com.d0227;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAndAverage {
    /*
     *  10개의 수를 읽어 평균을 계산하여 합과 평균을 출력하는 순서도를 작성하시오
     * */

    private final List<Integer> numbers;
    private final Scanner scanner;

    public SumAndAverage() {
        this.numbers = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        run();
    }

    public void run() {
        input();
        dataStatsSummary();
    }

    private void input(){
        System.out.println("숫자 10개를 입력하시오");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번 : ");
            numbers.add(Integer.valueOf(scanner.nextLine()));
        }
    }

    private void dataStatsSummary(){
        int sum = 0;
        int average = 0;
        for (int num : numbers){
            sum += num;
        }
        average = sum / numbers.size();
        System.out.println("입력한 값들 : " + numbers);
        System.out.println("합 : " + sum);
        System.out.println("평균 : " + average);
    }

}



