package co.edu.extend;

//자식클래스
public class DmbCellPhone extends CellPhone {
	//필드
	public int channel;
	
	//생성자
	public DmbCellPhone(String model,String color,int channel) {
//		this.model = model;
//		this.channel = channel;
//		this.color = color;
		
		super(model,color);//부모클래스에있는 생성자 사용할께
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("dmb시작, 채널 : "+channel);
		super.powerOn(); //이런식으로 불러올수도있음
	}
	void turnOffDmb() {
		System.out.println("dmb종료");
	}
	
	@Override //자바가 실행될때 알아야할 공지같은거
	void powerOn() {
		System.out.println("자식클래스에서 전원을 킵니다");
	}
}
