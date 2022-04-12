package com.callor.arrays.exec;

public class ExecV2 {

	public static void main(String[] args) {

		int[] intNums = new int[100];

		// for() 명령문의 선언부에서 변수를 선언하면
		// for() { }이 끝날때 변수가 소멸된다.
		// 같은 method 내에서 같은 이름의 변수를 계속 사용할수 있다.
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < intNums.length; i++) {

			boolean bEven = false;
			bEven = (intNums[i] % 2) == 0;

			if (bEven) {
				System.out.println(intNums[i] + "는 짝수입니다.");
			} else {
				System.out.println(intNums[i] + "는 짝수가 아닙니다.");
			}
		}

	}
}
