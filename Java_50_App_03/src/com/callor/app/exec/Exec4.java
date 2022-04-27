package com.callor.app.exec;

public class Exec4 {

	/*
	 * 1 ~ 100까지 임의 수를 생성하고 그 수가 소수(prime number)인지 판별하시오
	 */
	public static void main(String[] args) {

		int num = (int) (Math.random() * 100) + 1;
		int check = 0;
		for (int i = 1; i < (num - 1); i++) {
			if (num % (i + 1) == 0) {
				check++;
			}
		}

		boolean bPrime = false;
		bPrime = check > 0;
		if (bPrime) {
			System.out.println(num + " 은 소수가 아닙니다.");
		} else {
			System.out.println(num + " 은 소수입니다.");
		}

	}

}
