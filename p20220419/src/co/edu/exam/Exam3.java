package co.edu.exam;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int grade = sc.nextInt();
		if(grade/10>10) {grade = 10;} //100보다 큰 숫자가 들어올때 10으로 처리
		
		switch (grade/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");	
			break;
		case 7:
			System.out.println("C");	
			break;
		default:
			System.out.println("다시공부하세요");
			break;
		}
	}

}
