package co.edu.Exam;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student[] stdArry = new Student[0];
		Student[] stdRank = new Student[0];
		Student std = new Student();
		int inputStdNo;
		
		int stdTotal =0;

		while (true) {

			System.out.println("============================================");
			System.out.println("1.학생수 |2.학생정보입력 |3.학생정보출력 |4.순위 |5.종료");
			System.out.println("============================================");
			System.out.println("선택 > ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				
				System.out.println("학생수 입력 > ");
				stdTotal = sc.nextInt();
				stdArry = new Student[stdTotal];
				stdRank = new Student[stdTotal];
				
			} else if (selectNo == 2) {
				for (int i = 0; i < stdArry.length; i++) {
					System.out.println("학번 > ");
					int stdNo = sc.nextInt();
					std.setStdNo(stdNo);

					System.out.println("이름 > ");
					String stdName = sc.nextLine();
					std.setStdName(sc.nextLine());
					
					System.out.println("국어 > ");
					int kor = Integer.parseInt(sc.nextLine());
					std.setKor(kor);
					
					System.out.println("영어 > ");
					int eng = Integer.parseInt(sc.nextLine());
					std.setEng(eng);
					
					System.out.println("수학 > ");
					int math = Integer.parseInt(sc.nextLine());
					std.setMath(math);
					
					Student student = new Student(stdNo, stdName, kor, eng, math);

					stdArry[i] = student;
					stdRank[i] = student;
				}

			} else if (selectNo == 3) {
				System.out.println("학번을 입력하세요 > ");
				inputStdNo = sc.nextInt();
				for (int i = 0; i < stdTotal + 1; i++) {
					if(inputStdNo == std.getStdNo()) {
						stdTotal = std.getInfo();
					}

				}
				System.out.println(std.getStdNo() + std.getStdName() + std.getKor());
				System.out.println(std.getEng());

			}
		}

	}

}
