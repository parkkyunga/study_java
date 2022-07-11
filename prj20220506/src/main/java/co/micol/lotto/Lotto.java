package co.micol.lotto;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		boolean selected = false;
		int[] Lotto = new int[6];
		// int numCount = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇게임?");

		int gameNum = sc.nextInt();

		for (int j = 1; j <= gameNum; j++) {
			System.out.print(j + "회차 >> ");
			for (int i = 0; i <= 5; i++) {
				int rndNum = (int) (Math.random() * 45) + 1;
				Lotto[i] = rndNum;
		//		 System.out.print(Lotto[i] + " ");

				for (int over = 0; over < i; over++) {
					if (Lotto[over] == Lotto[i]) {
					//	System.out.println("\n 중복숫자:" + Lotto[i]);
				//		selected = true;
						i--;
						break;
					}
				}

				 System.out.print(Lotto[i] + " ");
			}
			System.out.println();
		}
		System.out.println("============================");
		System.out.println("게임값은 "+gameNum*1000+"원 입니다.");
	}
}
