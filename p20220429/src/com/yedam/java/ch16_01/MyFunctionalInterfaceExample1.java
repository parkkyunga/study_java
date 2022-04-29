package com.yedam.java.ch16_01;

public class MyFunctionalInterfaceExample1 {
	// 매개변수도 리턴값도 존재하지않는 람다식
	public static void main(String[] args) {
		MyFunctionalInterface1 fi;
		
		//메소드에 뭐 출력할거 암것도 없음.. 끌어다 쓰기전에 정의해줌
		fi = () -> {
			String str = "method call1";
			System.out.println(str); };
		fi.method();
		
		fi = () -> { System.out.println("method call2"); };
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
		
	}

}
