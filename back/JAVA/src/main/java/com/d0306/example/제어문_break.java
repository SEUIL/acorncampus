package com.d0306.example;

import java.util.Scanner;

public class 제어문_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//반복문에서  break 사용하면 자신이 속한  반복문을 벗어남
		//이름을 입력받아서 그대로 출력하기
		//"stop"이름이 입력되면 종료되게하기
		
		//반복의 횟수의 정해지지 않았기 때문에 while문 사용하기 
		
		
		
		String name="";  //
		Scanner sc  = new Scanner( System.in );
		
		
		while( true) {
		
			name  = sc.nextLine();  
			
			if( name.equals("stop")) {  //문자열비교 =>문자하나하나를 다 비교해서 true, false
				break;				
			}
			System.out.println( name); 
		}
		

	}

}
