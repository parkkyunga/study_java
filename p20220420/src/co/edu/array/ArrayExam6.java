package co.edu.array;

import java.util.Scanner;

public class ArrayExam6 {
	public static void main(String[] args) {

		//p.202
		boolean run = true;
		int studentNum = 0;
		int[] scorse = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-------------------");
			System.out.println(" 1.학생수 |2.점수입력 |3.점수리스트 |4.분석 |5.종료 ");
			System.out.println("-------------------");
			System.out.print("선택>");
			
			int selctNo = sc.nextInt();

			if(selctNo == 1) {
				System.out.println("학생수>");
				studentNum = sc.nextInt();
				scorse = new int [studentNum];
				sc.nextLine();
			}else if(selctNo == 2) {
				for(int i=0;i<studentNum;i++) { //i<scores.length;도 가능
					System.out.println("scorse["+i+"]>");
					scorse[i]= sc.nextInt();
				}
			}else if(selctNo == 3) {
				for(int i=0;i<studentNum;i++) {
					System.out.println("scores["+i+"]"+scorse[i]);
				}
			}else if(selctNo == 4) {
				int sum = 0;
				int max = 0;
				for(int i =0;i<scorse.length;i++) {
					//max = max <scorse[i]?scorse[i]:max;
					if(max<scorse[i]) {
						max = scorse[i];
					}
					
					sum+=scorse[i];
				}
				System.out.println("최대값 : "+max);
				System.out.print("최소값 : "+(double)(sum/scorse.length)+"\n");
			
				
			}else if(selctNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램종료");
	}
}
