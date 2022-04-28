package com.yedam.java.ch10_02;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");//문자열로 받은 클래스정보, 정상클래스값아닐수도
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("not found class");
		} finally {
			System.out.println("정상");
		}
		
	}
}
