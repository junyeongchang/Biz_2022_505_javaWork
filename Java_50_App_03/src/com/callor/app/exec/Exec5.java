package com.callor.app.exec;

public class Exec5 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 100) + 2;
		int iFlag = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				iFlag++; // iFlag = 1;
				break;
			}
		}
		if(iFlag == 0) {
			System.out.println(num + "는 소수");
		}else {
			System.out.println(num + "는 소수가 아님");
		}
		
		// 안전한 조건 검사
		if(iFlag > 0) {
			System.out.println(num + "는 소수");
		}else {
			System.out.println(num + "는 소수가 아님");
		}

	}

}
