package com.d0320.pratice.myUtil02_황스일;

public class MyUtil02 {

    public static void main(String[] args) {

        // 1. 기능: 들어온 문자열의 길이를 세어서 반환하는 코드 블록
        JobCommand<Integer> lengthCalculator = (str) -> {
            // if (str == null) {
            //     throw new IllegalArgumentException("입력값이 null일 수 없습니다.");
            // }
            return str.length();
        };

        System.out.println("=== 1. 기본 실행 (우리가 만든 코드만 실행) ===");
        int length = lengthCalculator.execute("Hello Gemini!");
        System.out.println("글자 수: " + length);

        System.out.println("\n=== 2. 로그 기능이 포함된 실행 (인터페이스의 디폴트 메서드 활용) ===");
        lengthCalculator.executeWithLog("Java Interface is awesome");

        System.out.println("\n=== 3. 안전한 실행 (에러 처리 디폴트 메서드 활용) ===");
        lengthCalculator.executeSafely(null);
    }
}
