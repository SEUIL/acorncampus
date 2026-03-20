package com.d0319.progress.ex;

import java.util.ArrayList;

class Box<T> {
    private T item;

    public void setItem(T item) { this.item = item; }
    public T getItem() { return item; }
}

public class GenericEx {

    public static void main(String args[]){

        //기본 버전 (Object기반 - 제네릭 미사용)
        ArrayList list01 = new ArrayList(); // 타입을 지정하지 않음 (Object로 취급)

        list01.add("Apple");
        list01.add(100);     // 아무거나 다 들어감 (업캐스팅)

        // 데이터를 꺼낼 때
        String fruit01 = (String) list01.get(0); // 반드시 다운캐스팅 필요!
        int number = (int) list01.get(1);      // 귀찮고 위험함 (ClassCastException 위험)

        System.out.println("다운캐스팅을 사용해서 꺼낸 데이터 : " + fruit01 + ", " + number);


        //제네릭 버전 (타입 지정)
        // <String> 타입만 받겠다고 선언!
        ArrayList<String> list02 = new ArrayList<>();

        list02.add("Apple");
        // list01.add(100); // 에러 발생! 컴파일 시점에 막아줌 (타입 안정성)

        // 데이터를 꺼낼 때
        String fruit02 = list02.get(0); // 형변환(다운캐스팅) 필요 없음! 바로 사용 가능
        System.out.println("<String> 타입 제네릭을 사용해서 꺼낸 데이터 : " + fruit02);


        //제네릭 클래스 직접 만들기
        // 사용할 때 타입을 결정 (String 상자)
        Box<String> nameBox = new Box<>();
        nameBox.setItem("에이콘");

        // 사용할 때 타입을 결정 (Integer 상자)
        Box<Integer> ageBox = new Box<>();
        ageBox.setItem(20);

        System.out.println("제네릭 클래스를 직접 만들어 꺼내온 데이터 : " + nameBox.getItem() + ", " + ageBox.getItem());
    }
}
/*
제네릭의 핵심 장점 요약
타입 안정성 (Type Safety): 의도하지 않은 타입의 객체가 저장되는 것을 막습니다.

형변환 생략: 코드에서 지저분한 (String) 같은 다운캐스팅 코드가 사라져 가독성이 좋아집니다.

코드 재사용: 하나의 클래스로 다양한 타입에 대응할 수 있습니다.
* */

/*
실무에서는 ArrayList<Member>, HashMap<String, Object> 처럼 제네릭을 중첩하거나 복합적으로
사용하는 경우가 99%입니다. 특히 API 응답 데이터를 처리할 때 제네릭이 없으면 코드가 정말 지저분해지는데,
제네릭 덕분에 아주 깔끔하게 데이터를 주고받을 수 있답니다.
*/

