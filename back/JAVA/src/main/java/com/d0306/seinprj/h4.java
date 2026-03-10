package com.d0306.seinprj;

import java.util.Scanner;

public class h4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("name, 국어, 영어, 수학 점수를 입력하세요");
		
		String name = sc.nextLine();
		double korScore = sc.nextDouble();
		double engScore = sc.nextDouble();
		double mathScore = sc.nextDouble();
		
		double avg = ((korScore + engScore + mathScore)/3);
		
		if(avg >= 90) {
			System.out.println("EXCELLENT");
		}else if(avg < 60) {
			System.out.println("FAIL");
		}
		
		System.out.println(name +" "+ avg);
	}

}
