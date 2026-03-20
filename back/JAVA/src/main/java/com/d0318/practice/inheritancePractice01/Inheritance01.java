package com.d0318.practice.inheritancePractice01;

// 부모 클래스
class Animal {
    public Animal() {
        System.out.println("1. Animal(부모) 생성자 호출");
    }

    public void eat() {
        System.out.println("동물이 밥을 먹습니다.");
    }
}

// 자식 클래스 (Dog is an Animal)
class Dog extends Animal {
    public Dog() {
        super(); // 부모 생성자 명시적 호출 (생략해도 자동 호출됨)
        System.out.println("2. Dog(자식) 생성자 호출");
    }

    // 자식 고유의 메서드
    public void bark() {
        System.out.println("강아지가 멍멍 짖습니다.");
    }
}

public class Inheritance01 {
    public static void main(String[] args) {
        System.out.println("=== [1 & 2번: 상속 객체 생성 및 생성자 호출 순서] ===");
        // 자식 객체(Dog)를 생성하면, 부모(Animal) 생성자가 먼저 호출된 뒤 자식 생성자가 호출됩니다.
        Dog myDog = new Dog();

        System.out.println("\n=== [3 & 4번: 업캐스팅 및 자식 기능 은닉 확인] ===");
        // 3. 업캐스팅: 부모형(Animal) 참조변수에 자식 객체(Dog)를 저장
        Animal upcastedDog = new Dog();
        upcastedDog.eat(); // 부모 클래스에 있는 메서드 접근 가능
        
        // 4. 부모형으로 참조 시 자식 고유의 내용이 보이지 않음
        // upcastedDog.bark(); // 컴파일 에러 발생: Animal 타입에는 bark()가 없음
        System.out.println("(부모타입으로 참조 시 upcastedDog.bark()는 컴파일 에러가 발생합니다.)");
        System.out.println("\n=== [5 & 6번: instanceof 확인 및 다운캐스팅] ===");
        // 5. instanceof로 안전하게 확인 후 다운캐스팅 진행
        if (upcastedDog instanceof Dog) {
            Dog downcastedDog = (Dog) upcastedDog;
            
            // 6. 다운캐스팅 후 자식 객체의 고유 기능 사용
            downcastedDog.bark();
        }
    }
}
