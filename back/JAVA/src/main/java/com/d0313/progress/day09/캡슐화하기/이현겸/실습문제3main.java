package javaprj.day09.캡슐화하기.이현겸;

public class 실습문제3main {

	public static void main(String[] args) {
		
		// 객체 선언
		실습문제3 이현겸성적 = new 실습문제3();
		실습문제3 김건희성적 = new 실습문제3();
		
		// 입력
		이현겸성적.입력하기("이현겸", 70, 65);
		김건희성적.입력하기("김건희", 90, 98);
		
		// 출력
		이현겸성적.출력하기();
		김건희성적.출력하기();
		
		

	}

}
