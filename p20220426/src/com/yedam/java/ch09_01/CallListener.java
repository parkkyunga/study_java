package com.yedam.java.ch09_01;

import com.yedam.java.ch09_01.Button.OnClickListener; //같은패키지내에서는 잘안생기는데 이경우 확실하게 말해주기위해서
//public class CallListener implements  Button.OnClickListener { 위 임포트랑 똑같음

public class CallListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
