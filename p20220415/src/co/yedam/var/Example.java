package co.yedam.var;

public class Example {
	public static void main(String[] args) {
		
		//반지름이 5인 원의 면적
		double PI = 3.14;
		int radius = 5;
		double gongsic = PI * radius * radius;
		
		System.out.println(3.14*5*5);
		System.out.println(PI*radius*radius);
		System.out.println(gongsic);
		
		
		//한면이 4인 삼각형의 넓이를 구하시오
		//높이 4
		//삼각형넓이 = 밑면 * 높이 / 2
		int triWidth = 4;
		int triHeight = 4;
		double 넓이 = triWidth * triHeight / 2.0;
		
		System.out.println(triWidth * triHeight / 2);
		System.out.println(넓이);
		
	}
}
