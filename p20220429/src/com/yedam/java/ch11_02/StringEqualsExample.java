package com.yedam.java.ch11_02;

public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = "hong gil dong";
		String str2 = "hong gil dong";
		String str3 = new String("hong gil dong");

		if (str1 == str2) {// 메모리주소비교
			System.out.println("str1과 str2는 같은 객체를 참조합니다.");
		} else {
			System.out.println("str1과 str2는 다른 객체를 참조합니다.");
		}

		if (str1 == str3) {
			System.out.println("str1과 str3는 같은 객체를 참조합니다.");
		} else {
			System.out.println("str1과 str3는 다른 객체를 참조합니다.");
		}
		
		if (str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 문자열을 가집니다.");
		} else {
			System.out.println("str1과 str2는 다른 문자열을 가집니다.");
		}
		
		if (str1.equals(str3)) {
			System.out.println("str1과 str3는 같은 문자열을 가집니다.");
		} else {
			System.out.println("str1과 str3는 다른 문자열을 가집니다.");
		}
	}
}
