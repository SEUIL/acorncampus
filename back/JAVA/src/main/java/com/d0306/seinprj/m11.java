package com.d0306.seinprj;
import java.util.Scanner;

public class m11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 구구단 단을 입력하세요");
	
		int num = sc.nextInt();
		
		
		for(int j=1; j<=9; j++) {
			System.out.println(num + " * " + j + " = " + (num * j));
		}
	}
		
		
		
	}


