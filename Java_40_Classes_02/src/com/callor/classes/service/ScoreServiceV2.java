package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV2 {

	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int lineLength;

	public ScoreServiceV2() {
		this(10);
	}

	public ScoreServiceV2(int length) {
		student = new String[length];
		intKor = new int[length];
		scan = new Scanner(System.in);
		lineLength = 50;
	}

	public int input() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("대한 고교 성적처리 V2");
		System.out.println(Line.sLine(lineLength));
		int index = 0;
		while (index < student.length) {
			System.out.print("이름(END:중단) >> ");
			String strName = scan.nextLine();
			if (strName.equals("END")) {
				return -1;
			}
			student[index] = strName;
			String strKor = "";
			while (true) {
				try {
					System.out.print("점수(정수로, END:중단) >> ");
					strKor = scan.nextLine();
					if (strKor.equals("END")) {
						return -1;
					}
					intKor[index] = Integer.valueOf(strKor);
					break;
				} catch (Exception e) {
					System.out.println("입력한 \"" + strKor + "\"는 점수로 변경 불가!!!");
				}
			} // end while
			index++;
		} // end while
		return 0;
	} // end input()
}
