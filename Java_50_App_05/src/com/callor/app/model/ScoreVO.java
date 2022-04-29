package com.callor.app.model;

public class ScoreVO {
	private int stNum;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float fAvg;

	public ScoreVO() {

	}

	public ScoreVO(int stNum, int intKor, int intEng, int intMath) {
		super();
		this.stNum = stNum;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
		this.intSum = intKor + intEng + intMath;
		this.fAvg = (float) (intKor + intEng + intMath) / 3.0f;
	}

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntSum() {
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getFavg() {
		return fAvg;
	}

	public void setFAvg(float fAvg) {
		fAvg = fAvg;
	}

	@Override
	public String toString() {
		return "ScoreVO [stNum=" + stNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath + "]";
	}

}
