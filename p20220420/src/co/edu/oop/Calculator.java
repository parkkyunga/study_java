package co.edu.oop;

public class Calculator {
	//필드
	int x;
	int y;
	
	//생성자
	
	
	//메소드(기능)
	void plus(int x,int y) {
		System.out.println("덧셈 : "+(x+y));
	}
	void minus(int x,int y) {
		System.out.println("뺄셈 : "+(x-y));
	}
	void multi (int x,int y) {
		System.out.println("곱셈 : "+(x*y));
	}
	void div(int x,int y) {
		System.out.println("나눗셈 : "+(x/y));
	}
	
}
