package com.javaex.ex04;

import java.util.Objects;

public class Rectangle {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	
	//메소드-gs
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	
	//메소드-일반

	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		boolean result;
		
		if(this.width == r.width && this.height == r.height) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
}
