package co.edu.roof;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		//1.반복문으로 최소,최대값구하기 scanner3개
		Scanner sc = new Scanner(System.in);
		int first;
		int second;
		int third;
		int max;
		
		System.out.println("데이터입력1");
		first = sc.nextInt();
		System.out.println("데이터입력2");
		second = sc.nextInt();
		System.out.println("데이터입력3");
		third = sc.nextInt();
		
		max= first;
		
		if(second<max) {
			max = second;
		}
		if(max < third) {
			max = third;
		}
		System.out.println(max);
		
		
		//2.두 주사위를 던졌을때 합이 6인데이터출력 
		
		
		
		//3.피보나치수열while(value<50)
		int num = 0;
		int a = 1;
		int b = 2;
		
		while (num<50) {
			
			num = a+b;
			System.out.println(a+"+"+b+"="+num);
			a = b;
			b = num;
			
		}
		
		
		
	}
}
