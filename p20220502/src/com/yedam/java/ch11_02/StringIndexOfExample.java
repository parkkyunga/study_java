package com.yedam.java.ch11_02;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		String subject1 = "JAVA PROGRAMMING"; //물리적으로 대소문자구분함
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject1.indexOf("java") != -1) {//위치가 어디에있는 포함하고있다
			System.out.println("자바와 관련된 책이군요..");
		}else {
			System.out.println("자바와 관련이 없는 책이국ㄴ욘");
		}
	}
}
