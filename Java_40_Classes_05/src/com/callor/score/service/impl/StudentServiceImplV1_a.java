package com.callor.score.service.impl;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1_a implements StudentService {

	// 학생데이터들을 저장할 배열변수
	private StudentVO[] stVO;
	// 학생데이터가 저장된 text file 이름
	private String stFile;

	public StudentServiceImplV1_a() {
		// TODO Auto-generated constructor stub
	}

	public StudentServiceImplV1_a(String stFile, int length) {
		this.stFile = stFile;
		this.stVO = new StudentVO[length];
		for (int i = 0; i < this.stVO.length; i++) {
			this.stVO[i] = new StudentVO();
		}
	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public StudentVO[] getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
