package com.yedam.java.ch11_01;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		
//		Class clazz = Member.class;
//		Class clazz = Class.forName("com.yedam.java.ch11_01.Member");
		
		Member mem = new Member("red");
		Class clazz =mem.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		
		System.out.println();
		String textPath = clazz.getResource("info.txt").getPath();
		System.out.println(textPath);
		
	}
}
