package com.javaex.ex06;

public class Ex03 {
	public static void main(String[] args) {
		int a = 3; //문제 없음
		System.out.println(a);
		
		Integer i = new Integer(a);// 가운데 선이 생기는건 곧 없어질 기능이라는 뜻임
		System.out.println(i.toString());
		
		Integer sum = new Integer(3) + new Integer(3);
		System.out.println(sum.toString());
		
		Integer v01 = 3; //주소담는애라 문법적으로 말이 안되지만 오류 안남. 박싱
		System.out.println(v01.toString());//toString()은 값만 있으면 안됨 메소드가 있어야함.박싱됐기 때문에 가능
		
		int v02 = i; //주소라 안담겨야하는데 담긴다. 앞에 자료형을 따라감.- 언박싱
		System.out.println(v02); // 얘는 언박싱되서 메소드 없어져서 .메소드 기능 없어짐
		
		//문자->숫자로 바꾸기 : parseInt
		/*
		Integer r01 = 100; - static을 알고있는데 굳이 메모리에 올려서 또 만들필요 없음
		int result = r01.parseInt("1234567");
		System.out.println(result + 3);
		*/
		
		//문자열 --> 정수 : int가 가지는게 맞음. 반대면 String이 가지고 있는게 맞음
		int result = Integer.parseInt("12345");
		System.out.println(result + 3);
		
		/*String str = "안녕하세요";// 밑에 쓰기 위해서 굳이 문자를 만들어줌 (어색함) 따라서 static을 써줌
		String result02 = str.valueOf(555); 
		System.out.println(result02 + 2); //문자인걸 확인하기 위해 뒤에 숫자를 더해줌*/
		
		//정수--> 문자열
		String result02 = String.valueOf(1000);
		System.out.println(result02 + 2);
		
		String result03 = ""+ 999; //문자열+숫자 = 문자열이 됨.. 이걸더 많이 씀 (간단)!!!!
		
		System.out.println(999 + 2);
		System.out.println("999" + 2);
		
		//대문자로는 변수이름 지으면 헷갈린다.
		
	}
}
