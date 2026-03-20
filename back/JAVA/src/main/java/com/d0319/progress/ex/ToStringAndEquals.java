package com.d0319.progress.ex;

public class ToStringAndEquals {
    public static void main(String[] args) {
        // - toString - 실행 시
        Member m = new Member("홍길동", 25);
        System.out.println(m); // 오버라이드 전: Member@15db9742 / 후: Member[이름=홍길동, 나이=25]

        // - equals - 실행 시
        Member m1 = new Member("user01");
        Member m2 = new Member("user01");

        System.out.println(m1 == m2);      // false (주소가 다름)
        System.out.println(m1.equals(m2)); // true (아이디가 같으므로 같은 유저로 인정!)
    }
}

class Member {
    String id;
    String name;
    int age;

    Member(String id) {
        this.id = id;
    }

    Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString() 오버라이드
    @Override
    public String toString() {
        return "Member[이름=" + name + ", 나이=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // 1. 자기 자신과 비교하면 true
        if (this == obj) return true;

        // 2. null이거나 타입이 다르면 false
        if (obj == null || getClass() != obj.getClass()) return false;

        // 3. 다운캐스팅 후 핵심 데이터(id) 비교
        Member other = (Member) obj;
        return this.id.equals(other.id);
    }
}

//1. Object 클래스의 용도
// Object 클래스는 자바 클래스 계층 구조의 최상위 클래스입니다. 모든 클래스가 공통적으로 가져야 할 최소한의 규칙과 기능을 정의하고 있습니다.
//
// 표준화: 모든 객체가 toString(), equals(), hashCode() 등의 메서드를 공통으로 가지게 함으로써 표준화된 관리를 가능하게 합니다.
//
// 다형성의 정점: 어떤 타입의 객체든 Object 타입으로 업캐스팅하여 담을 수 있습니다.