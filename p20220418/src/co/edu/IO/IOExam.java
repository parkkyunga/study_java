package co.edu.IO;

import java.io.IOException;

public class IOExam {
	public static void main(String[] args) {
		
		//괄호 안 출력
		System.out.print(false);
		
		//괄호 안 출력 후 엔터
		//ln이 엔터키역할
		System.out.println(); 
		
		//괄호 안 내용 커스텀해서 출력
//		System.out.printf(null,args);
		
		//정수
		int value = 123;
		System.out.printf("%d\n",value);
		System.out.printf("%5d\n",value);
		System.out.printf("%-5d\n",value);
		System.out.printf("%05d\n",value);
		System.out.println("------------");
		
		//실수
		double value2 = 12.123456;
		//소수점 아래 2개까지만 표현
		System.out.printf("%.2f\n", value2);
		//총9자리출력해줘 근데 소숫점아래 4자리까지만
		System.out.printf("%9.4f\n", value2);
		System.out.printf("%-9.0f\n", value2);
		System.out.println("------------");
		
		
		try {
			System.out.println("값을 입력하세요.");
			int keyCode = System.in.read();
			System.out.println("입력갑 = "+keyCode);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
