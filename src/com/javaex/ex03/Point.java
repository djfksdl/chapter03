package com.javaex.ex03;

public class Point {
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//메소드 - gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public boolean equals(Object obj) { //equals를 재정의한 이유? 내가 비교하고싶은 방법이랑 정의가 달라서 원하는 방향으로 재정의함
		Point p = (Point)obj;
		boolean result;
		
		if(this.x == p.x && this.y == p.y) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
}
