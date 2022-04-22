package co.edu.company;

import co.edu.access.A;

public class C extends A {
	public static void main(String[] args) {
		A a = new A(); // co.edu.access 밑에있는 A가져옴
		
		int temp;
		temp = a.b; //public이라서 b만 호출가능..
		
		//protected
		C c = new C();
		int d = c.c;
		
	}
}


