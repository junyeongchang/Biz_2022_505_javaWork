package com.callor.app.exec;

import com.callor.app.model.BookVO;

public class Exec05 {

	public static void main(String[] args) {

		BookVO[] bookVO = new BookVO[10];
		int index = 2;
		bookVO[index] = new BookVO();
		bookVO[index].setTitle("자바의 정석");
		bookVO[index].setComp("도울출판사");
		System.out.println("도서명: " + bookVO[index].getTitle());
		System.out.println("출판사: " + bookVO[index].getComp());

	}

}
