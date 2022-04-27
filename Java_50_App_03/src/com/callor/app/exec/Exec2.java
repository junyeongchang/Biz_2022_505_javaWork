package com.callor.app.exec;

public class Exec2 {

	/*
	 * 정수형 배열 10개를 생성하고
	 * 각 요소에 1~100까지 임의정수를 생성하여 저장하고
	 * 배열에 저장된 요소의 값을 모두 합산하여 출력
	 */
	public static void main(String[] args) {
		int[] intNums = new int[10];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}
		int intSum = 0;
		// 확장 for
		for (int i : intNums) {
			intSum += i;
		}
		/* 기본 for
		for(int i= 0 ;i < intNums.length; i++) {
			intSum += intNums[i];
		}
		*/
		System.out.println("총합계: "+intSum);
	}

}
