package com.yedam.java.ch08_02;

public class InterfaceExample {
	public static void main(String[] args) {
		ImplementationC imp1 = new ImplementationC();
		InterfaceA ia = imp1;
		ia.methodA();
		
		InterfaceB ib = imp1;
		ib.methodB();
		
		InterfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
