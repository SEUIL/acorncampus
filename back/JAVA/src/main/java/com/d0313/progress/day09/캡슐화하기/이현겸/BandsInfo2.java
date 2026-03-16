package javaprj.day09.캡슐화하기.이현겸;

import java.util.Scanner;

public class BandsInfo2 {

	public static void main(String[] args) {
		
		// 객체 선언
		Bands2 meshuggah = new Bands2();
		Bands2 the1975 = new Bands2();
		Bands2 pantera = new Bands2();
		Bands2 megadeth = new Bands2();
		
		// 입력
		meshuggah.밴드정보입력(
				"Meshuggah", 
				new String[] {"Jens Kidman", "Fredrik Thordendal", "Tomas Haake", "Mårten Hagström", "Dick Lövgren"}, 
				new String[] {"Bleed", "Rational Gaze", "Combustion", "Swarm"}, 
				1987
		);
		
		the1975.밴드정보입력(
				"The 1975", 
				new String[] {"Matty Healy", "Adam Hann", "Ross MacDonald", "George Daniel"}, 
				new String[] {"The Sound", "Heart Out", "Robbers", "Chocolate"}, 
				2002
		);
		
		pantera.밴드정보입력(
				"Pantera", 
				new String[] {"Vinnie Paul", "Dimebag Darrell", "Rex Brown", "Phil Anselmo"}, 
				new String[] {"Walk", "Cowboys From Hell", "Floods", "Cemetery Gates"}, 
				1981
		);
		
		megadeth.밴드정보입력(
				"Megadeth", 
				new String[] {"Dave Mustaine", "James LoMenzo", "Dirk Verbeuren", "Teemu Mäntysaari"}, 
				new String[] {"Tornado of Souls", "Holy Wars...", "Seek And Destroy", "A Tout Le Monde"}, 
				1983
		);
		
		// 출력
		Scanner sc = new Scanner(System.in);
		int bandNum = 0;
		
		loop: while(true) {
			System.out.println("궁금한 밴드를 선택하세요. 1. Meshuggah 2. The 1975 3. Pantera 4. Megadeth 0 입력하면 종료");
			bandNum = sc.nextInt();
			switch(bandNum) {
			case 1:
				meshuggah.밴드정보출력();
				break;
			case 2:
				the1975.밴드정보출력();
				break;
			case 3:
				pantera.밴드정보출력();
				break;
			case 4:
				megadeth.밴드정보출력();
				break;
			case 0:
				System.out.println("종료합니다");
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}

	}

}
