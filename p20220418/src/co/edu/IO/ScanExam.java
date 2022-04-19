package co.edu.IO;

import java.util.Scanner;

public class ScanExam {
	public static void main(String[] args) {
		//데이터입력을 받기위해 스캐너 선언
		Scanner sc = new Scanner(System.in);
	
		while (true) {
			System.out.println("스캐너 값을 입력하세요");
			String str = sc.nextLine();
			// int val = sc.nextInt();
			System.out.println("입력값 : " + str);
			if (str.equals("q")) {
				break;
			}
		}
		
	}
}
