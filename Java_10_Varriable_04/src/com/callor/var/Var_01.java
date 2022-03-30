package com.callor.var;

public class Var_01 {

	public static void main(String[] args) {

		// 변수를 선언하고 clear(0을 저장 , 대입)
		int intNum1 = 0;
		int intNum2 = 0;

		// 변수에 값 저장(대입,할당)하기
		// 변수에 어떤 값을 저장하면 이미 저장된 값은? 무조건 사라진다.
		intNum1 = 33;
		intNum2 = 55;

		// 4칙연산 결과를 저장(보관)하기 위한 변수 선언 clear
		int intSum = 0;
		int intSubtract = 0;
		int intMultiply = 0;
		int intDivision = 0;

		// intNum1, intNum2 변수에 담긴 값을 읽어와서
		// 4칙연산을 수행한 후 각각의 변수에 저장하기
		// 변수에 담긴 값을 읽어서 연산을 수행한 후 다른 변수에 저장하기
		intSum = intNum1 + intNum2;
		intSubtract = intNum1 - intNum2;
		intMultiply = intNum1 * intNum2;
		intDivision = intNum1 / intNum2;

		// 화면에 form을 만든 후 출력하기
		System.out.printf("\t%d + %d = %d\n", intNum1, intNum2, intSum);
		System.out.printf("\t%d - %d = %d\n", intNum1, intNum2, intSubtract);
		System.out.printf("\t%d * %d = %d\n", intNum1, intNum2, intMultiply);
		System.out.printf("\t%d ÷ %d = %d\n", intNum1, intNum2, intDivision);

	}

}
