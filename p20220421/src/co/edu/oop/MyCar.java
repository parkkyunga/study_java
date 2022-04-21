package co.edu.oop;

public class MyCar {
	//필드
	int gas ;
	
	//생성자
	//생성자작성안하면 자바에서 기본으로 적용해줌
	
	//매소드
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas == 0){
			System.out.println("가스가 없습니다.");
			return false;
		}
		System.out.println("가스가 있습니다.");
		return true;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(가스잔량 : "+gas+")");
				gas -=1;
			}else {
				System.out.println("멈춥니다.(가스잔량 : "+gas+")");
				return;
			}
		}
	}
	
}

