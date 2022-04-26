package com.yedam.java.ch08_02;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
	}
	
	//타기전에 승차요금검사
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
	
}
