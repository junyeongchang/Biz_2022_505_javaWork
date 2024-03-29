package com.callor.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.utils.Line;

public class ScoreServiceV1 {

	protected ScoreV2VO[] scores;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {
		scores = new ScoreV2VO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}

	// 학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV1(String[] stNames) {
		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for (int i = 0; i < length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void makeScore() {
		for (int i = 0; i < scores.length; i++) {
			int intKor = (int) (Math.random() * 50) + 51;
			int intEng = (int) (Math.random() * 50) + 51;
			int intMath = (int) (Math.random() * 50) + 51;

			scores[i].setIntKor(intKor);
			scores[i].setIntEng(intEng);
			scores[i].setIntMath(intMath);
		}
	}

	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("빛나고교 성적표 v1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));

		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i].getStName() + "\t");
			System.out.print(scores[i].getIntKor() + "\t");
			System.out.print(scores[i].getIntEng() + "\t");
			System.out.print(scores[i].getIntMath() + "\t");
			System.out.print(scores[i].getIntSum() + "\t");
			System.out.printf("%3.2f\n",scores[i].getfAvg());
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
		//System.out.printf("%6s\t","총점");
	}

}
