package com.yedam.java.ch09_01;

public class A { //바깥클래스
	A(){
		System.out.println("A인스턴스가 생성됨");
	}
	
	//인스턴스 멤버클래스
	class B{
		//생성자
		B(){System.out.println("B인스턴스가 생성됨");}
		
		//필드
		int field1;
//		static field2; //static붙으면 접근불가
		
		//메소드
		void method1() {}
//		static void method2() {}
		
	}
	
	//정적멤버클래스 static붙음
	static class C{
		C(){System.out.println("C인스턴스가 생성됨");}
		
		//필드
		int field1;
		static int field2;
		
		//메소드
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		//로컬클래스-static 붙을수없음 
		class D {
			D(){
				System.out.println("D인스턴스가 생성됨");
			}
			//필드
			int field1;
//			static int field2;
			//메소드
			void method1(){}
//			static void method2() {}
		}
		D d = new D();
		
	}
}
