package com.callor.app.exec;

public class Exec1 {

	public static void main(String[] args) {
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums[i] = num;
		}

		for (int num : nums) {
			if (num >= 55) {
				System.out.println(num);
			}
		}

	}
}
