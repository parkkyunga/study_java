package co.yedam.var;

public class VariableExample {

	public static void main(String[] args) {
		
		int var1 = 0b1011;		//2진수
		int var2 = 0206;		//8진수
		int var3 = 365;			//10진수
		int var4 = 0xB3;		//16진수
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		
		
		long longVar1 = 10;
		long longVar2 = 20L;
//		long longVar3 = 1000000000000;
		long longVar4 = 1000000000000L;
		System.out.println(longVar2 + "," + longVar4);
	
	
		char c1 = 'A'; //문자
		char c2 = 65; //숫자를 넣으면 문자로 나옴
		char c3 = 44032;
		char c4 = 44035;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3+","+c4);

		
		String name = "홍길동"; //문자열
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		System.out.println("번호\t이름\t직업");
		System.out.println("행단위출력 \n");
		System.out.println("행단위출력 \n");
		
		
//		float floatVar1 = 3.14;
		float floatVar2 = 3.14f;
		
		double doubleVar1 = 0.321;
		
		System.out.println(floatVar2);
		System.out.println(doubleVar1);
		
		float floatVar3 = 0.1234567890123456789f;
		double doubleVar2 = 0.12345678901234567890;
		System.out.println(floatVar3);
		System.out.println(doubleVar2);
		
		boolean stop = true;
		boolean state = false;
		
		if (stop) {
			System.out.println("중지합니다");
		} else {
			System.out.println("시작합니다");
		}
		
	}

}
