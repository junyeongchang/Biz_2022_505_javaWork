package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;
import com.callor.app.utils.Line;

/*
 * V2 클래스를 상속받는 순간
 * makeScore(), printScore() method를 기본느올 사용할 수 있다.
 */
public class ScoreServiceImplV3 extends ScoreServiceImplV2 {
	public ScoreServiceImplV3() {
		/*
		 * super() method
		 * 상속받은(V2) 클래스의 기본생성자를 호출하여
		 * protected로 선언된 변수들을 초기화 하기
		 */
		super();
	}
	
	@Override
	public void printScore() {
		
		System.out.println(Line.dLine(lineLength));
		System.out.println("한국고교 성적일람표");
		System.out.println(Line.sLine(lineLength));
		for(String sub: subs) {
			System.out.print(sub + "\t");
		}
		System.out.println();
		System.out.println(Line.sLine(lineLength));
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int sumTotal = 0;
		
		for(ScoreVO scVO : scList) {
			System.out.print(scVO.toString());
			korTotal += scVO.getIntKor();
			engTotal += scVO.getIntEng();
			mathTotal += scVO.getIntMath();
			sumTotal += scVO.getIntSum();
		}
		System.out.println(Line.sLine(lineLength));
		
		System.out.printf("%5d\t", korTotal);
		System.out.printf("%5d\t", engTotal);
		System.out.printf("%5d\t", mathTotal);
		System.out.printf("%5d\n", sumTotal);
		System.out.println(Line.dLine(lineLength));
		
		
	}

}
