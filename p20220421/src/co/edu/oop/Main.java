package co.edu.oop;

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car(); // 자동차객체생성
		myCar.company = "기아";
		myCar.model = "k3";
		myCar.color = "white";
		myCar.maxSpeed = 150;
		
		myCar.info();
				
		System.out.println();
		//생성자를 통한 데이터입력
		Car myCar2 = new Car("소나타", "black");
		myCar2.info();
		
		System.out.println();
		//각 객체에 해당된 주소번지에서 데이터를 호출
		Korean k1 = new Korean("박자바", "012345-123456");
		k1.getInfo();
		Korean k2 = new Korean("김자바", "852414-123456");
		k2.getInfo();
		
		System.out.println();
		Korean k3 = new Korean("미국", "이자바", "222222-233333");
		k3.getInfo();
		

	}
}
