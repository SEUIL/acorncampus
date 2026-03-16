package javaprj.day09.캡슐화하기.이현겸;

public class 실습문제2main {

	public static void main(String[] args) {
		
		// 객체 선언
		실습문제2 주문1 = new 실습문제2();
		
		// 주문 정보 입력
		주문1.입력하기(201803120001l, "abc123", "2018년 3월 12일", "홍길순", "D0345-12", "서울시 영등포구 여의도동 20번지");
		
		// 주문 정보 출력
		주문1.출력하기();

	}

}
