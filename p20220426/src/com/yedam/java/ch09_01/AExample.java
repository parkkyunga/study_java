package com.yedam.java.ch09_01;

public class AExample {
	public static void main(String[] args) {
		A a = new A();
		A tempA = new A();
		
		//인스턴스 멤버 클래스 객체생성
		A.B b = a.new B();
		A.B tempB = tempA.new B();
		
		//정적멤버클래스 객체생성
		A.C c =new A.C();
		
		A.C.field2 = 0;
		
		//로컬클래스 객체생성
		a.method();
	}
}
