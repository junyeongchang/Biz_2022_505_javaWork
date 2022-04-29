package com.callor.app.service;

import java.util.List;

import com.callor.app.model.ScoreVO;

public interface ScoreService {
	
	public List<ScoreVO> makeScore();
	public void scorePrint(List<ScoreVO> stScores);
	
}
