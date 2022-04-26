package com.yedam.java.ch09_02;

public class AnonymousClassExample {
	public static void main(String[] args) {
		AnonymousClass ac = new AnonymousClass();
		
		//익명객체를 필드로 사용
		ac.rc.turnOn();
		System.out.println("");
		
		//익명객체를 로컬변수로 사용
		ac.method1();
		System.out.println("");
		
		//익명객체를 매개변수로 사용
		ac.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
			}
		});
	}
}
