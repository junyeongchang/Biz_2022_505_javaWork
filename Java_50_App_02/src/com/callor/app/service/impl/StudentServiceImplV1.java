package com.callor.app.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.domain.StudentVO;
import com.callor.app.service.StudentService;
import com.callor.app.utils.IndexInfo;

public class StudentServiceImplV1 implements StudentService {

	private final List<StudentVO> stList;
	private final String stFileName;

	public StudentServiceImplV1() {
		List<StudentVO> sts = new ArrayList<>();
		this.stList = sts;
		this.stFileName = "";
	}

	public StudentServiceImplV1(List<StudentVO> stList, String stFileName) {
		this.stList = stList;
		this.stFileName = stFileName;
	}

	@Override
	public void loadStudent() {

		InputStream is = null;

		try {
			/*
			 * stFilename파일을 open하여 InputStream으로 변환 한 후 is객체에 저장
			 */
			is = new FileInputStream(this.stFileName);
		} catch (FileNotFoundException e) {
			System.out.println(stFileName + " 파일을 찾을수 없습니다.");
			return;
		}
		/*
		 * file정보가 담긴 is 객체를 Scanner와 연결
		 */
		Scanner fileRead = new Scanner(is);
		// Scanner 통하여 파일을 읽어오기
		// 파일에 읽을 내용이 있는지 확인하면서 while() 반복문 실행
		while (fileRead.hasNext()) {
			// 파일에서 한 라인의 문자열 읽기
			String stLine = fileRead.nextLine();
			// 읽어 들인 문자열을 콜론(:)을 기준으로 분해하기
			// 분해된 문자열들을 문자열 배열을 만들고 저장하기
			String[] stInfo = stLine.split(":");

			// 분해된 문자열이 담긴 배열에서 각 요소 값을 읽어 변수에 담기
			String stNum = stInfo[IndexInfo.ST.ST_NUM];
			String stName = stInfo[IndexInfo.ST.ST_NAME];
			String stDept = stInfo[IndexInfo.ST.ST_DEPT];
			String stGrade = stInfo[IndexInfo.ST.ST_GRADE];
			int intGrade = Integer.valueOf(stGrade);
			String stAddr = stInfo[IndexInfo.ST.ST_ADDR];
			String stTel = stInfo[IndexInfo.ST.ST_TEL];

			// 각 변수에 담긴 학생정보의 요소들을 VO객체에 담기
			// VO 클래스의 필드생성자를 사용하여 값이 담긴 stVO 생성
			StudentVO stVO = new StudentVO(stNum, stName, intGrade, stDept, stAddr, stTel);
			// VO객체에 담긴 학생의 정보를 list에 추가
			stList.add(stVO);
		} // end while
		try {
			// 열린 파일을 닫기
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 열린 Scanner resource 반납하기
		fileRead.close();

	}

	@Override
	public List<StudentVO> getStudents() {
		return this.stList;
	}

	@Override
	public StudentVO findByStNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> fintByStName(String stName) {
		// TODO Auto-generated method stub
		return null;
	}

}
