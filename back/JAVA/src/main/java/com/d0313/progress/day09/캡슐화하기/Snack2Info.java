package javaprj.day09.캡슐화하기;

public class Snack2Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Snack2 s= new Snack2();   // 구조화된변수정보+ 매서드정보
		//s=> 객체라고 부른다
		//s=>참조형변수 (위치정보를 저장하는 변수)
		
		
		s.입력하기("맛동산" ,"해태", "500",200);   //첫번째 인자로 변수의 정보, 즉 객체의 정보가 전달된다
		s.출력하기();  //출력하기 호출할 때  s객체,  s변수의 정보가 전달된다
		
		

	}

}
