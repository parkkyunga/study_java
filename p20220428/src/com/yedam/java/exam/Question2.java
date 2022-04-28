package com.yedam.java.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random() * 100) + 1;

		// 사용자입력을 저장할 공간
		int input = 0;

		// 시도횟수를 세기 위한 변수
		int count = 0;

		do {
//			System.out.println(answer);
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			try {
				input = Integer.parseInt(sc.nextLine());

				if (answer < input) {
					System.out.println("더 작은 수를 입력하세요.");
					count++;
				}
				if (answer > input) {
					System.out.println("더 큰 수를 입력하세요.");
					count++;
				}

				if (answer == input) {
					System.out.println("정답입니다.");
					System.out.println("시도횟수는 " + count + "번 입니다.");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
			}
		} while (true);
	}

}
