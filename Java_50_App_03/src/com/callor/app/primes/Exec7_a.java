package com.callor.app.primes;

public class Exec7_a {

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

		int count = 0;
		for (int i = 0; i < intNums.length; i++) {

			int index = 0;
			for (index = 2; index < intNums[i]; index++) {
				if (intNums[i] % index == 0) {
					break;
				}
			}
			// if( index >= nums[i])
			if (!(index < intNums[i])) {
				count++;
			}

		}
		System.out.println("소수의 개수 : " + count);

	}
}
