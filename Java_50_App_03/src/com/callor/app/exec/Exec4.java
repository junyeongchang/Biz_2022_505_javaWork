package com.callor.app.exec;

public class Exec4 {

	/*
	 * 1 ~ 100까지 임의 수를 생성하고 
	 * 그 수가 소수(prime number)인지 판별하시오 
	 * 소수 
	 *  1과 자신 이외의 약수를 갖지 않는 수
	 *  2부터(자신-1)까지 수로 나누었을때 
	 *  나머지가 한번도 0이 나오지 않는 수
	 */
	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		if (num == 1) {
			System.out.println("1입니다.");
		} else {
			int i = 0;
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println(num + " 은 소수가 아닙니다.");
					break;
				}
			}
			if(i == num) {
				System.out.println(num + " 은 소수입니다.");
			}
			
		}
		
		
	}
}
