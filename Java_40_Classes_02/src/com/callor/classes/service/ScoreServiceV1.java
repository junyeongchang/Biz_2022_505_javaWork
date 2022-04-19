package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV1 {

	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int lineLength;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {
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
				break;
			}
			student[index] = strName;
			String strKor = "";
			while (true) {
				try {
					System.out.print("점수(정수로, END:중단) >> ");
					strKor = scan.nextLine();
					if (strKor.equals("END")) {
						break;
					}
					intKor[index] = Integer.valueOf(strKor);
					break;
				} catch (Exception e) {
					System.out.println("입력한 \"" + strKor + "\"는 점수로 변경 불가!!!");
				}
			} // end while
			index++;
		} // end while

		/*
		 * 입력을 배열의 개수만큼 모두 마치고 정상 종료하면 0을 return
		 * 입력 도중 END를 입력하여 중단하였으면 -1을 return
		 */
		if (index < student.length) { // 도중에 END를 입력함
			return -1;
		} else { // 모두 입력 끝
			return 0;
		}
	} // end input()
}
