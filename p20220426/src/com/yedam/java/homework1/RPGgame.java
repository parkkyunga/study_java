package com.yedam.java.homework1;

public class RPGgame implements Keypad{
	int mode;
	
	public RPGgame() {
		mode = NORMAL_MODE;
		System.out.println("RPG게임실행");
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
