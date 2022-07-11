package com.yedam.java.ch11_02;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "java programming";
		String str2 = "JAVA PROGRAMMING";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		
		boolean str3 = str1.equalsIgnoreCase(str2);//대소문자상관없이 논리값만비교
		System.out.println(str3);
		
	}
}
