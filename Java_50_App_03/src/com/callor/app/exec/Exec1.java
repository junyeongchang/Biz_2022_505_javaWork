package com.callor.app.exec;

public class Exec1 {
	
	/*
	 * 10개의 정수형 배열을 생성하고
	 * 1 ~ 100까지 임의 정수를 생성하여
	 * 각 배열의 요소에 저장하시오
	 */
	public static void main(String[] args) {

		// int intLength = 10;
		// int[] intNums = new int[intLength];
		int[] intNums = new int[10];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i : intNums) {
			System.out.println(i);
		}

	}
}
