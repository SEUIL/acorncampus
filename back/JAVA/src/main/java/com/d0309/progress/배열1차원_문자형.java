package javaprj.day05;

public class 배열1차원_문자형 {

	public static void main(String[] args) {
		
		
		// hello   
		// 문자5개 배열을 사용하여 출려하기
		
		char a='h';
		char b='e';
		char c='l';
		char d='l';
		char e='o';
		
		
		//변수 출력하기 
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		System.out.print(e);
		
		
		
		//배열 사용해서 출력하기
		char[] str= new char[5];
		str[0]='h';
		str[1]='e';
		str[2]='l';
		str[3]='l';
		str[4]='o';
		
		System.out.print( str[0]);   //배열명[인덱스]
		System.out.print( str[1]);   //배열명[인덱스]
		System.out.print( str[2]);   //배열명[인덱스]
		System.out.print( str[3]);   //배열명[인덱스]
		System.out.print( str[4]);   //배열명[인덱스]
		
		//배열선언및 초기화
		char[] str2= new char[] {'h','e' ,'l' ,'l' ,'o'};
		
		
		//배열선언및 초기화
		char[] str3 = {'h','e' ,'l' ,'l' ,'o'};
		System.out.print( str3[0]);   //배열명[인덱스]
		System.out.print( str3[1]);   //배열명[인덱스]
		System.out.print( str3[2]);   //배열명[인덱스]
		System.out.print( str3[3]);   //배열명[인덱스]
		System.out.print( str3[4]);   //배열명[인덱스]
		
		
		
		

	}

}
