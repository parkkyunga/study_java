package com.yedam.java.ch16_01;

public class MyFunctionalInterfaceExample2 {
	// 매개변수있고 리턴값 없는 람다식
	public static void main(String[] args) {
		MyFunctionalInterface2 fi;
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result); };
		fi.method(10);
		
		fi = (x) -> {System.out.println(x * 5); };
		fi.method(4);
		
		fi = x -> System.out.println(x * 5);
		fi.method(3);

	}
}
