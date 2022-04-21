package co.edu.oop;

public class CalMain {
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.execute();

		int result = cal.plus(5, 7);// 5,7매개변수라고함
		System.out.println(result);

		result = cal.minus(10, 1);
		System.out.println(result);

		double avg = cal.avg(10, 2);
		System.out.println(avg);

		cal.powerOff();

		System.out.println();

		Calculator2 mycalcu = new Calculator2();
		double result1 = mycalcu.areaRectangle(10);
		double result2 = mycalcu.areaRectangle(10, 20);
		System.out.println("정사각형넓이 " + result1);
		System.out.println("직사각형넓이 " + result2);
	}
}
