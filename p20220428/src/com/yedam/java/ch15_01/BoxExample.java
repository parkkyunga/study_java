package com.yedam.java.ch15_01;

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObject("홍길동");
//		
//		String name = (String) box.getObject();
//		
//		box.setObject(new Apple());
//		Apple apple = (Apple) box.getObject();
		
		
		Box<String> stringBox = new Box<String>();
		stringBox.set("gildong hong");
		String name = stringBox.get();
		
		
		Box<Apple> appleBox = new Box<Apple>();
		
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		
		System.out.println(name+apple);
		
	}
}
