package com.yedam.java.ch09_02;

public class AnonymousClass {
	
	//필드초기값으로대입
	RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	//로컬변수값으로 대입
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		localVar.turnOn();
		//localVar.turnOff();
	}
	
	//매개변수로대입
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
	
	
}
