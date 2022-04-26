package com.yedam.java.homework3;

import java.util.Scanner;

public class RPGgame implements Keypad{
	int mode;
	int choice;
	Scanner sc = new Scanner(System.in);

	
	public RPGgame() {
		mode = NORMAL_MODE;

		
		System.out.println("RPG게임실행");
		while(true) {

			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.printf("choice >> ");
			choice = sc.nextInt();
			
			if(choice == 1){
				leftUpButton();
			}else if(choice == 2){
				leftDownButton();
			}else if(choice == 3){
				rightUpButton();
			}else if(choice == 4){
				rightDownButton();
			}else if(choice == 5){
				changeMode();
			}else if(choice == 0){
				System.out.println("게임스위치 ");
				ArcadeGame arc = new ArcadeGame();
			}else if(choice == 9){
				System.out.println("EXIT");
				break;
			}else {
				break;
			}
			
		}
		
	
		}

		
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
		
	}

	@Override
	public void rightUpButton() {
		if(mode == 0) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		}
		if(mode == 1) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
		
	}

	@Override
	public void rightDownButton() {
		if(mode == 0) {
			System.out.println("캐릭터가 일반 공격");
		}else if(mode != 0){
			System.out.println("캐릭터가 HIT공격");
		}
		
	}

	@Override
	public void changeMode() {

		if (mode == 0) {
			System.out.println("현재모드 : HARD_MODE");
			mode = 1;
		}

		else if (mode != 0) {
			System.out.println("현재모드 : NOMAL_MODE");
			mode = 0;
		}

	}

}
