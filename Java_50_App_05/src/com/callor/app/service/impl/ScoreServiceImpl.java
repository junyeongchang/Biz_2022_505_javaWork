package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.callor.app.utils.Line;

public class ScoreServiceImpl implements ScoreService {

	private List<ScoreVO> stScores;

	public ScoreServiceImpl() {
		stScores = new ArrayList<>();
	}

	@Override
	public List<ScoreVO> makeScore() {

		for (int i = 0; i < 20; i++) {
			int intKor = (int) (Math.random() * 50) + 50;
			int intEng = (int) (Math.random() * 50) + 50;
			int intMath = (int) (Math.random() * 50) + 50;
			ScoreVO scoreVO = new ScoreVO(i, intKor, intEng, intMath);
			stScores.add(scoreVO);
		}

		return stScores;
	}

	@Override
	public void scorePrint(List<ScoreVO> stScores) {
		System.out.println(Line.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));
		int size = stScores.size();
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		int intSum = 0;
		float fAvg = 0;
		for (int i = 0; i < size; i++) {
			System.out.print(stScores.get(i).getStNum()+ "\t");
			System.out.print(stScores.get(i).getIntKor()+ "\t");
			System.out.print(stScores.get(i).getIntEng()+ "\t");
			System.out.print(stScores.get(i).getIntMath()+ "\t");
			System.out.print(stScores.get(i).getIntSum()+ "\t");
			System.out.printf("%2.2f\n",stScores.get(i).getFavg());
			intKor += stScores.get(i).getStNum();
			intEng += stScores.get(i).getIntEng();
			intMath += stScores.get(i).getIntMath();
			intSum += stScores.get(i).getIntSum();
		}
		System.out.println(Line.dLine(50));
		System.out.printf("총점 : %6d %6d %6d %8d", intKor, intEng, intMath, intSum);

	}

}
