package com.d0306.seinprj;

public class n4 {

	public static void main(String[] args) {
		
		int n = 1;
		int sum = 1;
		
		while(sum <= 1000) {
			n = n + 2;
			sum = sum + n;
		}
		System.out.println("마지막항 : " + n + " 초과한 값 : " + (sum-1000));

	}

}
