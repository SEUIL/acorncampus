package com.d0312.progress;


//자바에서 코드 작성법
//반드시 클래스가 있어야 한다
//실행가능한 클래스가 되려면 반드시  약속된   main 매서드가 있어야 된다

public class 배열에서짝수개수구하기2 {

	 
	
	//함수를 만들기 힘들면 
	//메인에서 동작하는 프로그램으로 작성하기 
	
	/*
	 * 기능 : 정수배열에서 짝수구하기
	 * 입력(매개변수) : 정수배열
	 * 반환:  짝수개수
	 */
	
	public static int  배열에서짝수구하기( int[] nums) {
		int cnt=0;		
		//
		for( int i=0; i<nums.length; i++) {
			 
			int num= nums[i];
			//System.out.println( num);
			
			if( num %2 ==0) {
				
				cnt++;  
				//System.out.println( num  +"  "+ cnt);
			}			
		}		
		System.out.println( cnt);
		return cnt; 
		
	}
	
	
	public static void main(String[] args) {
		
		
		int result  =짝수개수구하기(  new int[] {9,12,5,6,3});
		System.out.println( result);
	 
	}


	public static int  짝수개수구하기(  int[] nums) {
		 
		//짝수의 개수 구하기		
		int cnt=0;		
		//
		for( int i=0; i<nums.length; i++) {			 
			int num= nums[i];
			//System.out.println( num);
			
			if( num %2 ==0) {
				
				cnt++;  
				//System.out.println( num  +"  "+ cnt);
			}			
		}
		
		System.out.println( cnt);
		
		return cnt;
	}
	
	//함수작성법
	//1. 메인에서 실행되는 코드로 작성하기
	//2. 매서드로 분리해 보기 (매서드로 만들어 보기)
  
	

}
