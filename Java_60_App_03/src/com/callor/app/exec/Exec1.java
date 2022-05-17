package com.callor.app.exec;

public class Exec1 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100) + 1;
			boolean bEven = false;
			bEven = num % 2 == 0 ? true : false;
			String strEven = "";
			strEven = bEven == true ? "짝수" : "홀수";
			System.out.printf("%3d : %s\n", num, strEven);
		} // end for

		System.out.println();

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100) + 1;
			if (num % 2 == 0) {
				System.out.printf("%3d : 짝수\n", num);
			} else {
				System.out.printf("%3d : 홀수\n", num);
			}
		} // end for
	} // end main
}
