package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec2A {
	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			nums.add((int) (Math.random() * 100) + 1);
		}

		int size = nums.size();
		for (int i = 0; i < size; i++) {
			if (nums.get(i) >= 55) {
				System.out.println(nums.get(i) + " 은 " + i + "번째 요소");
			}
		}

	}
}
