package com.d0227;

import java.util.Scanner;

public class CalculateScore {
    /*
    이름과 국어, 영어, 수학 3과목 점수가 입력된다. 개인평균을 구하고 90점 이상이면
    "EXCELLENT", 60점 미만이면 "FAIL"을 입력자료 및 개인 평균과 함께 출력하고 마지막으
    로 각 과목별 평균점수를 프린트하는 순서도를 작성하시오
    */

    private final Scanner scanner;
    private int koreanScore;
    private int englishScore;
    private int mathScore;


    public CalculateScore() {
        this.scanner = new Scanner(System.in);
        koreanScore = 0;
        englishScore = 0;
        mathScore = 0;
        run();
    }

    public void run(){
        inputNumbers();
        scoreAggregation();
    }

    private void inputNumbers() {
        System.out.println("국어, 영어, 수학 점수를 차례대로 입력해주세요");
        System.out.print("국어 : ");
        koreanScore = scanner.nextInt();
        System.out.print("영어 : ");
        englishScore = scanner.nextInt();
        System.out.print("수학 : ");
        mathScore = scanner.nextInt();
    }

    private void scoreAggregation(){
        int totalScore = koreanScore + englishScore + mathScore;
        double averageScore = totalScore / 3.0;

        System.out.println("개인 평균 : " + averageScore);

        if (averageScore >= 90){
            System.out.println("EXCELLENT");
        }else if (averageScore >= 80){
            System.out.println("GOOD");
        }else if (averageScore >= 70 ) {
            System.out.println("NORMAL");
        } else if (averageScore < 60) {
            System.out.println("FAIL");
        }


    }
}
