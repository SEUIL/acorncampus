package com.d0306.seinprj;

public class h6 {

	public static void main(String[] args) {

		double sum = 0.0;

		for (int i = 1; i <= 10; i++) {
			// 팩토리얼 계산 (i!)
			long factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial *= j; //1 2 6 .....
			}

			// 항 계산 (n / n!)
			double term = (double) i / factorial;

			// 부호 결정 및 합산 (홀수 번째는 +, 짝수 번째는 -)
			if (i % 2 == 1) {
				sum += term;
			} else {
				sum -= term;
			}
		}

		System.out.println("결과값(sum) : " + sum);

	}

}
