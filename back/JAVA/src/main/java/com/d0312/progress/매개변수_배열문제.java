package com.d0312.progress;

public class 매개변수_배열문제 {

	/*
	 * 기능 :이름배열에서 해당하는 성씨 이름수 반환하기
	 * 입력(매개변수) : 이름배열 , 성
	 * 반환  :해당하는 이름 수
	 */
	
	
	public static  int 성씨구하기( String[] names, String firtName) {
		
		int cnt=0;
		for( int i=0; i< names.length ; i++) {
			if( names[i].startsWith(firtName)) {
				cnt++;
			}
		}		
		
		return cnt;		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result  =성씨구하기( new String[] {  "김건희","고지연","김민정","황스일","이현겸",
                "이용찬","여도현","장해든","박세인","나해수",
                "손영석","송주창","정철진","김재민","엄진희",
                "이정하","김민경","조아진","장윤성","김태준"}  , "김");

		
	   System.out.println( result);
	  
	  
	  String[] names= new String[] {  "김건희","고지연","김민정","황스일","이현겸",
              "이용찬","여도현","장해든","박세인","나해수",
              "손영석","송주창","정철진","김재민","엄진희",
              "이정하","김민경","조아진","장윤성","김태준"} ;
	   
	  int result2 =성씨구하기( names, "엄");
	  
	  System.out.println( result2);
		
		
	}

}
