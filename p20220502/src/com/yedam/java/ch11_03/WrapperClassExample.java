package com.yedam.java.ch11_03;

public class WrapperClassExample {
	public static void main(String[] args) {
		// Boxing
		Integer obj1 = Integer.valueOf("300");
		Integer obj2 = Integer.valueOf(300);

		// Unboxing
		int value1 = obj1.intValue();
		System.out.println(value1);

		// 자동Boxing
		Integer obj = 100; // heap영역에 새로운 객체생성됨
		System.out.println("value : " + obj.intValue());

		// 대입시 자동Unboxing
		int value = obj;// heap영역에 있는 객체의 값을 복사
		System.out.println("value : " + value);

		// 연산시 자동언박싱
		int result = obj + 100;// 100+100
		System.out.println("result : " + result);

		// 포장객체비교
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("== 결과  : " + (obj3 == obj4));
		System.out.println("언박싱후 == 결과 : " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과 : " + obj3.equals(obj4));

		System.out.println("[-128~127 초과값일 경우]");
		Integer obj5 = 300;
		Integer obj6 = 300;
		System.out.println("== 결과  : " + (obj5 == obj6));
		System.out.println("언박싱후 == 결과 : " + (obj5.intValue() == obj6.intValue()));
		System.out.println("equals() 결과 : " + obj5.equals(obj6));

	}
}
