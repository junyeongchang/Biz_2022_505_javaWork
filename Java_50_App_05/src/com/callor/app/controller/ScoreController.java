package com.callor.app.controller;

import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImpl;

public class ScoreController {

	public static void main(String[] args) {

		ScoreService scoreService = new ScoreServiceImpl();
		List<ScoreVO> stScores = scoreService.makeScore();
		scoreService.scorePrint(stScores);

	}

}
