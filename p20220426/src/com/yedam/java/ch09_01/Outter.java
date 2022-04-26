package com.yedam.java.ch09_01;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field); //먼저 내부 필드값을 찾음, nested내field - 그래도모르니this붙임
			this.method();
			
			//바깥 field,method사용법
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
