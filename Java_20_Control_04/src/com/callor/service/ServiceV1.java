package com.callor.service;

public class ServiceV1 { 

	/*
	 * void type method를 guguDan 이름으로 선언하기 void type method는 return 명령이 없어도 된다.
	 */
	public void guguDan() {

		int intDan = 3; 
		int intIndex = 1;

		//System.out.printf("%d x %d = %d\n", intDan, intIndex, (intDan*intIndex++));
		System.out.println(intDan + " x " + intIndex + " = " + (intDan * intIndex++));
		System.out.println(intDan + " x " + intIndex + " = " + (intDan * intIndex++));
		System.out.println(intDan + " x " + intIndex + " = " + (intDan * intIndex++));
		System.out.println(intDan + " x " + intIndex + " = " + (intDan * intIndex++));
		System.out.println(intDan + " x " + intIndex + " = " + (intDan * intIndex++));
		System.out.println(intDan + " x " + intIndex + " = " + (intDan * intIndex++));
		System.out.println(intDan + " x " + intIndex + " = " + (intDan * intIndex++));
		System.out.println(intDan + " x " + intIndex + " = " + (intDan * intIndex++));
		System.out.println(intDan + " x " + intIndex + " = " + (intDan * intIndex++));

	}
}
