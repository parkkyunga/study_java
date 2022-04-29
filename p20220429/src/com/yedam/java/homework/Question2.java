package com.yedam.java.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random() * 100) + 1;

		// 사용자입력을 저장할 공간
		int input = 0;

		// 시도횟수를 세기 위한 변수
		int count = 0;

		// while은 조건성립안되면 실행안됨 dowhile은 조건안맞아도 한번은 실행됨 사용자입력을 받긴받아야되서
		do {
			System.out.print("1과 100사이의 값을 입력하세요 : ");

			// 시도횟수증가
			count++;

			// 사용자가 숫자를 입력
			// 숫자아닌 값을 입력할 경우 예외처리
			try {
				input = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
				continue;
			}

			// 컴퓨터숫자 < 사용자숫자
			if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");

			}
			// 컴퓨터숫자 > 사용자숫자
			else if (answer > input) {
				System.out.println("더 큰 수를 입력하세요.");

			}
			// 컴퓨터숫자 = 사용자숫자
			// 시도횟수출력
			else {
				System.out.println("정답입니다.");
				System.out.println("시도횟수는 " + count + "번 입니다.");
				break;
			}

		} while (true);
	}
}
