package com.d0313.progress.day09;

public class DrinkInfo {
    public static void main(String[] args) {

    	// int a;
    	
    	//Drink 타입으로 변수만들기
    	//구조화된변수만들기
        Drink drink1 = new Drink();
        Drink drink2 = new Drink();
        Drink drink3 = new Drink();
        
        //drink1.drinkName="초코젤라또 말차라떼";
        
        
        input(drink1, "초코젤라또 말차라떼",4400,true ,"150칼로리");
        input(drink2, "라이트 바닐라 아몬드라떼",3900,true ,"200칼로리");
        input(drink3, "에스프레소 도피오",2000,false ,"150칼로리");

      
        //Drink[] drinks = {drink1, drink2, drink3};
        
        
        print(drink1);
        print( drink2);
        print( drink3);

        
    }
    
    
    //입력하기 
    public static void input(Drink drink, String drinkName, int price, boolean isCode  ,String 칼로리){
        drink.drinkName = drinkName;
        drink.price = price;
        drink.isCold = isCode;
        drink.칼로리=칼로리;  /* 입력하기 함수가 변경되었음  - 추가요구사항 */
    } 
    
    //출력하기
    public static void print( Drink drink) {
    	System.out.println( drink.drinkName);
    	System.out.println( drink.price);
    	System.out.println( drink.isCold);
    	System.out.println( drink.칼로리);  /* 출력하기 함수가 변경되었음 - 추가요구사항*/
    	
    	
    }
}
