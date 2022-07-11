package com.yedam.java.ch11_02;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880105-5565874";
		String firstNum = ssn.substring(0,6);//0~5사이 값
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);//7~마지막까지
		System.out.println(secondNum);
	}
}
