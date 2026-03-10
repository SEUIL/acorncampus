package com.d0306.seinprj;

import java.util.Scanner;

public class n3 {

	public static void main(String[] args) {
		
		int pCnt = 0;
		int nCnt = 0;
		int pEvencnt = 0;
		int pOddcnt = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("숫자를 입력하세요");
			int input = sc.nextInt();
			
			
			if(input > 0) {
				pCnt++;
				if(input%2 == 0) {
					pOddcnt++;
				}else if(input%2 != 0) {
					pEvencnt++;
				}
			}else if(input < 0){
				nCnt++;
			}
		}
		System.out.println("양수 : " + pCnt + " 음수 : " + nCnt + " 양수의 짝수 : " + pEvencnt + " 양수의 홀수: " + pOddcnt);

	}

}
