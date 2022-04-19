package co.edu.oper;

public class OperatorExam2 {

	public static void main(String[] args) {
		
		boolean flag =  true;
		System.out.println(flag);
		System.out.println(!flag);
		
		if(!flag) {
			System.out.println("참");
		}else {
			System.out.println("거짓\n--------------");
		}
		
		
		
		int i = 100;
		if(i != 100) {
			System.out.println("참입니다");
		}else {
			System.out.println("거짓입니다");
		}
		
		
		String str = "김밥";
		if(str.equals("떡")) {
			System.out.println("맛맛");
		}else {
			System.out.println("맛없");
		}
		
		
		int var = 6;
		if (var % 2 == 0 && var % 3 == 0) {
			System.out.println("2의 배수이면서 3의 배수입니다.");
		}else {
			System.out.println("2 그리고 3의 배수가 아닙니다.");
		}
		
		var = 5;
		if (var % 2 == 0 || var % 3 == 0) {
			System.out.println("2의 배수이거나 3의 배수입니다.");
		}else {
			System.out.println("2 그리고 3의 배수가 아닙니다.\n--------------");
		}
		
		
		int score = 99;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println(grade);
	}

}
