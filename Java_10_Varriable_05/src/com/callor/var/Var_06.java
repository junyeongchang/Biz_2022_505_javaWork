package com.callor.var;

public class Var_06 {

	public static void main(String[] args) {

		int intNumber = (int) Math.random() * 1000;
		int intAge = (int) (Math.random() * 100) + 10;
		
		String strName = "홍길동";
		
		System.out.printf("\t%s의 나이는 %d이다", strName, intAge);

	}

}
