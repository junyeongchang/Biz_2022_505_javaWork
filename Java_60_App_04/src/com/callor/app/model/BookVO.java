package com.callor.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BookVO {
	private String title;
	private String comp;
	private String autor;
	private String pubDate;
	private int price;
}
