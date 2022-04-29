package com.yedam.java.homework;

public class Plus2 {
	public static void main(String[] args) {

		method(true);

		method(false);

	}

	public static void method(boolean value) {
		System.out.println(1);
		try {

			if (value) {
				throw new RuntimeException();
			}

			System.out.println(2);
		} catch (RuntimeException e) {
			System.out.println(3);
			return;//리턴만나면 메소드종료-그래도 파이널리는 무조건 실행
		} catch (Exception e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
}
