package com.d0318.practice.polymorphism01;

// 1. 상속관계 is-a 클래스를 여러 개 만들기 (결제 시스템 부모/자식 클래스)
class Payment {
    public void pay() {
        System.out.println("결제를 진행합니다.");
    }
}

// 자식 클래스 1: 신용카드 결제
class CreditCardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("신용카드로 결제 금액을 승인합니다.");
    }

    // 신용카드만의 고유 기능
    public void applyInstallment(int months) {
        System.out.println("신용카드 " + months + "개월 할부를 적용합니다.");
    }
}

// 자식 클래스 2: 카카오페이 결제
class KakaoPayPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("카카오페이로 간편 결제를 진행합니다.");
    }

    // 카카오페이만의 고유 기능
    public void usePoint(int points) {
        System.out.println("카카오페이 포인트 " + points + "원을 사용합니다.");
    }
}

public class Polymorphism01 {
    public static void main(String[] args) {
        System.out.println("=== [1 & 2번: 실무형 다형성 및 부모형 객체 배열 사용] ===");
        // 2. 여러 결제 수단(자식)들을 Payment(부모) 배열로 다루기
        Payment[] paymentList = new Payment[2];
        
        // 3-1. [업캐스팅 발생 부분] 자식 객체를 생성하여 부모 타입 배열에 담음
        paymentList[0] = new CreditCardPayment(); // CreditCardPayment -> Payment
        paymentList[1] = new KakaoPayPayment();   // KakaoPayPayment -> Payment

        // 다형성을 이용한 결제 일괄 처리 (오버라이딩 된 각자의 pay()가 실행됨)
        for (Payment payment : paymentList) {
            payment.pay(); 
            
            // 3-2. [다운캐스팅 발생 부분] 특정 결제 수단만의 고유 기능을 실행하기 위해 원래 타입으로 변환
            if (payment instanceof CreditCardPayment) {
                CreditCardPayment card = (CreditCardPayment) payment;
                card.applyInstallment(3); //신용카드의 결제
            } else if (payment instanceof KakaoPayPayment) {
                KakaoPayPayment kakao = (KakaoPayPayment) payment;
                kakao.usePoint(1500); //카카오 페이의 결제
            }
            System.out.println("-----------------------------------");
        }

        System.out.println("\n=== [4번: 올바르지 않은 다운캐스팅 예제] ===");
        // 4. 올바르지 않은 다운캐스팅 (ClassCastException 발생)
        Payment failedPayment = new CreditCardPayment(); // 업캐스팅된 신용카드 객체
        
        try {
            System.out.println("신용카드 결제 객체를 카카오페이로 강제 변환 시도...");
            KakaoPayPayment wrongCast = (KakaoPayPayment) failedPayment; // 런타임 에러 발생
            wrongCast.usePoint(500); // 실행되지 않음
        } catch (ClassCastException e) {
            System.out.println("에러 발생: " + e.getMessage());
            System.out.println("실패 사유: 신용카드 결제 객체는 카카오페이 타입으로 다운캐스팅할 수 없습니다.");
        }
    }
}
