package co.yedam.var;

public class VariableExample2 {
	public static void main(String[] args) {
		//자동타입변환
		byte a = 10;
		int b = a;
		long c = b;
		
		//강제타입변환
		int intValue = 44032;
		char charValue = (char)intValue;
		
		System.out.println(charValue);
	
		
		int intValue1 = 10; // 1byte 127까지표현
		byte byteValue = (byte) intValue1;
		
		System.out.println(byteValue);
		
	}
}
