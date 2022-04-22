package co.edu.Exam;

import java.util.Scanner;

public class School {	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student[] stdArry = new Student[0];
		Student std = new Student();
		int stdTotal = 0;
		
		while(true) {

			System.out.println("============================================");
			System.out.println("1.학생수 |2.학생정보입력 |3.학생정보출력 |4.순위 |5.종료");
			System.out.println("============================================");
			System.out.println("선택 > ");
			
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {
				System.out.println("학생수 입력 > ");
				stdTotal = sc.nextInt();
				stdArry = new Student[stdTotal];
			} else if (selectNo == 2) {
				for (int i = 0; i < stdArry.length; i++) {
						System.out.println(i+"학번 > "+stdArry.length);
						
						int stdNo = sc.nextInt();
						
						stdArry[i].setStdNo(stdNo);
						System.out.println(stdNo+","+i+","+stdArry[i].getStdNo());
				
					}
				
					
//					System.out.println("이름 > ");
//					String stdName = sc.nextLine();
//					stdArry[i].setStdName(stdName);
//					System.out.println("국어 > ");
//					int kor = Integer.parseInt(sc.nextLine());
//					stdArry[i].setKor(kor);
//					System.out.println("영어 > ");
//					int eng = Integer.parseInt(sc.nextLine());
//					stdArry[i].setEng(eng);
//					System.out.println("수학 > ");
//					int math = Integer.parseInt(sc.nextLine());
//					stdArry[i].setMath(math);
				
			} else if (selectNo == 3) {
				for(int i =0;i<stdTotal+1;i++) {
					System.out.println(std.getStdNo());
					
				}
				System.out.println("학번을 입력하세요 > ");
				System.out.println(std.getStdNo()+std.getStdName()+std.getKor());
				System.out.println(std.getEng());
				
			}
		}
		
	}

}
