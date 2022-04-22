package co.edu.extend;

public class CellPhone {
	//필드
	public String model;
	public String color;
	
	//생성자
	public CellPhone(String model,String color) {
		this.color = color;
		this.model = model;
	}
	
	//메소드
	void powerOn() {
		System.out.println("전원을 킵니다");
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void hangup() {
		System.out.println("전화를 끊습니다");
	}
}
