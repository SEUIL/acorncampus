package com.d0306.seinprj;

public class h1 {

	public static void main(String[] args) {

		int year = 1999;
		double h = 2500000;
		double k = 1800000;
		double hInc = 0.036;
		double kInc = 0.042;
		
		while(k < h) {
			year++;
			h += (h*hInc);
			k += (k*kInc);
		}
		
		System.out.println(year);
	}

}
