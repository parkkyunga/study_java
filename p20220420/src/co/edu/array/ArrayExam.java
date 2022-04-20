package co.edu.array;

import java.util.Scanner;

public class ArrayExam {
	public static void main(String[] args) {
		//배열 - 같은데이터 타입을 연속된공간에 저장
		int [] ary = new int[5];
		//데이터넣기1
		ary[0]=1;
		ary[1]=2;
		
		//데이터넣기2
		int [] ary1 = {1,2,3,4,5};
		
		
		//1.배열만들고,스캐너써서값입력
		Scanner sc =  new Scanner(System.in);
		int ary2[] = new int[5];//공간이 5칸인 정수형 타입 배열 생성
		//반복문으로 배열에 데이터저장
//		for(int i=0;i<ary2.length;i++) {
//			System.out.println("데이터를 입력하세요");
//			//ary2[0] = sc.nextInt();
//			//ary2[1] = sc.nextInt();
//			ary2[i] = sc.nextInt();
//			System.out.println("입력한 정수는 : "+ary2[i]);
//			
//		}
		
		
		for (int i = 0; i < ary2.length; i++) {
			System.out.println(ary2.length + "명의 점수를 입력하세요.");
			ary2[i] = sc.nextInt();

		}
		int sum = 0;
		for (int i = 0; i < ary2.length; i++) {
			// sum = sum + ary[i]
			sum += ary2[i];

		}
		System.out.println("총점" + sum);
		System.out.println("평균" + (double) (sum / ary2.length));
		
		//1~100까지 합 구하는 방법
		int ary3[] = new int[100];
		for(int i=0;i<ary3.length;i++) {
			ary3[i] = i+1;
		}
		sum = 0;
		for(int i=0;i<ary3.length;i++) {
			sum += ary3[i]; //섬에 배열 0부터 99번째데이터를 누적
		}
		System.out.println("1~100까지의 합은 : "+sum);
		
		sum = 0;
		for(int i =0;i<ary3.length;i++) {
			//100번째배열자리에 1~99까지 더한값저장
			if(i == 99) {
				ary3[i] = sum;
				break;
			}
			sum += ary3[i];
		}
		System.out.println(ary3[99]);
		
	}
}
