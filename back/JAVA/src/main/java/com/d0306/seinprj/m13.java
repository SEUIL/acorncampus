package com.d0306.seinprj;

import java.util.Scanner;

public class m13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산자와 두 수를 입력하세요");
		
		String operator = sc.nextLine();
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		double result = 0;
		
		switch(operator) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
		}
		System.out.println(result);
	}

}
