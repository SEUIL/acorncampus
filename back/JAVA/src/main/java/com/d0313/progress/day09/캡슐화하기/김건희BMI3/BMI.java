package javaprj.day09.캡슐화하기.김건희BMI3;

public class BMI {
	String name;
	double hi;
	double wi;
	
	
	//객체매서드   (static이 제거되어야 한다. ! 즉     static이면 객체의 정보가 전달되지 않음)
	//객체를 사용하는 방법
	//객체( 변수)가 만들어 진 후 부터 사용가능한 매서드 
	//생성된 객체의 정보를 전달받는다. this라는 키워드로 사용함
	
	public void 정보입력(String name, double hi, double wi) {
		this.name = name;
		this.hi = hi;
		this.wi = wi;
	}
	public double 계산하기() {
	    double meter = hi / 100;
	    double result = wi / (meter * meter);
	    return result;
	}
	public void 출력하기() {
		System.out.println("이름:" + name);
		System.out.println("키:" + hi);
		System.out.println("몸무게:" + wi);
		System.out.println("BMI:" + 계산하기());
	}

}
