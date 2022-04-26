package com.yedam.java.ch09_01;

public class E {
	//필드
	//인스턴스필드
	F f = new F();
	G g = new G();
	
	//정적필드 - 인스턴스없이 사용가능
	//static F f1 = new F();
	static G g1 = new G();
	
	//생성자
	
	
	//메소드
	//인스턴스메소드
	void method1() {
		F f = new F();
		G g = new G();
	}
	
	//정적메소드
	static void method2() {
		//F f = new F();
		G g = new G();
	}
	
	
	//인스턴스멤버클래스
	class F {}
	//정적멤버클래스
	static class G {}
}
