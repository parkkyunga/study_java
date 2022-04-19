package co.edu.condition;

import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		
//		int num = sc.nextInt();
//		if(num == 1) {
//			System.out.println("숫자1");
//		}else if(num == 2) {
//			System.out.println("숫자2");
//		}else if(num == 3) {
//			System.out.println("숫자3");
//		}else if(num == 4) {
//			System.out.println("숫자4");
//		}else if(num == 5) {
//			System.out.println("숫자5");
//		}else {
//			System.out.println("5초과");
//		}
		
		
		//주사위
		while (true) {
			int num2 = (int) (Math.random() * 6) + 1; //(0 <= x < 1)*6
			System.out.println("주사위 수는 : " + num2);
			
			if (num2 == 1) {
				System.out.println("숫자1");
			} else if (num2 == 2) {
				System.out.println("숫자2");
			} else if (num2 == 3) {
				System.out.println("숫자3");
			} else if (num2 == 4) {
				System.out.println("숫자4");
			} else if (num2 == 5) {
				System.out.println("숫자5");
			} else {
				System.out.println("숫자6, 탈출");
				break;
			}
		}
		
		
		
		
		
		
	}
}
