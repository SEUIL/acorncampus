package com.d0306.seinprj;

public class n2 {

	public static void main(String[] args) {

			int N = 0;
			int sum = 0;
			int i = 1;
			int j =1;
			
			for(i=1; i<=100; i++) {
				for(j=1; j<=i; j++) {
					N = N + j;
				}
				sum = sum + N;
			}
			System.out.println(sum);
	}

}
