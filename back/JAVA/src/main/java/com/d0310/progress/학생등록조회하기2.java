package javaprj.day06;

import java.util.Scanner;

public class 학생등록조회하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//메뉴만 잘 동작하는지 확인하기 
		
		Scanner  sc = new Scanner( System.in);
		
		int menu=3; // 1.등록  2.조회 3.종료
		
		loop:while(true) {
			
			System.out.println("1.등록,  2.조회  3.종료");
			menu= sc.nextInt();
			switch (menu) {
			
			case 1:
				System.out.println("등록");
				break;
			case  2:
				System.out.println("조회");
				break;
			case 3:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("메뉴 x");
			}
			
			
			
		}
		
		
		

	}

}
