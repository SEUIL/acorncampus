package com.d0313.progress.day09;

public class SnackInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//스낵정보 출력하기
		
		Snack s  = new Snack();  // 구조화된변수 만들기 
		
		/*
		s.name="맛동산";
		s.company="해태";
		s.calories="500";
		s.gram=200;
		*/
		
		입력하기( s,  "맛동산"  ,"해태" , "500",  200);
		출력하기(s);
		
		
	}
	
		
	//입력하기
	 public static  void   입력하기( Snack s , String  name, String company, String calories, int gram){
	
		 s.name= name;
		 s.company=company;
		 s.calories= calories;
		 s.gram=gram;
		 
	 } 
	
	//출력하기
	 
	 public static void  출력하기( Snack s) {
		 System.out.println( s.name);
		 System.out.println( s.company);
		 System.out.println( s.calories);
		 System.out.println( s.gram);
		 
	 }

}
