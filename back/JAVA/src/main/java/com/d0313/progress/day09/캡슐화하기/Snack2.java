package javaprj.day09.캡슐화하기;
//캡슐화 :데이터 + 데이터를 다루는 (사용하는)기능을 하나의 단위로 제공하는 것 (설계도 작성)
//반드시 객체변수가 만들어진 후 부터 매서드를 통해서 데이터를 사용함 (데이터보호)
public class Snack2 {

	//어떻게 변수가 만들어질지 설계
	String name;
	String company;
	String calories;	
	int gram;
	
	//
	
	//이 변수들을 어떻게 사용할지 설계
	
	//기능
	//이 기능들은 반드시 위에서 설계한 변수가 만들어진 후 부터 사용할 수 있다.
	//입력하기
	//출력하기	
	 public   void   입력하기( String  name, String company, String calories, int gram){
			
		 this.name= name;
		 this.company=company;
		 this.calories= calories;
		 this.gram=gram;
		 
	 } 
	 
	 
	 
	 public  void  출력하기() {
		 System.out.println( this.name);
		 System.out.println( this.company);
		 System.out.println( this.calories);
		 System.out.println( this.gram);
		 
	 }
	
	
	
}
