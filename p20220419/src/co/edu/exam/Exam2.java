package co.edu.exam;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("나: ");
		String str = sc.nextLine();

		int game = 0;
		
		if (str.equals("가위")) {
			game = 0;
		} else if (str.equals("바위")) {
			game = 1;
		} else if (str.equals("보")) {
			game = 2;
		} else {
			System.out.println("다시입력하세요.");
		}

		int comGame = (int) (Math.random() * 3);
		if (comGame == 0) {
			System.out.println("컴퓨터: 가위.");
		} else if (comGame == 1) {
			System.out.println("컴퓨터: 바위.");
		} else if (comGame == 2) {
			System.out.println("컴퓨터: 보.");
		} else {
			System.out.println("다시.");
		}

		
		if (game == comGame) {
			System.out.println("비겼습니다");
		} else if (game >= comGame) {
			System.out.println("이겼습니다");
		} else {
			System.out.println("졌습니다.");
		}

	}

}
