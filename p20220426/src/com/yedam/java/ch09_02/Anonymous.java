package com.yedam.java.ch09_02;

public class Anonymous {
	//field초기값으로 대입
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			work();
			//work는 익명이지만 바깥으로 꺼내쓸수있음
		}
	};
	
	//로컬변수값으로대입
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			public void wake() {
				super.wake();
				walk();
			}
		};
		
		localVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}
	
}
