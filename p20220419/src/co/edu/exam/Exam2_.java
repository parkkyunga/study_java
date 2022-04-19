package co.edu.exam;

import java.util.Scanner;

public class Exam2_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2.가위 바위 보
		System.out.println("가위(0) 바위(1) 보(2)");
		int user = sc.nextInt();
		int random = (int)(Math.random() * 3);//0,1,2
		
		switch (user){
		case 0:
			//user = 가위(0), 컴퓨터는 
			if(random == 1) {
				System.out.println("졌습니다.");
			}else if (random == 2) {
				System.out.println("이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
			break;
		case 1:
		case 2:
			break;
	}
}
	
	
}
