package javaprj.day04;

public class 손영석매운맛6_분모구하기 {
	
	public static void main(String[] args) {
		
		
		// 1     2     3      4        5     =>항의 순번이자 반복제어 역할    (i) 
		// 1!    2!    3!     4!       5!    =>항 
		// 1    1*2   1*2*3  1*2*3*4  1*2*3*4*5
		
		
		
		//1) 반복문으로 항구하기 (1~항의 순번까지 곱)
		//2) 이전항을 이용하는 방법 (이전항 +항의 순번) :2번째 항 부터 구하기 
		 
		
		//2)풀이
		int  sum=1;
		int  a=1;
		
		
		
		for( int i=2; i<=5 ; i++) {			
			a= a*i;  //a*=i
			sum = sum+a; // sum+=a;
			
		}
		
	   /*
		   
		   i   a  sum
		   2   2    3
		   3   6    9
		   4   24   33  
		   5   120  153
		 */
		
		
		
	}

}
