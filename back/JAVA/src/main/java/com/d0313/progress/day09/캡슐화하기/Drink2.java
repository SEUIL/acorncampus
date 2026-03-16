package javaprj.day09.캡슐화하기;


//객체지향프로그래밍 ( 구조화된 데이터 +함수 ) 
//1.캡슐화  ( 묶음 ,  데이터보호 )
// 관련있는데이타와 데이터를 사용하는 함수(매서드)를 하나의 묶음으로 사용하는 것 
// 데이터를 외부에 직접공개하지 않고 매서드를 통해서만 데이터를 사용하도록 하는 것
// 접근제한자를 제공함 ( private , public  ) 
// 생성자라는 문법 
public class Drink2 {
	
    private String drinkName;  /*  drinkName => 변경 */
    private int price;
    private boolean isCold;
    private String  칼로리;  /* 추가적인 요구사항*/
   
    // public  void input(Drink2 this , String drinkName, int price, boolean isCode  ,String 칼로리){
    public  void input( String drinkName, int price, boolean isCode  ,String 칼로리){
        this.drinkName = drinkName;
        this.price = price;
        this.isCold = isCode;
        this.칼로리=칼로리;  /* 입력하기 함수가 변경되었음  - 추가요구사항 */
    } 
    
    //출력하기
  //  public static void print( Drink2 drink) {
    public   void print( ) {
    	System.out.println( this.drinkName);
    	System.out.println( this.price);
    	System.out.println( this.isCold);
    	System.out.println( this.칼로리);  /* 출력하기 함수가 변경되었음 - 추가요구사항*/
    	
    	
    }
    
}
