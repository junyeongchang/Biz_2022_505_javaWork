package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec3 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums.add(num);
		}

		int index = 0;
		int size = nums.size();
		for (int i = 0; i < size; i++) {
			if (nums.get(i) >= 55) {
				index = i;
			}
		}
		System.out.printf("%3d : %3d \n", index, nums.get(index));

		for (int i = size - 1; i > -1; i--) {
			if (nums.get(i) >= 55) {
				System.out.printf("%3d 번째 %3d\n", i, nums.get(i));
				break;
			}
		}
		
		
	}

}
