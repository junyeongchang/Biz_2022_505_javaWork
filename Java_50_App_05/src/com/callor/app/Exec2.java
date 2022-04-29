package com.callor.app;

public class Exec2 {

	public static void main(String[] args) {

		int salaly = 3905320;
		int num = 0;
		int first = 50000;
		for (int i = 1; i < 9; i++) {
			num = salaly / first;
			System.out.println(num);
			salaly = salaly - num * first;
			if (i % 2 == 0) {
				first /= 2;
			} else {
				first /= 5;
			}
		}
		
	}
}
