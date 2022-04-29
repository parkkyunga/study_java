package com.yedam.java.ch11_01;

public class Main {
	public static void main(String[] args) {
		String str1 = new String("hong gil dong");
		String str2 = new String("hong gil dong");

		System.out.println(str1.hashCode()); // 객체를 식별할 하나의 정수값

		System.out.println(str2.hashCode());

//		if (str1.hashCode() == str2.hashCode()) {System.out.println("동일한 해쉬코드");}

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				//return; //메인에서쓰일때만
				//break;
				System.exit(0);
			}
		}
		System.out.println("마무리코드");
	}
}
