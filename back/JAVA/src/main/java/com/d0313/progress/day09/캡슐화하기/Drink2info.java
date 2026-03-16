package javaprj.day09.캡슐화하기;

public class Drink2info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Drink2 drink  = new Drink2();
		      //  drink 참조형변수
		      //  객체라고 부른다 
		 
		 //1. input을 통해서 위에서 만든변수에 값넣기
		 drink.input("초코젤라또 말차라떼",4400,true ,"150칼로리");  //  input  매서드가 호출될때 drink정보가
		                                                     // 제공됨
		 
		 //2. print를 통해서 위에서 만든변수의 내용 출력하기
		 drink.print();   // print라고 매서드를 호출하면  drink정보 (위치정보)가 제공된다.
		 
		 
		 
		 
		 Drink2 drink2  = new Drink2();  //변수가 만들어짐,  구조가 있는 변수가 만들어짐
		 drink2.input("라이트 바닐라 아몬드라떼",3900,true ,"200칼로리");
		 drink2.print();
		 

	}

}
