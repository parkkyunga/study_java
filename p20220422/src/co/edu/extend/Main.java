package co.edu.extend;

public class Main {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("고아라폰","흰색",55) ;
		
		//부모클래스 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.hangup();
		
		//자식클래스 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
		
		//부모클래스 메소드
		dmbCellPhone.powerOff();
		
		System.out.println(dmbCellPhone.color);
		System.out.println(dmbCellPhone.model);
		
		
		//
		Calculator cal = new Calculator();
		cal.areaCircle(40);
		
		Computer com = new Computer();
		com.areaCircle(60);
	}
}
