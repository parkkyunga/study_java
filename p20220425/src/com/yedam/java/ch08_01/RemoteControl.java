package com.yedam.java.ch08_01;

public interface RemoteControl {
	//상수필드
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;/* public static final 생략됨*/
	
	
	//추상메소드
	public abstract void turnOn();
	void turnOff();/* public static final 생략됨*/
	
	public void setVolume(int volume);
	
}
