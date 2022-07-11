package co.micol.baseball;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] comNumList = new int[3];
		int[] myNumList = new int[3];
		int strike = 0;
		int ball = 0;

		for (int i = 0; i < comNumList.length; i++) {
			int comNum = (int) (((Math.random()) * 9) + 1);
			comNumList[i] = comNum;
			System.out.print(comNumList[i] + " ");

			for (int j = 0; j < i; j++) {
				if (comNumList[i] == comNumList[j]) {
					//comNumList[i] -= i;
					 i--;
					//break;
				}
			}
			// System.out.println(comNumList[i]);
		}

		while (true) {
			System.out.println("숫자를 입력하세요");
//			int firstNum = sc.nextInt();
//			int secondNum = sc.nextInt();
//			int thirdNum = sc.nextInt();
			myNumList[0] = sc.nextInt();;
			myNumList[1] = sc.nextInt();;
			myNumList[2] = sc.nextInt();;
			
			for (int i = 0; i < comNumList.length; i++) {
				for (int j = 0; j < myNumList.length; j++) {
					if (myNumList[j] == comNumList[i] && i == j) {
						strike += 1;
					} else if (myNumList[j] == comNumList[i] && i != j) {
						ball += 1;
					}
				}
			}
			System.out.println("스트라이크>> " + strike);
			System.out.println("볼>> " + ball);
			if(strike == 3) {
				System.out.println("게임끝");
				break;
			}
			strike = 0;
			ball=0;
			
			
		}

	}
}
