package com.callor.arrays.exec;

public class ExecV4 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}

		int intEvenSum = 0;
		for (int i = 0; i < intNums.length; i++) {
			boolean bEven = false;
			bEven = (intNums[i] % 2) == 0;

			if (bEven) {
				intEvenSum += intNums[i];
			}
		}

		System.out.println("짝수의 총합 : " + intEvenSum);
	}

}
