package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		Object obj = new Object();
		
		
		System.out.println(obj.getClass()); //클래스 정보
		System.out.println(obj.toString()); //java.lang.Object@58ceff1
		System.out.println(obj.hashCode()); //일단 주소라고 알자(실제는 주소와 매칭되는 다른 주소매칭과 겹치지 않는 수)
		System.out.println(obj.equals(obj)); //같냐?(비교대상이 필요한데 일단 없어서 자기자신과 비교함)

		System.out.println("===================================");
		
		//클래스 정보
		System.out.println(obj.getClass());
		
		//toString
		System.out.println(obj.toString()); 
		System.out.println(obj);
	}

}
