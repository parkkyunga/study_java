package co.edu.oop;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자 오버로딩
	public Korean (String n,String s) {
		//this 클래서 내에 선언된 필드를 찝어서 사용하겠다
		this.name = n;
		this.ssn = s;
	}
	public Korean (String n,String s,String p) {
		this.name = s;
		this.nation = n;
		this.ssn = p;
	}
	
	//메소드
	void getInfo() {//리턴이필요없는애들 void
		System.out.println("국적: "+nation);
		System.out.println("이름: "+name);
		System.out.println("주민번호: "+ssn);
	}
	
	
}
