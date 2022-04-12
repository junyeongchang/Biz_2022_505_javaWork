package com.callor.arrays.exec;

public class ExecV1 {

	public static void main(String[] args) {

		int intNum = 0;
		intNum = (int) (Math.random() * 100) + 1;

		boolean bEven = false;
		bEven = (intNum % 2) == 0;
		if (bEven) {
			System.out.println(intNum + "는 짝수입니다.");
		} else {
			System.out.println(intNum + "는 짝수가 아닙니다.");
		}
	}

}
