package co.yedam.java.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringGame {
	private String[] strData = { "Orange", "Game", "Phone", "Smart" };
	String strAnswer;
	List<Character> charData;

	public StringGame() {
		init();
	}

	private void init() {
		strAnswer = getStrAnswer();
		charData = new ArrayList<Character>();
	}

	private String getStrAnswer() {
		return strData[(int) (Math.random() * 4)].toLowerCase();
	}

	// 문제1.문자하나
	public void setCharData() {
		showCharData();
		if (charData.size() == strAnswer.length()) {
			System.out.println("문자열을 구성하는 문자를 다 입력하셨습니다.");
		} else {
			// 값입력받음
			String inputStr = inputData();
			if (strAnswer.indexOf(inputStr.charAt(0)) != -1) { // 양수출력 정답에포함되었다는뜻
				System.out.println("문자열을 구성하는 문자입니다.");
				charData.add(inputStr.charAt(0));
			} else {
				System.out.println("문자열을 구성하는 문자가 아닙니다.");
			}
		}
	}

	private String inputData() {
		System.out.print("입력값 >> ");
		return new Scanner(System.in).next().toLowerCase();
	}

	private void showCharData() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		for (char data : charData) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

	// 문제2.단어
	public void SetStrData() {
		// 입력된 문자 목록 출력
		showCharData();
		// 값 입력받고
		String inputStr = inputData();
		// 정답인지
		if (strAnswer.equals(inputStr)) {
			System.out.println("정답입니다");
		} else {
			showStrData(inputStr);
		}
	}

	// OX출력
	private void showStrData(String inputStr) {
		if (strAnswer.length() == inputStr.length()) {
			for (int i = 0; i < strAnswer.length(); i++) {
				if (strAnswer.charAt(i) == inputStr.charAt(i)) {
					System.out.println("O");
				} else {
					System.out.println("X");
				}
			}
		} else {
			System.out.println("입력된 문자열의 길이가 정답과 다릅니다.");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		StringGame game = new StringGame();

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 ");
			System.out.println("---------------------------------------------");

			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				game.setCharData();
				break;
			case 2:
				game.SetStrData();
				break;
			case 3:
				game.showCharData();
				break;
			case 4:
				game.init();
				break;
			case 5:
				run = false;
				System.out.println("프로그램종료");
				break;
			default:
				System.out.println("메뉴잘못입력");
				break;
			}

		}

	}
}
