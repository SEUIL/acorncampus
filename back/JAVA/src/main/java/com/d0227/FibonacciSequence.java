package com.d0227;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    /*
     * 3. 다음과 같은 수열을 FIBONACCI 수열이라고 합니다.
     * 1, 1, 2, 3, 5, 8, 13, 21 ....
     * 즉, 앞의 두 항을 합하면 다음 항이 됩니다.
     * 50개의 FIBONACCI 수열을 구하여 인쇄하는 순서도를 작성하시오.
     * (기억장소 순환 시 기억장소 2개 또는 3개 이용하는 방법 모두 생각)
     *
     * 참고 : 이탈리아 수학자 피보나치(Fibonacci)가 발견한 피보나치 수열.
     * 수열을 생성하는 기본 규칙은 처음 두 항은 1이고, 세 번째 항부터는 바로 앞의 두 항의 합이 된다는 것이다.
     */

    private final List<Long> fibonacciSequence;

    public FibonacciSequence() {
        this.fibonacciSequence = new ArrayList<>();
        run();
    }

    public void run() {
        fibonacciSequence();
    }


    private void fibonacciSequence() {
        long first = 1;

        fibonacciSequence.add(first);
        fibonacciSequence.add(first);
        for (int i = 2; i < 50; i++){
            fibonacciSequence.add(fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2));
        }

        System.out.println("피보나치 수열 : " + fibonacciSequence);
    }



}
