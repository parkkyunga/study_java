package com.yedam.java.ch11_02;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "java");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		//oldStr = oldStr.replace() 하면 oldStr이라는 객체가 두개생김
		//StringBuilder 쓰면 여러번수정가능
	}
}
