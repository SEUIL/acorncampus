package com.d0319.progress.ex;

public class StringEx {
    public static void main(String[] args) {
        // 1. String의 한계 (매번 새로운 객체 생성)
        String s = "Hello";
        s += " World"; // "Hello World"라는 새로운 객체가 생성됨

        // 2. StringBuilder의 효율성 (기존 객체 수정)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // 기존 sb 객체 내부의 데이터만 바뀜
        sb.append(" !!!");

        System.out.println(sb.toString()); // 최종 결과 출력

        // 3. 주요 조작 메서드
        String data = "Apple,Banana,Orange";
        String[] fruits = data.split(","); // split 활용

        String sub = data.substring(0, 5); // substring 활용 (Apple)
        System.out.println("첫 번째 과일: " + sub);
    }
}

/*
메서드             | 설명                        | 예시
------------------|---------------------------|--------------------------------------
substring(i, j)   | i부터 j 앞까지 자르기         | "Hello".substring(0, 2) -> "He"
split(구분자)      | 특정 문자로 나누어 배열 반환    | "A,B,C".split(",") -> {"A", "B", "C"}
replace(A, B)     | A를 B로 치환                | "Java".replace("J", "K") -> "Kava"
contains(A)       | A를 포함하고 있는지 확인       | "Hello".contains("He") -> true
trim()            | 앞뒤 공백 제거               | "  Hi  ".trim() -> "Hi"
*/