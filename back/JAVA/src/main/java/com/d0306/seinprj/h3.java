package com.d0306.seinprj;

import java.util.ArrayList;
import java.util.List;

public class h3 {
	
	
	public static void main(String[] args) {

		long a = 1;
		
		ArrayList<Long> fibonacciSequence = new ArrayList<>();
		
		fibonacciSequence.add(a);  //1
		fibonacciSequence.add(a);  //1
		
		for(int i=2; i < 50; i++) {
			fibonacciSequence.add(fibonacciSequence.get(i-1) + fibonacciSequence.get(i-2));
		}
		/*
		 * ( 1 , 1 )
		 *  1, 1, 2
		 *  1, 1, 2, 3
		 *  1, 1, 2, 3, 5
		 * */
		
		System.out.println(fibonacciSequence);

	}

}
