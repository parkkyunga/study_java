package com.yedam.java.ch11_03;

public class MathClassExample {
	public static void main(String[] args) {
		// 절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);

		// 올림값
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 : " + v3);
		System.out.println("v4 : " + v4);

		// 버림값
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 : " + v5);
		System.out.println("v6 : " + v6);

		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 : " + v7);
		System.out.println("v8 : " + v8);

		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 : " + v9);
		System.out.println("v10 : " + v10);

		double v11 = Math.random();
		System.out.println("v11 : " + v11);

		// 반올림같은개념, 가까운정수의 실수값
		// 소수점 첫번째자리까지 반올림 round와 다른점은 음수일때 값이달라짐
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12 : " + v12);
		System.out.println("v13 : " + v13);

		// 반올림 소숫점이하 첫째자리에서
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14 : " + v14);
		System.out.println("v15 : " + v15);
		// 반올림 소숫점이하 셋째자리에서하고싶다면..!
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;
		System.out.println("temp2 : " + temp2);
		System.out.println("v16 : " + v16);

		// rint 와 round 차이
		// rint는 0.5일때 짝수값으로넘어감 0과 1중에 0..;
		System.out.println("round(0.5) : " + Math.round(0.5)); // 정수
		System.out.println("rint(0.5) : " + Math.rint(0.5)); // 실수
		System.out.println("round(1.5) : " + Math.round(1.5));
		System.out.println("rint(1.5) : " + Math.rint(1.5));

	}
}
