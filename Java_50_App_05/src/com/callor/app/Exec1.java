package com.callor.app;

public class Exec1 {

	public static void main(String[] args) {
		// 25~50까지 정수 생성하기
		int num = (int) (Math.random() * 25) + 25;
		int pizza = 6;
		/*
		 * 피자가 한파나에 6조각
		 * 피자를 부족하지 않도록 먹기위해서
		 * 최소 몇판의 피자가 필요한가
		 * 
		 * 인원수/피자수로 나누었을때
		 * 그 결과가 0이거나 최소 1이상 이어야한다.
		 */
		if (num % pizza == 0) {
			System.out.printf("인원 %d 는 %d 의 피자가 필요", num, num / pizza);
		} else {
			int pan = (num / pizza) + 1;
			System.out.printf("인원 %d 는 %d 의 피자가 필요", num, pan);
		}
	}

}
