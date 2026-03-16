package javaprj.day09.캡슐화하기.손영석;

/*1. 객체지향 프로그래밍(객체 + 객체에서 다루는 method) :
관련 있는 데이터(필드)와 그 데이터를 다루는 메서드를 하나의 클래스에 묶어서 설계한다.
*
2. 캡슐화(묶음, 데이터 보호) : 관련 데이터와 사용하는 method를 하나의 묶음으로 사용하는 것
*   - 데이터를 외부에 직접 공개 x method를 통해서만 데이터 사용하는 것
*   - 데이터를 보호하기 위해 보통 필드를 private으로 감추고,
*   - 메서드를 통해 접근하게 만든다
*
* 접근 제한자를 제공함(private, public) : private, public 등을 사용해 외부 접근 범위를 조절한다.
* */
public class Drink2 {
    private String drinkName;
    private int price;
    private String temp; /* ICE / HOT */
    private int calories; /*calories 추가*/

    /*생성자*/
    public Drink2(String drinkName, int price, String temp, int calories) {
        this.drinkName = drinkName;
        this.price = price;
        this.temp = temp;
        this.calories = calories;
    }


    /* 객체의 데이터를 다루는 메서드 추가
    input, print 두 개의 함수는 Drink2 type을 사용하는 함수들이다.

    1. 데이터 + 데이터를 다루는 메서드를 하나의 단위(클래스)로 설계
    2. static을 제거하여 클래스 메서드가 아니라 인스턴스 메서드로 만든다.
    그래서 객체를 생성한 뒤, 그 객체를 통해서만 호출할 수 있다.
    3. 인스턴스 메서드 안에서는 현재 객체의 필드에 접근할 수 있으며,
    필요하면 this를 사용해 현재 객체의 멤버임을 명확히 나타낼 수 있다.

    * */

    /*  입력하기
    * static 제거 -> static 메서드에서 인스턴스 메서드로 바뀜
    * static을 뺀 이유:
     * static 메서드는 객체 생성 없이 클래스 이름으로 호출할 수 있다.
     * 하지만 input(), print()는 특정 Drink2 객체의 데이터를 다루는 기능이므로
     * 객체를 생성한 뒤 그 객체를 통해 호출하는 인스턴스 메서드가 더 적절하다.
     *
     * 즉, 객체가 자기 자신의 데이터를 처리하도록 만든 것이다.
     */
    /*public void input(String drinkName, int price, String temp, int calories) {
        this.drinkName = drinkName; // 객체의 필드(this.drinkNamee) =  매개변수(drinkName)
        this.price = price;         // this를 안쓴다면 둘다 매개변수로 인식
        this.temp = temp;       // instance Method 안에서만 사용가능 this
        this.calories = calories;
        *//*this : 이 메서드를 호출한 바로 그 객체 자신*//*
    }*/

    //  출력하기
    public String getDrinkInfo() {
        String drinkInfoAll = "메뉴 이름 : " + this.drinkName + ", 가격 :  " + this.price + ", 냉/온 :" + this.temp + ", 칼로리 :  " + this.calories;
        return drinkInfoAll;

    }

}
