package javaprj.day05;

public class 배열2차원 {

	public static void main(String[] args) {
		 
		
		//2차원배열 :   1차원배열의 집합   , 1차원배열을 여러개 가지고있는 배열 
		//접근방법:
		//배열명[행 인덱스] [열 인덱스]  
		//배열을 기준으로 몇번째 1차원배열인지 찾는다 (행 찾기)
		//찾은 1차원배열에서 몇번째 요소인지 찾는다 ( 열 찾기)
		
		
		
		/*
		   조 출력 :   재미있게 해 줘요
 
			손영석 황스일 장해든 이현겸  
			이용찬 박세인 김태준 고지연 
			정철진 엄진희 김민경 여도현 
			이정하 나해수 조아진 장윤성  
			송주창 김민정 김재민 김건희 
 
		   
		 */
		
		//2차원배열 만들고 초기화하기 
		String[][] teams= {
				
				{"손영석" , "황스일",  "장해든",  "이현겸"  },
				{"이용찬", "박세인", "김태준", "고지연"},
				{"정철진" ,"엄진희"  ,"김민경", "여도현"},
				{"이정하" ,"나해수", "조아진", "장윤성"  },
				{"송주창", "김민정", "김재민",  "김건희" }
				
		};
		
		
		
		//2차원배열 출력하기 
		
		
		//1첫번째 팀 (다운캐스팅)
		
		System.out.println("1 조  다운캐스팅 ");
		System.out.print(  teams[0][0]);
		System.out.print(  teams[0][1]);
		System.out.print(  teams[0][2]);
		System.out.print(  teams[0][3]);
 
		
	
		
		System.out.println("\n2 조  this ");
		System.out.print(  teams[1][0]);
		System.out.print(  teams[1][1]);
		System.out.print(  teams[1][2]);
		System.out.print(  teams[1][3]);
		
		
		
		
		System.out.println("\n2 조  업캐스팅 " );
		System.out.print(  teams[2][0]);
		System.out.print(  teams[2][1]);
		System.out.print(  teams[2][2]);
		System.out.print(  teams[2][3]);	
		

		System.out.println("\n2 조  생성자 " );
		System.out.print(  teams[3][0]);
		System.out.print(  teams[3][1]);
		System.out.print(  teams[3][2]);
		System.out.print(  teams[3][3]);	
		
		
		

		System.out.println("\n2 조  오버라이딩 " );
		System.out.print(  teams[4][0]);
		System.out.print(  teams[4][1]);
		System.out.print(  teams[4][2]);
		System.out.print(  teams[4][3]);	
		
		
		//2차원 배열  -> 중첩반복 해결
		
		//행이 반복 
		   //열 반복
		
		
		for( int  i=0; i< 5 ; i++) {
			
			// i행의 정보 출력하기    행= >1차원 배열
			System.out.println("\n" + ( i+1)   + "조");
			
			for( int j=0; j<4; j++) {
				 //j => 행의 몇번째 요소인지 
				System.out.print( teams[i][j] );
			}
			
			
		}
		
		
		
		//2차원 배열 만들고 사용하기 
		String[][]  teams2  = new String[5][4];   //행:1차원 배열의 개수
		//String 은 기본값 null 로 초기화됨             //열: 1차원 배열의 (기억장소)요소의 개수
		
		// {"손영석" ,"황스일", "장해든",  "이현겸"  },
		// {"이용찬", "박세인", "김태준",   "고지연"},
		// {"정철진" ,"엄진희"  ,"김민경",  "여도현"},
	//	// {"이정하" ,"나해수", "조아진",   "장윤성"  },
		// {"송주창", "김민정", "김재민",  "김건희" }
		
		
		
		//첫번째 행
		teams2[0][0]= "손영석";
		teams2[0][1]= "황스일";	
		teams2[0][2]="장해든";
		teams2[0][3]="이현겸";
		 
		
		//두번째행
		 teams[1][0]="이용찬";
		 teams[1][1]="박세인";
		 teams[1][2]="김태준";
		 teams[1][3]="고지연";
		 
		
		//세번째행
		
		
		//네번째 행
		
		
		
		//다섯번째 행
		
		
		
		//teams2 배열 출력하기
		
		//반복문 x 
		//반복문 0
		
		
		
		
		
		
		 

	}

}
