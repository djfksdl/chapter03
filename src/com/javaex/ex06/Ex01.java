package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		String s01 = "안녕하세요"; // 처음이라 같은게 있는지 뒤져봐도 없으니까 새로 만든다.
//		String s02 = s01;
		String s02 = "안녕하세요"; // 같은 문자열을 가진 객체를 찾아서 연결한다.
		                       // 같은게 있으면 새로 만들지 않는다.
		
		System.out.println(s01);
		System.out.println(s02);
		
//		s01 = "안녕";
//		System.out.println(s01);
//		System.out.println(s02);
		
		System.out.println(s01 ==s02); //주소가 같다
		
		s01 ="안녕";
		System.out.println(s01 == s02); // 주소가 달라진다.
		System.out.println(s01);
		System.out.println(s02);
		
		System.out.println("===========================");
		
		String s03 = new String("하이");
		String s04 = new String("하이");
		
		System.out.println(s03==s04); //원래 규칙대로 만들면 주소 다르게 둘다 새롭게 만들어짐
	}

}
