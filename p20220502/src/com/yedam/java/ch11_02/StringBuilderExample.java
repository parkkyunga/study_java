package com.yedam.java.ch11_02;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		// 문자열을 끝에 추가
		sb.append("java ");
		sb.append("program study");
		System.out.println(sb.toString());

		// 해당인덱스위치 앞에 값을 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());

		// 해당인덱스위치에 값을 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());

		// 시작인덱스부터 지정한 인덱스 전까지 지졍해서 대체
		sb.replace(6, 13, "book");
		System.out.println(sb.toString());

		// 시작인덱스부터 지정한 인덱스 전까지 지졍해서 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());

		int length = sb.length();
		System.out.println("총 문자 수 : " + length);
		
		String result = sb.toString(); //다끝나면 tostring으로 변환해줘야 끝남
		sb.delete(0, 4);
		System.out.println(result);
		System.out.println(sb.toString());
	}
}
