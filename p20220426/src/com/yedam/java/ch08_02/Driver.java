package com.yedam.java.ch08_02;

public class Driver {
	public void driver(Vehicle vehicle) {
		//Bus bus = (Bus) vehicle;
		//bus.checkFare();
		//이렇게 했더니 택시vehicle.run()에서 오류남
		//버스만 강제 인스턴스오브 해줄거임
		if(vehicle instanceof Bus) { //true,false
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		
		vehicle.run();
	}
}
