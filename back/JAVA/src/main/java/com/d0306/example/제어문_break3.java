package com.d0306.example;

import java.util.Scanner;

public class 제어문_break3 {

	public static void main(String[] args) {
		
		//메뉴입력받아서 출력하기 
		
		Scanner sc = new Scanner( System.in);  // 추가
		
		/*
		  while(true){
		  
		  } 
		  
		 */
		
		loop:while(true) {

			int menu=2; // 1. 입력  2.조회   3. 변경  4.종료
			System.out.println(" 1. 입력  2.조회   3. 변경  4.종료  메뉴입력하시오");
			menu= sc.nextInt();  //추가
			
			switch( menu) {
			case 1:
				System.out.println("입력한다");
				break;
			case 2:
				System.out.println("조회한다");
				break;
			case 3:
				System.out.println("변경한다");
				break;
			case 4:
				System.out.println("종료한다");
				break loop;
			default:
				System.out.println("메뉴 x");
				
			}
			
		}
	}

}
