package javaprj.day09.캡슐화하기.이현겸;

public class 실습문제1 {

	private int age;
	private String name;
	private boolean isMarried;
	private int children;
	
	// 입력
	public void 입력하기(int age, String name, boolean isMarried, int children) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.children = children;
	}
	
	// 출력
	public void 출력하기() {
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
		System.out.println("결혼 여부: " + isMarried);
		System.out.println("자식 수: " + children);
	}
	
}
