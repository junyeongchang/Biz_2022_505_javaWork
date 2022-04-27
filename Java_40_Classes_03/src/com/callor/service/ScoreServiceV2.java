package com.callor.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.utils.Line;

public class ScoreServiceV2 extends ScoreServiceV1 {

	private ScoreV2VO[] scores;

	public ScoreServiceV2() {
	}

	// 학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV2(String[] stNames) {
		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for (int i = 0; i < length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("빛나고교 성적표 v1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%4d\t",scores[i].getStName());
			System.out.printf("%4d\t",scores[i].getIntKor());
			System.out.printf("%4d\t",scores[i].getIntEng());
			System.out.printf("%4d\t",scores[i].getIntMath());
			System.out.printf("%6d\t",scores[i].getIntSum());
			System.out.printf("%4.2f\n", scores[i].getfAvg());
		}
		System.out.println(Line.sLine(50));

		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int sumSum = 0;
		float sumAvg = 0;
		for (int i = 0; i < scores.length; i++) {
			korSum += scores[i].getIntKor();
			engSum += scores[i].getIntEng();
			mathSum += scores[i].getIntMath();
			sumSum += scores[i].getIntSum();
			sumAvg += scores[i].getfAvg();
		}
		sumAvg /= (float) scores.length;
		System.out.printf("총  점\t%d\t%d\t%d\t%d\t%3.2f", korSum, engSum, mathSum, sumSum, sumAvg);
	}

}
