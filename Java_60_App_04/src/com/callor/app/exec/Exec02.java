package com.callor.app.exec;

public class Exec02 {

	public static void main(String[] args) {

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}

		int evenSum = 0;
		int evenCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				evenSum += nums[i];
				evenCount++;
			}
		}

		System.out.println("짝수의 개수 : " + evenCount);
		System.out.println("짝수의 합 : " + evenSum);

	}

}
