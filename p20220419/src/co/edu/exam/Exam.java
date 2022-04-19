package co.edu.exam;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double tem;
		System.out.println("화씨를 입력하세요.");
		tem = Integer.parseInt(sc.nextLine());
		double TemResult = (tem - 32) * 5 / 9;
		System.out.println("변환된 섭씨 : " + TemResult);

	}

}
