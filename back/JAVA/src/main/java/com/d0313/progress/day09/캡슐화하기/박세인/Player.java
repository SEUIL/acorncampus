package javaprj.day09.캡슐화하기.박세인;

public class Player {
	
	String name;
	String team;
	int age;
	int num;
	
	public void 입력하기(String name, String team, int age, int num ) {
		this.name = name;
		this.team = team;
		this.age = age;
		this.num = num;
	}
	
	public void 출력하기() {
		System.out.println("이름: "+ this.name);
		System.out.println("팀: "+ this.team);
		System.out.println("나이: "+ this.age);
		System.out.println("번호: "+ this.num);
	}
}
