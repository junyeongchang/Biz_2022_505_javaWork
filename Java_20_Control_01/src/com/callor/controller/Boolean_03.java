package com.callor.controller;

public class Boolean_03 {
	public static void main(String[] args) {

		boolean bYes = true;
		boolean bWhat = bYes;

		// bYes 에 저장된 값이 false인가 물어보는 연산이 실행되고
		// 그 결과가 bWhat 에 저장된다.
		bWhat = bYes == false;

		// bYes에 저장된 값이 true가 아니냐? 라고 물어보는 연산
		// 결과는 당연히 false
		bWhat = bYes != true;

		// ! : Not 연산기호
		// boolean 형 데이터를 반전시키는 연산
		// true가 담겨있으면 false, false 가 담겨있으면 true
		bWhat = !bYes;
		
		// !(Not 연사자)를 사용하여 변수 값을 true, false 가 반복되도록 하는 명령문들
		bWhat = !bWhat;
		bWhat = !bWhat;
		
	}
}
