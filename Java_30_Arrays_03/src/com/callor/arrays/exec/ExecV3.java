package com.callor.arrays.exec;

public class ExecV3 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}

		int intEvenCount = 0;
		for (int i = 0; i < intNums.length; i++) {
			boolean bEven = false;
			bEven = (intNums[i] % 2) == 0;

			if (bEven) {
				intEvenCount++;
			}
		}

		System.out.printf("짝수는 %d개 입니다.\n", intEvenCount);

	}

}
