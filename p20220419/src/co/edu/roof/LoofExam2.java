package co.edu.roof;


import java.util.Scanner;

public class LoofExam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = (int) (Math.random()*6+1);
			System.out.println("주사위 값 : "+num);
			if(num == 6) {
				break;
			}
		}
		
		boolean flag = true;
		int sum = 0;
		while (flag) {
			System.out.println("정수를입력하세요");
			int value = sc.nextInt();
			if (value == -1) {
				System.out.println("탈출");
				flag = false;
				continue;
			}
			sum += value;
		}
		System.out.println("정수의 합 : " + sum);
	}
}
