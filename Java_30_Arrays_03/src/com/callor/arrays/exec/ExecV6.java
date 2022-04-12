package com.callor.arrays.exec;

public class ExecV6 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}

		int count = 0;
		for (int i = 0; i < intNums.length; i++) {

			boolean bEven = false;
			bEven = (intNums[i] % 2) == 0;
			if (bEven) {
				System.out.print(intNums[i] + ",\t");
				count++;
				boolean bLine = false;
				bLine = (count % 5) == 0;
				if (bLine) {
					System.out.println();
				}
			}

		}

	}

}
