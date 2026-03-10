package javaprj.day05;

public class 배열3차원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[][][]    배열2차원= {
				
				//0면
				
				{
					{ "*1","*2","*3"},
					{ "*4","*5","*6"},
					{ "*7","*8","*9"} 
				}
				
				,
				
				
				
				//1면
				{
					{ "@1","@2","@3"},
					{ "@4","@5","@6"},
					{ "@7","@8","@9"} 
				} 
				
		};
		
		// 첫번째 2차원 출력하기
		// 몇번째 면에 있는가? 0면
		
		
		System.out.print( 배열2차원[0][0][0] );
		System.out.print( 배열2차원[0][0][1] );
		System.out.println( 배열2차원[0][0][2] );
		
	
		
		System.out.print( 배열2차원[0][1][0] );
		System.out.print( 배열2차원[0][1][1] );
		System.out.println( 배열2차원[0][1][2] );
		
		
		
		
		System.out.print( 배열2차원[0][2][0] );
		System.out.print( 배열2차원[0][2][1] );
		System.out.println( 배열2차원[0][2][2] );
				
		
		
		//두 번째 2차원 배열 출력하기 (2번째 면 출력하기)
		
		System.out.print( 배열2차원[1][0][0] );
		System.out.print( 배열2차원[1][0][1] );
		System.out.println( 배열2차원[1][0][2] );
		
	
		
		System.out.print( 배열2차원[1][1][0] );
		System.out.print( 배열2차원[1][1][1] );
		System.out.println( 배열2차원[1][1][2] );
		
		
		
		
		System.out.print( 배열2차원[1][2][0] );
		System.out.print( 배열2차원[1][2][1] );
		System.out.println( 배열2차원[1][2][2] );
				
		
		
	}
	
	
	

	
	

}
