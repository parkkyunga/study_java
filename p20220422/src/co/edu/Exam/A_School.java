package co.edu.Exam;

import java.util.Scanner;

public class A_School {
	public static void main(String[] args) {
		// 학생 관리 프로그램 구현.
		// 관리 해야 할 학생 수 입력 후 학생 수만큼 정보 입력.
		// 학생 정보 : 학번, 이름, 국어, 수학, 영어
		// 학생 번호 입력 시, 학생의 기본 정보 및 평균 출력.

		// 추가 문제, 학생 번호 입력시, 추가적으로 평균으로 등수 출력 기능. 난이도 높아서 구현 제외
		// 조건 1) class를 이용하여 학생을 등록.
		// 조건 2) class에서 학생의 기본 정보 및 평균을 출력하는 메소드 사용.

		Scanner sc = new Scanner(System.in);

		A_Student[] std = null;
		A_Student[] rank = null;
		int menu;
		int studentNo;
		int studentCount;
		int count = 0;
		int putData = 0;
		A_Student temp = null;

		while (true) {
			System.out.println("=================================================");
			// System.out.println("1. 학생 수 | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 종료");
			System.out.println("1. 학생 수 | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 순위 | 5. 종료");
			System.out.println("=================================================");
			System.out.println("선택>");

			menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				System.out.println("학생 수>");
				studentCount = Integer.parseInt(sc.nextLine());
				std = new A_Student[studentCount];
				rank = new A_Student[studentCount];

			} else if (menu == 2) {
				for (int i = 0; i < std.length; i++) {

					// 1) 방법 1
//					Student student = new Student();
//					
//					System.out.println("학번>");
//					putData =  Integer.parseInt(sc.nextLine());
//					student.setStudentNo(putData);
//					
//					System.out.println("이름>");
//					student.setStudentName(sc.nextLine());
//					
//					System.out.println("국어>");
//					putData =  Integer.parseInt(sc.nextLine());
//					student.setKor(putData);
//					
//					System.out.println("영어>");
//					putData =  Integer.parseInt(sc.nextLine());
//					student.setEng(putData);
//					
//					System.out.println("수학>");
//					putData =  Integer.parseInt(sc.nextLine());
//					student.setMath(putData);

					// 2) 방법 2
					System.out.println("학번>");
					int no = Integer.parseInt(sc.nextLine());

					System.out.println("이름>");
					String name = sc.nextLine();

					System.out.println("국어>");
					int kor = Integer.parseInt(sc.nextLine());

					System.out.println("영어>");
					int eng = Integer.parseInt(sc.nextLine());

					System.out.println("수학>");
					int math = Integer.parseInt(sc.nextLine());

					A_Student student = new A_Student(no, name, kor, eng, math);
					
					std[i] = student;
					rank[i] = student;
					
					if (std.length - 1 != i) {
						System.out.println("===============================");
					}

				}
			} else if (menu == 3) {
				System.out.println("학번 입력>");
				studentNo = Integer.parseInt(sc.nextLine());
				for (A_Student student : std) {
					if (student.getStudentNo() == studentNo) {
						count = student.getInfo();
					}
				}
				if (count == 0) {
					System.out.println("해당 하는 학번이 없습니다.");
				}
				count = 0;

			} else if (menu == 4) {
				System.out.println("순위>");
				//오름차순
				for (int i = 0; i<rank.length-1; i++) {
					for (int j = i+1; j<rank.length; j++) {
						if(rank[i].getAvg() < rank[j].getAvg()) {
							temp = rank[i];
							rank[i] = rank[j];
							rank[j] = temp;
						}
					}
				}
				
				for(int i = 0; i<rank.length; i++) {
					System.out.println((i+1) + "등> " + rank[i].studentName + ", 평균> " + rank[i].getAvg());
				}
				
			} else if (menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}
}
