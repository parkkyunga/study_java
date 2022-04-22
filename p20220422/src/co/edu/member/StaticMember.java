package co.edu.member;

public class StaticMember {
	int a ;
	
	
	static double PI = 3.14159;

	static int plus(int x, int y) {
		StaticMember sm = new StaticMember();
		//이렇게 인스턴스화 해야 int a를 가져와서 쓸수있음
		return x + y +sm.a;
	}

	static int minus(int x, int y) {
		return x - y;
	}

}
