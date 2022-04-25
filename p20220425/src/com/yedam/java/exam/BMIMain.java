package com.yedam.java.exam;

public class BMIMain {
	public static void main(String[] args) {
		Human human = new StandardWeightInfo("홍길동", 45, 168);
		human.getInfomation();

		Human human2 = new ObesityInfo("박둘이", 90, 168);
		human2.getInfomation();
		
		
	}
}
