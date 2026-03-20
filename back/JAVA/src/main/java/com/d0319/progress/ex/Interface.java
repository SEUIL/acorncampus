package com.d0319.progress.ex;

interface Flyable {
    void fly(); // 전 세계 모든 '나는 것'들의 약속
}

class Bird extends Animal implements Flyable {
    @Override
    void sound() { System.out.println("짹짹"); }

    @Override
    public void fly() { System.out.println("날개를 퍼덕이며 날아갑니다."); }
}

class Airplane implements Flyable { // 동물은 아니지만 '날 수 있음'
    @Override
    public void fly() { System.out.println("엔진을 가동해 비행합니다."); }
}

//실무에서는 보통 추상클래스로 공통 기반을 다지고, 인터페이스로 기능을 확장하는 전략을 씁니다.
//
// 추상클래스: "우리 시스템의 모든 '회원'은 로그인 기능과 이름 정보를 공통으로 가져야 해!" (Base Member)
//
// 인터페이스: "그중에서 'SNS 계정'인 회원들은 SNS 공유 기능을 가져야 하고, '유료 회원'은 할인 기능을 가져야 해!"