package com.yedam.java.exam;

public class Question1 {
	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (NumberFormatException e) {
				System.out.println(" NumberFormatException ");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(" ArrayIndexOutOfBoundsException ");
			} finally {
				System.out.println(value);
			}
		}
	}
}
