package javaprj.day09.캡슐화하기.이현겸;

public class 실습문제2 {

	private long 주문번호;
	private String 아이디;
	private String 주문날짜;
	private String 이름;
	private String 상품번호;
	private String 배송주소;
	
	// 입력
	public void 입력하기(long 주문번호, String 아이디, String 주문날짜, String 이름, String 상품번호, String 배송주소) {
		this.주문번호 = 주문번호;
		this.아이디 = 아이디;
		this.주문날짜 = 주문날짜;
		this.이름 = 이름;
		this.상품번호 = 상품번호;
		this.배송주소 = 배송주소;
	}
	
	public void 출력하기() {
		System.out.println("주문번호: " + 주문번호);
		System.out.println("주문자 아이디: " + 아이디);
		System.out.println("주문 날짜: " + 주문날짜);
		System.out.println("주문자 이름: " + 이름);
		System.out.println("주문 상품 번호: " + 상품번호);
		System.out.println("배송 주소: " + 배송주소);
	}
	
	
}
