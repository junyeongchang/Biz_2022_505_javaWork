package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	protected final Scanner scan;
	protected final List<ScoreVO> scList;

	public ScoreServiceImplV1() {
		scList = new ArrayList<ScoreVO>(); // 오래된 자바에서는 ScoreVO 넣줘야되
		scan = new Scanner(System.in);
	}

	@Override
	public void inputScore() {
		ScoreVO scVO = new ScoreVO();
		while (true) {
			System.out.print("이름(QUIT : 종료) > ");
			String stName = scan.nextLine();
			if (stName.equals("QUIT")) {
				break;
			}
			scVO.setStName(stName);

			System.out.print("국어점수 > ");
			scVO.setIntKor(scanLineInt());
			System.out.print("영어점수 > ");
			scVO.setIntEng(scanLineInt());
			System.out.print("수학점수 > ");
			scVO.setIntMath(scanLineInt());
			
			scList.add(scVO);
		} // end while
		System.out.println("입력이 중단되었습니다.");
	}// end inputScore

	public Integer scanLineInt() {
		String stScore = scan.nextLine();
		Integer intScore = Integer.valueOf(stScore);
		return intScore;
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

}
