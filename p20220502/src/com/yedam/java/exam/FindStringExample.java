package com.yedam.java.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindStringExample {

	static List<String> resultStr = new ArrayList<String>();
	static String selectedStr;

	public static void main(String[] args) {

		String searchStr;
		
		
		int rdmStr = (int) (Math.random() * 5) + 1;
		System.out.println(rdmStr);
		if (rdmStr == 1) {
			selectedStr = "Orange";
		} else if (rdmStr == 2) {
			selectedStr = "Game";
		} else if (rdmStr == 3) {
			selectedStr = "Phone";
		} else if (rdmStr == 4) {
			selectedStr = "Smart";
		} else {
			selectedStr = "co";
		}
		selectedStr = "co";

		System.out.println("<정답 : " + selectedStr + ">");

		
		while (true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 ");
			System.out.println("---------------------------------------------");

			Scanner sc = new Scanner(System.in);
			int menu = Integer.parseInt(sc.nextLine());

			if(menu == 1) {
				System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
				resultStr();
				System.out.print("입력값 >> ");
				searchStr = sc.nextLine();
				if (selectedStr.indexOf(searchStr) != -1) {
					System.out.println("문자열을 구성하는 문자입니다.");
					resultStr.add(searchStr);
				} else if (resultStr.size() == selectedStr.length()) {
					System.out.println("문자열을 구성하는 문자를 다 입력하셨습니다.");
					
				} else {
					System.out.println("문자열을 구성하는 문자가 아닙니다.");
				}
			}else if(menu == 2) {
				System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
				System.out.println(resultStr);
			}else if(menu == 3) {
				System.out.println("3");
			}
			
//			switch (menu) {
//			case 1:
//				System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
//				resultStr();
//				System.out.print("입력값 >> ");
//				searchStr = sc.nextLine();
//				if (selectedStr.indexOf(searchStr) != -1) {
//					System.out.println("문자열을 구성하는 문자입니다.");
//					resultStr.add(searchStr);
//				} else if (resultStr.size() == selectedStr.length()) {
//					System.out.println("문자열을 구성하는 문자를 다 입력하셨습니다.");
//					break;
//				} else {
//					System.out.println("문자열을 구성하는 문자가 아닙니다.");
//				}
//			case 2:
//				System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
//				System.out.println(resultStr);
//			case 3:
//				System.out.println("3");
//			default:
//				break;
//			}


//	private static boolean collect() {
//		for (int i = 0; i > resultStr.size(); i++) {
//			Boolean a = resultStr.get(i).contains(selectedStr);
//			System.out.println(resultStr.get(i));
//		
//		}
//		return true;
//		
//	}

		}
	}
	private static void resultStr() {
		if (resultStr != null) {
			System.out.println(resultStr);
		}
		if (resultStr == null) {
			System.out.println();
		}

	}
}
