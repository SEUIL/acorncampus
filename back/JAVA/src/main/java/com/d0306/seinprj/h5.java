package com.d0306.seinprj;

public class h5 {

	public static void main(String[] args) {

		int n = 2;
		int sum = 0;
		
		for(int i=1; i <= 7; i++) {
			sum += n;
			n *= 3;
		}

		System.out.println(sum);
	}

}
