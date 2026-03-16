package javaprj.day09.성적처리;


/*
 * 
 * 3. 학생성적을 담을  class  작성하기
 Score 이름으로 작성하시오
   - name 학생이름
   - kor  국어성적
   - eng 영어성적
   - avg 평균   


   출력결과
     학생이름: 홍길동
     국어 :90
     영어 :80
     평균: 85
 

 * 
 * 
 */
public class Student2 {

	    String name ;
	    int kor  ;
	    int eng;
	    int avg;  //평균구하기
	    
	    
	    //기능 (입력,  성적처리 ,  출력)
	    
	    //객체매서드만들기
	    //static 제거 하기
	    //객체의 정보를 전달받는다 . 객체.매서드()호출할 때 객체의 정보를 전달받아요  this라는 키워드에
	    public  void input( String name, int kor, int eng) {
	    	this.name  = name;
	    	this.kor  = kor;
	    	this.eng= eng;
	    	
	    	
	    	calc();
	    	
	    }
	    
	    
	    //성적처리하기 
	    private   void calc() {
	    	int total  = this.kor+this.eng;
	    	this.avg  =  total/2;
	    }
	    
	    
	    public void print() {
	    	System.out.println(this.name);
	    	System.out.println(this.kor);
	    	System.out.println(this.eng);
	    	System.out.println(this.avg);
	    	
	    }

}
