package com.d0319.progress.ex;

public class WrapperEx {
    public static void main(String[] args) {
        // 1. 수동 박싱 (예전 방식)
        Integer oldBoxing = Integer.valueOf(10);

        // 2. 오토 박싱 (Auto-boxing): 실무에서 쓰는 방식
        // 기본형이 자동으로 객체로 변신!
        Integer autoBoxing = 10;

        // 3. 오토 언박싱 (Auto-unboxing)
        // 객체가 자동으로 기본형으로 변신!
        int n = autoBoxing;

        // 4. 문자열을 숫자로 바꾸는 실무 활용
        String str = "100";
        int converted = Integer.parseInt(str); // 매우 자주 쓰임!

        System.out.println("결과: " + (n + converted)); // 110
    }
}

/*
 * [기본 타입과 Wrapper 클래스 비교]
 * | 기본 타입 (Primitive)   | Wrapper 클래스     |
 * | :-------------------- | :---------------- |
 * | byte                  | Byte              |
 * | short                 | Short             |
 * | int                   | Integer (주의!)    |
 * | long                  | Long              |
 * | float                 | Float             |
 * | double                | Double            |
 * | char                  | Character (주의!)  |
 * | boolean               | Boolean           |
 */