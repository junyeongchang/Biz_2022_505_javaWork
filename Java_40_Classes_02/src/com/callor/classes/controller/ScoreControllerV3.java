package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {

		ScoreServiceV3 scoreServiceV3 = new ScoreServiceV3();
		scoreServiceV3 = new ScoreServiceV3(20);

		// String[] strNames = new String[5];
		// strName[0] = "홍길동";
		// strName[1] = "이몽룡";
		// strName[2] = "성춘향";
		// strName[3] = "임꺽정";
		// strName[4] = "장보고";
		String[] strNames = { "홍길동", "이몽룡", "성춘향", "임꺽정", "장보고" };

		scoreServiceV3 = new ScoreServiceV3(strNames);
	}

}
