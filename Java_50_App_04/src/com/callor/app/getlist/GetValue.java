package com.callor.app.getlist;

import java.util.ArrayList;
import java.util.List;

public class GetValue {

	public static List<Integer> getList(int length) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums.add(num);
		}
		return nums;
	}

	public static int[] getArray(int length) {
		int[] nums = new int[length];
		for (int i = 0; i < nums.length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums[i] = num;
		}
		return nums;
	}

}
