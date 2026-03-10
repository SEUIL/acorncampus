package com.d0306.seinprj;

import java.util.Scanner;

public class h2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int pay = 0;
		
		System.out.println("이름, 구분코드, 작업시간을 입력하세요");
		
		String name = sc.nextLine();
		int code = sc.nextInt();
		int time = sc.nextInt();
		
		switch (code) {
		case 1:
			pay = time * 2000;
			break;
		case 2:
			pay = time * 2500;
			break;
		case 3 :
			pay = time * 3000;
			break;
		case 4: 
			pay = time * 4000;
			break;
		}
		
		System.out.println(pay);
	}

}
