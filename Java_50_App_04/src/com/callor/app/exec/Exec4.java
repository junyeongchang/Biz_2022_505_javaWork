package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.getlist.GetValue;

public class Exec4 {

	public static void main(String[] args) {
		List<Integer> nums = GetValue.getList(100);

		int max = 0;
		int index = 0;
		int size = nums.size();
		for (int i = 0; i < size; i++) {
			if (nums.get(i) > max) {
				max = nums.get(i);
				index = i;
			}
		}
		System.out.printf("%3d 번째 : %3d\n", index, nums.get(index));
		
		
		//max 값과 일치하는 최초의 요소 위치를 알려주는 method
		int index2 = nums.indexOf(max);
		System.out.println("가장 큰 수가 가장 처음 나타난 위치" + index2);
	}

}
