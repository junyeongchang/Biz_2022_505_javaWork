package com.callor.app.exec;

public class Exec3 {

	public static void main(String[] args) {

		int[] nums = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(i + "번째요소 : " + nums[i]);
		}

		int intSum = 0;
		for (int i = 0; i < nums.length; i++) {
			intSum += nums[0];
		}

		System.out.println("합 : " + intSum);

		float fAvg = (float) intSum / nums.length;
		System.out.printf("평균 : %3.2f", fAvg);
	}

}
