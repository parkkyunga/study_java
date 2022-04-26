package com.yedam.java.ch09_02;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//익명객체필드사용
		anony.field.wake();
		
		//익명객체로컬변수사용
		anony.method1();
		
		//익명객체매개변수사용
		anony.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}
			
			@Override
			public void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}
}
