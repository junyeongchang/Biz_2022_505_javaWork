package com.callor.var;

public class Var_03 {
	public static void main(String[] args) {

		double doNum1 = 0.0;
		double doNum2 = 0.0;

		// Math.random() : 0.0000 ~ 0.999 범위의 실수가 생성
		
		/*
		 * double doNum1 = Math.random();
		 * doNum1 *=1000;
		 * 
		 * Math.random()이 실행된 결과가 담긴 doNom1 변수의 값에 1000을 곱하여 다시 doNum1 에 저장하라
		 * 
		 * doNum1 = donum1 * 1000; 과 같다.
		 * doNum1 : 0.000~999.999 범위의 실수가 저장
		 * 
		 * doNum1++;
		 * 
		 * doNum1 에 담긴 값에 1을 더하여 다시 doNum1에 저장
		 * doNum1 : 1.000~1000.999범위의 실수가 저장
		 */
		doNum1 = Math.random() * 1000 + 1;
		doNum2 = Math.random() * 1000 + 1;
		
		int intNum1 = (int)doNum1;
		int intNum2 = (int)doNum2;
		
		int intSum = intNum1 + intNum2;
		int intDes = intNum1 - intNum2;
		int intMulty = intNum1 * intNum2;
		int intDiv = intNum1 / intNum2;
		

		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intSum);
		System.out.printf("%d - %d = %d\n", intNum1, intNum2, intDes);
		System.out.printf("%d * %d = %d\n", intNum1, intNum2, intMulty);
		System.out.printf("%d / %d = %d\n", intNum1, intNum2, intDiv);

	}

}
