package co.edu.array;

import java.util.Scanner;

public class ArrayExam2 {
	public static void main(String[] args) {
		int []ary = {5,10,222,50,30,35};
		int max = 0;
		int min = ary[0];
		for (int i = 0; i < ary.length; i++) {
			// 최대값
			if (max < ary[i]) {
				max = ary[i];
			}
			// 최소값
			if (min > ary[i]) {
				min = ary[i];
			}
		}
		System.out.println("최대값 : "+max+"\n최소값 : "+min);
		
		Scanner sc = new Scanner(System.in);
		int[] ary2 = null;//배열은 만들고 사이즈는 아직 안정할꺼
		System.out.println("배열의 사이즈를 입력하세요");
		int num = sc.nextInt();
		ary2 = new int[num];
		
		for(int i =0;i<ary2.length;i++) {
			ary2[i] = i+1;
			System.out.println(ary2[i]);
		}
		
		System.out.println("--------짝수출력");
		for(int i=0;i<ary2.length;i++) {
			if (ary2[i]%2 == 0) {
				System.out.println(ary2[i]);
			}
		}
		System.out.println("--------홀수출력");
		for(int i=0;i<ary2.length;i++) {
			if (ary2[i]%2 == 1) {
				System.out.println(ary2[i]);
			}
		}

		System.out.println("-------------");
		int ary3[] = new int[num];
		for(int i=0;i<ary3.length;i++) {
			ary3[i] = i;
		}
		//중첩반복문,조건문을 이용한 데이터출력
		for(int i=0;i<ary2.length;i++) {
			for(int j=0;j<ary3.length;j++) {
				//조건:ary2의 데이터+ ary3의 데이터 =10
				if(ary2[i]+ary3[j] < 10) {
					System.out.println("1:"+ary2[i]+", 2:"+ary3[j]);
				}
			}
		}
		
	}
}
