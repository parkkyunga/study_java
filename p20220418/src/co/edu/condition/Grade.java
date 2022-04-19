package co.edu.condition;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학점측정
		int grade;
		System.out.println("성적을 입력하세요.");
		grade = Integer.parseInt(sc.nextLine());
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F공부하세요");
		}
				
	}
}
