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
		
		//obj.toString
		System.out.println(obj.toString()); 
		System.out.println(obj); // println이 가지고 있는 능력: 주소가 들어오면 toString을 찍게 되어있다. 
		//만약 toString이 없는애가 있으면 에러가 날텐데 모든 것의 부모는 Object라 toString이 있다.
		//주소를 넣어주면 알아서 println이 toString을 찾는다. 근데 안만들어놨으면 오류 생김
		
		//hashCode()
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		System.out.println(obj01.hashCode()); //숫자는 매일 바뀔 수 있음.
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		
		//equals()
		System.out.println(obj01.equals(obj01));
		System.out.println(obj01.equals(obj02));//다르다고 나옴

		System.out.println(obj01==obj01);// ==는 2개의 주소값을 비교하는것이라고 이미 정의 되어있음 
		System.out.println(obj01==obj03);//2개의 주소값을 비교하는것
	}

}
