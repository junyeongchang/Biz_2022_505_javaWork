package com.callor.var;

public class Var_02 {
	public static void main(String[] args) {

		int intNum1 = 0;
		intNum1 = num1();
		System.out.println(intNum1);

		int intNum2 = 0;
		intNum2 = 33;
		intNum2 = intNum1;
		intNum2 = intNum1 + 100; // 0,33,100 값은 리터럴 이라고 한다. 리터럴(literal)이란 소스 코드의 고정된 값을 대표하는 용어
		intNum2 = add();

		/*
		 * add() : add method 라고 읽는다. add() 를 실행(run, 명령을 수행)하여 그 결과를 intNum2에 저장해 달라
		 */

	}// end main()

	/*
	 * add()를 선언하기
	 */
	public static int add() {
		// 정수 55와 33을 덧셈하여 return하기
		return 55 + 33;
	}

	/*
	 * num1()를 선언하기
	 */
	public static int num1() {
		return 100;
	}

}
