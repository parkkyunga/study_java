package co.edu.extend;

public class Main2 {
	public static void main(String[] args) {
		SuperSonicAirPlane sa =  new SuperSonicAirPlane();
		
		//부모클래스의 takeOff 메소드호출
		sa.takeOff();
		
		
		//자식클래스의 오버라이드한 fly메소드
		sa.fly();
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		
		//자식클래스의 오버라이드한fly메소드
		sa.fly();
		sa.flyMode = SuperSonicAirPlane.NOMAL;
		
		//자식
		sa.fly();
		
		//부모클래스의 land메소드 호출
		sa.lan();
	}
}
