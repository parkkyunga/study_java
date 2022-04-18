package co.yedam.var;

public class Variable {

	public static void main(String[] args) {
		//변수선언
		int age = 10;
		int height = 200;
		System.out.println(age);
		System.out.println(height);
		
		//타입과 변수선언
		int age1,age2;
		age1 = 300;
		age2 = 4000;
		System.out.println(age1);
		System.out.println(age2);
		
		int 수 = 1;
		System.out.println(수);

		int speed, tire;
		speed = 10;
		tire = 20;
		System.out.println(speed);
		System.out.println(tire);

		int hour = 1;
		int minute = 45;
		System.out.println(hour+"시"+minute+"분");
		int totalMinute = (hour*60)+minute;
		System.out.println("총"+totalMinute+"분");
		
		
	}

}
