package com.callor.app.primes;

public class Exec71 {

	public static void main(String[] args) {

		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			int num = (int) (Math.random() * 100) + 2;
			nums[i] = num;
		}

		int count = 0;
		for (int num : nums) {
			
			int index = 0;
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}
			}
			if (index >= num) {
				count++;
			}
			
		}
		
		System.out.println("소수의 개수 : " + count);
	}

}
