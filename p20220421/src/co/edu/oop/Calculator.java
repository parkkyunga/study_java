package co.edu.oop;

public class Calculator {
	//필드
	//생성자
	
	//메소드
	
	void execute() {
		powerOn();
	}
	double avg(int x,int y) {
		int sum = plus(x, y);
		double result = (double)sum/2;
		return result;
	}
	
	void powerOn() {
		System.out.println("전원을 킵니다");
	}
	int plus(int x ,int y) {
		int result = x+y;
		return result;
	}
	int minus(int x,int y) {
		int result = x-y;
		return result;
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
		return; //void에는 return 어쩌구~안쓰지만 오류안뜸 강제종료한다는뜻
	}

}
