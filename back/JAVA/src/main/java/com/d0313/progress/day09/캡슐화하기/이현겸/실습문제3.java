package javaprj.day09.캡슐화하기.이현겸;

public class 실습문제3 {
	private String 이름;
	private int 국어점수;
	private int 영어점수;
	private int 평균점수;
	
	// 입력하기
	public void 입력하기(String name, int 국어, int 영어) {
		this.이름 = name;
		this.국어점수 = 국어;
		this.영어점수 = 영어;
		this.평균점수 = (int)(국어 + 영어) / 2;
	}
	
	public void 출력하기() {
		System.out.println("이름: " + 이름);
		System.out.println("국어 점수: " + 국어점수);
		System.out.println("영어 점수: " + 영어점수);
		System.out.println("평균 점수: " + 평균점수);
	}
}
