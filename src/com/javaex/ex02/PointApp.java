package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		Point p00 = new Point(3,5);
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);
		Point p03 = p02;//새로 만들어진게 아니라 p02에 있는 주소를 p03에 주는거임
		
		//클래스 정보보기-같은 클래스 소속이라 3개가 다 같게 나옴
		System.out.println(p00.getClass()); 
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		
		System.out.println("==========================");

		//toString() - 쓰는 이유: 보통 개발하다보면 찍어줄 일이 생김. 
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02);//옆에 안써줘도 써짐. 근데 부모에서 안써주면 에러난다. 그러니까 toString만들어짐
		
		System.out.println("==========================");

		//hashCode() - 기본값이 나오긴하는데 우리가 숫자를 수정할 수 있는 방법이 있음.
		System.out.println(p00.hashCode()); 
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println("==========================");
		
		//equals()
		System.out.println(p00.equals(p01)); //p00의 부모의 equal사용(로직은 같다)
		System.out.println(p01.equals(p00)); //p01의 부모의 equal사용(로직은 같다)
		
		System.out.println(p02.equals(p03)); //같다
		
		
		
		
		
		
	}

}
