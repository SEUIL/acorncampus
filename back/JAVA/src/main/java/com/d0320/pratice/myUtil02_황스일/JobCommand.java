package com.d0320.pratice.myUtil02_황스일;

/**
 * 입력/출력이 있고 부가 기능을 제공하는 커스텀 인터페이스
 * @param <T> 반환할 결과의 타입 (제네릭)
 */
@FunctionalInterface
public interface JobCommand<T> {
    
    // 1. 핵심 추상 메서드 : String 입력을 받아 T 타입의 결과를 반환
    T execute(String param);

    // 2. 디폴트 메서드 : 람다식으로 핵심 로직(execute)만 넘겨주면, 앞뒤로 로그를 찍어주는 기능
    default T executeWithLog(String param) {
        System.out.println("[LOG] 작업 시작 - 입력값: " + param);
        T result = execute(param); // 우리가 람다로 전달한 알맹이 코드 실행
        System.out.println("[LOG] 작업 완료 - 결과값: " + result);
        return result;
    }

    // 3. 디폴트 메서드 (예외 처리를 대신 해주는 기능)
    default T executeSafely(String param) {
        try {
            return execute(param);
        } catch (Exception e) {
            System.out.println("[ERROR] 작업 중 치명적 오류 방어됨: " + e.getMessage());
            return null; // 오류 발생 시 프로그램 종료를 막고 null 반환
        }
    }
}