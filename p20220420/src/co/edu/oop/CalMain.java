package co.edu.oop;

public class CalMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();

		cal.plus(3, 4);
		cal.minus(30, 10);
		cal.multi(10, 20);
		cal.div(50, 10);

		Car car = new Car();
		car.model = "자동차모델";
		car.color = "green";
		car.price = 100000;
		car.info();

		Car car2 = new Car();
		car2.color = "white";
		car2.model = "모델";
		car2.price = 20000;
		car2.info();
		
		Car car3 = new Car("블랙", "그렌져", 11234);
		car3.info();

	}

}
