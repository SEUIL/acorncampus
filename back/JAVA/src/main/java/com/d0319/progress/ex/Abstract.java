package com.d0319.progress.ex;

abstract class Animal {
    String name;

    // 일반 메서드: 모든 동물이 공통으로 하는 행동
    void breathe() { System.out.println(name + "이(가) 숨을 쉽니다."); }

    // 추상 메서드: 동물마다 소리가 다르니 자식에게 구현을 맡김
    abstract void sound();
}

class Dog extends Animal {
    Dog(String name) { this.name = name; }
    @Override
    void sound() { System.out.println("멍멍!"); }
}