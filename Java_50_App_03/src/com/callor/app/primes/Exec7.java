package com.callor.app.primes;

public class Exec7 {

	/*
	 * 100개의 배열을 만들고
	 * 2~101까지 임의 정수를 각 요소에 저장
	 * 각 요소에 저장된 값 중에 소수가 몇 개인지 찾아서 출력
	 */
	public static void main(String[] args) {

		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 2;
		}
		/* 내가 한거
		int count = 0;
		for (int i = 0; i < intNums.length; i++) {
			int intPrime = 2;

			while (intNums[i] > intPrime) {
				if (intNums[i] % intPrime == 0) {
					count++;
					break;
				}
				intPrime++;
			} // end while

		} // end for
		System.out.println(intNums.length - count);
		*/
		int intPrime = 0;
		for (int i = 0; i < intNums.length; i++) {
			intPrime += isPrime(intNums[i]);
		}
		System.out.println("소수의 개수는 : " + intPrime);
		System.out.println("소수가 아닌 수의 개수는 : " + (intNums.length - intPrime));

	} // end main

	public static int isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
