package javaprj.day09.캡슐화하기.엄진희;

public class Phone2 {

	String name;
	String series;
	String color;
	int gram;
	


   public void 입력하기(String name, String series, String color, int gram) {
	   this.name=name;
	   this.series=series;
	   this.color=color;
	   this.gram=gram;}




  public void 출력하기 () {
	    System.out.println("[휴대폰 정보]");
	    System.out.println();
	    System.out.println("기종 :" + this.name);
		System.out.println("시리즈 :" + this.series);
		System.out.println("색깔 :" + this.color);
		System.out.println("무게 :" + this.gram);
  }

}