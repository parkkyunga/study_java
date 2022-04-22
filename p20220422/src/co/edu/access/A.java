package co.edu.access;

public class A {
	//default 접근제한자
	//같은패키지 내에 있는 클래스에서만 호출가능
	int a;
	
	//public
	//모든패키지 및 클래스에서 호출가능
	public int b;
	
	//protected
	//같은 패키지 내에있는 클래스 및 자식 클래스에서 호출가능
	protected int c;
	
	//private
	//속해있는 클래스 내에서만 호출가능
	private int d;
}
