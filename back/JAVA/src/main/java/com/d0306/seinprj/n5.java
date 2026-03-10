package com.d0306.seinprj;

import java.util.Scanner;

public class n5 {

	public static void main(String[] args) {

		int input = 0;
		int sum = 0;
		int avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++){
			System.out.print(i +  "번 - 숫자를 입력하세요 : ");
			input = sc.nextInt();
			sum += input;
		}
		
		avg = sum/10;
		System.out.println(sum + " " + avg);

	}

}
