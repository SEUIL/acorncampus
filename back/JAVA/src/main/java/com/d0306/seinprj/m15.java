package com.d0306.seinprj;

import java.util.Scanner;

public class m15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] operators = { "+", "-", "*", "/", "%", "=", "<", ">", "!", "&&", "||" };
		
		System.out.println("연산자 입력하세요");
		String operator = sc.nextLine();
		
		boolean isO = false;
		
		for(int i = 0; i < operators.length; i++) {
			if(operators[i].equals(operator)) {
				isO = true;
				break;
			}
		}
		
		if(isO) {
			System.out.println("연산자입니다");
		}else {
			System.out.println("연산자가 아닙니다");
		}
	}

}
