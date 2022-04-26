package com.yedam.java.homework1;

public class ArcadeGame implements Keypad{
	
	int mode;
	
	
	
	public ArcadeGame() {
		super();
		System.out.println("ArcadeGame실행");
		mode = NORMAL_MODE;
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다.");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다.");
		
	}

	@Override
	public void rightUpButton() {
		if(mode == 0) {
			System.out.println("캐릭터가 일반공격");
		}
		if(mode == 1) {
			System.out.println("캐릭터가 연속공격");
		}
		
	}

	@Override
	public void rightDownButton() {
		if(mode == 0) {
			System.out.println("캐릭터가 HIT공격");
		}
		if(mode == 1) {
			System.out.println("캐릭터가 Double HIT공격");
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
