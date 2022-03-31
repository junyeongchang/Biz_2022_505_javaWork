package com.callor.controller;

public class Boolean_01 {

	public static void main(String[] args) {

		int intNum1 = (int) (Math.random() * 1000) + 1;
		int intNum2 = (int) (Math.random() * 1000) + 1;

		boolean bEq = intNum1 == intNum2;
		boolean bNotEq = intNum1 != intNum2;
		boolean bGt = intNum1 > intNum2; // greate than
		boolean bLt = intNum1 < intNum2; // less than
		/*
		 * 논리적 오류(문제가)가 있는 코드
		 * 아래 코드에서 intNum1 과 intNum2의 같음과 크기를
		 * 비교하여 그 결과를 보여주고 있다.
		 * 하지만 처음 같은지 비교를 하고 결과가 false이면
		 * 서로 다른지 비교를 한다. 당연히 같지않으면 bNotEq가 true가 될것이고
		 * 이후의 else if 명령문은 전혀 실행하지 않는 코드가 된다.
		 */
		if (bEq) {
			System.out.printf("%d 와 %d 는 같다\n", intNum1, intNum2);
		} else if (bNotEq) {
			System.out.println("두수는 서로 다르다");
		} else if (bGt) {
			System.out.printf("%d 가 %d 보다 크다\n", intNum1, intNum2);
		} else if (bLt) {
			System.out.printf("%d 가 %d 보다 작다\n", intNum1, intNum2);
		}

	}

}
