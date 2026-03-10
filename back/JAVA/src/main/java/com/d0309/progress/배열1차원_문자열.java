package javaprj.day05;

public class 배열1차원_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//영화이름 5개 출력하기
		String[]  영화= new String[5 ];   //0~4
		영화[0] = "기생충";
		영화[1] =  "추격자";
		영화[2] =  "왕과 사는 남자";
		영화[3]="왕의 남자";
		영화[4]="살인의 추억";
		
		//영화[5]="새로운 영화";    배열은 반드시 선언한 만큼 사용해야 된다.  
		//에러발생 :배열의 범위를 벗어나지 않도록 사용하기 => java.lang.ArrayIndexOutOfBoundsException: 

		System.out.print(영화[0]);
		System.out.print(영화[1]);
		System.out.print(영화[2]);
		System.out.print(영화[3]);
		System.out.print(영화[4]);
		
		
		//배열선언및 초기화
		
		String[] strs= new String[] { "기생충" ,"추격자" , "왕과 사는 남자" , "왕의 남자" ,"살인의 추억"};
		
		//배열면[인덱스]
		
		
		String[] strss = {"기생충" ,"추격자" , "왕과 사는 남자" , "왕의 남자" ,"살인의 추억"};
		//출력하기
		//배열명[0]
		
		
		
		
	 
	}

}
