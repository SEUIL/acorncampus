package com.d0306.seinprj;

import java.util.Scanner;

public class m1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디, 이름, 나이, 키를 입력하세요");
		
		String id = sc.nextLine();
		String name = sc.nextLine();
		String age = sc.nextLine();
		double height = sc.nextDouble();
		
		System.out.println(id + " " + name + " " + age + " " + height);

	}

}
