package com.callor.app;

public class Exec1A {

	public static void main(String[] args) {

		int studentsNumber = (int) (Math.random() * 25) + 25;
		int div = studentsNumber / 6;
		int remain = studentsNumber % 6;

		if (remain > 0) {
			System.out.printf("학생수 %d 피자판수 %d", studentsNumber, div + 1);
		} else {
			System.out.printf("학생수 %d 피자판수 %d", studentsNumber, div);
		}
	}

}
