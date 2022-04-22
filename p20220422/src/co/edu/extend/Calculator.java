package co.edu.extend;

//부모클래스
public class Calculator {
	double areaCircle(double r) {
		System.out.println("부모클래스 areaCircle실행");
		System.out.println(3.14159 * r * r);
		return 3.14159 * r * r;
	}
}
