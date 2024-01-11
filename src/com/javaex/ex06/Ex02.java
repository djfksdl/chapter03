package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(",efg ");
		
//		a.concat(b); //a랑 b를 더함(문자열 2개를 합침)
		/*System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		System.out.println(a+b);*/
		
		System.out.println(a.concat(b));
		System.out.println(a);//원본에 합쳐지진않음. 원본은 그대로 유지
		
		a= a.concat(b);// a에 합친걸 넣어줌-> 그럼 a값이 바뀜
		System.out.println(a);
		
		a= a.trim();// 공백을 없애줌 벋 중간 공백은 안없애줌 양쪽 끝 공백만 없애줌!
		System.out.println(a);
		
		a= a.replace("ab", "12456789");// 자릿수 상관없이 앞의 문자가 뒤 문자로 바뀐다
		System.out.println(a);
		
		System.out.println("=====================");
		
		String[] sArray= a.split(",");// 넣은 기호(,)로 잘라라 -> 덩어리가 최소2개 나옴. -> 배열로 내보냄. 힙에 생기고 주소만 주는거임
		//맨날 new로 하는게 아님. 이런걸로도 만들 수 있다.
		//자를게 없어서 1자리더라도 배열로 온다!
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a); //자른건 새로만든 배열에 준거임. a는 그대로
		System.out.println("=====================");
		
		String str = "HEllo JAVA!"; //배열로 잡힘(ppt참조)
//		System.out.println(str.substring(3)); // 3~끝까지
//		System.out.println(str.substring(1,7)); // 1~6까지 나옴
		
		String result01 = str.substring(3); //어디서부터 어디까지 뽑고싶다하면!
		String result02 = str.substring(1,7);
		System.out.println(result01);
		System.out.println(result02);
		//String 은 안바뀌니까 새로 만든거임! 몇번째값을 바꾸는게 안됨. 그냥 뽑아서 읽는것만 됨. 바뀌어 보이는건 새로 만들어서 바꿔치기한거임
		
		char result03 = str.charAt(0); //한글자만 뽑고싶다하면!
		System.out.println(result03);
		
		System.out.println(str.toString()); // 우리가 쓰는 toString은 재정의된 toString이다. 원래 toString은 골뱅이값나옴!
		
		
		System.out.println("==================");
		String s01 = new String("안녕");
		String s02 = new String("안녕");
		
		if(s01==s02) { 
			System.out.println("주소 같음");
		}else {
			System.out.println("주소 다름");
		}
		
		if(s01.equals(s02)) { //애들이 만든 이퀄스는 한글자 한글자 비교하는거임 -- 다시 들어보기
			System.out.println("글자 같음");
		}else {
			System.out.println("글자 다름");
		}
		
		System.out.println("==================");
		
		String s03 = null; //여기는 주소가 오는곳, null이면 빈공간만 가지고있음. 주소가 없고... 그렇기 때문에 equals가 안된다.
		if("안녕".equals(s03)) { //주소가 없는 null인상태가 있는데 그럼 equals가 안된다.!!!
			//equals가 아예 안되는데 바꿔쓰면 이렇게 씀. -안그럼 null포인트 다 잡아내야함. (try- catch)
		}
		
		
		
	}

}
