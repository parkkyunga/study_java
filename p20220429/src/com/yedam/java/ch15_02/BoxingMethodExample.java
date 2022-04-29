package com.yedam.java.ch15_02;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box = Util.<Integer>boxing(100);
		//무슨타입으로 파라미터넘길지 지정해줘야<>
		int intValue = box.getT();
		
		Box<String> strBox = Util.<String>boxing("홍길동");
		String strValue = strBox.getT();
		
		
	}
}
