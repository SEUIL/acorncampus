package javaprj.day09.캡슐화하기.조아진;

public class 실습_롤챔피언출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		실습_롤챔피언 missFortue = new 실습_롤챔피언();
		
		missFortue.inputChampion("미스포츈", "바텀", "원거리 딜러", "AD(물리 피해)", 600, "쌍권총 난사");
		missFortue.printChampion();
		System.out.println();
		
		실습_롤챔피언 ahri = new 실습_롤챔피언();
		ahri.inputChampion("아리", "미드 (Mid)", "마법사, 암살자", "AP(마법 피해)", 590, "혼령 질주");
		ahri.printChampion();
	}

}
