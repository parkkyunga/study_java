package com.yedam.java.ch09_01;

public class Button {
	OnClickListener listener;
	
	
	//생성자x setter를 이용함 listener를 여러가지로 이용할라고
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}
	
	//버튼사용을 미리정의내림
	//어떤식으로 작동하겠다
	//그럼 버튼을 써서 이벤트를 일으키고싶으면
	//버튼안에 온클릭리스너를 쓰면됨
}
