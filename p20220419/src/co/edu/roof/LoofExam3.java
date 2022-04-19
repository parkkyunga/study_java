package co.edu.roof;

import java.util.Scanner;

public class LoofExam3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance =0;// 계좌
		int menu = 0;
		int withDraw = 0;// 출금
		int deposit = 0;// 예금
		while (run) {
			System.out.println("-------------");
			System.out.println("1. 예금 |2. 출금 |3.잔고 |4.종료 ");
			System.out.println("-------------");
			System.out.println("선택 > ");
			menu = sc.nextInt();// 4가지중 하나선택
			switch (menu) {
			case 1:
				System.out.println("예금액 > ");
				deposit = sc.nextInt();
				balance += deposit;
				break;
			case 2:
				System.out.println("출금액 > ");
				withDraw = sc.nextInt();
				// 출금액이 계좌에 있는 돈보다 많을때
				if (balance < withDraw) {
					System.out.println("잔고부족");
				} else {
					balance -= withDraw;
				}
				break;
			case 3:
				System.out.println("잔고 > " + balance);
				break;
			case 4:
				run=false;
				break;

			}
		}
		System.out.println("프로그램종료");
	}
}
