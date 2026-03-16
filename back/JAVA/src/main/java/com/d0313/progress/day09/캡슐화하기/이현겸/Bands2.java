package javaprj.day09.캡슐화하기.이현겸;

import java.util.Arrays;

public class Bands2 {
	
	private String name;
	private String[] member;
	private String[] popularSongs;
	private int foundationYear;
	
	public void 밴드정보입력(String name, String[] member, String[] popularSongs, int foundationYear) {
		this.name = name;
		this.member = member;
		this.popularSongs = popularSongs;
		this.foundationYear = foundationYear;
	}
	
	public void 밴드정보출력() {
		System.out.println("밴드 이름: " + this.name);
		System.out.println("멤버: " + Arrays.toString(this.member));
		System.out.println("유명한 노래: " + Arrays.toString(this.popularSongs));
		System.out.println("결성 연도: " + this.foundationYear);
	}

}
