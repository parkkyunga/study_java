package co.edu.member;

public class Person {
	//필드
	final String nation = "korean";
	final String ssn;
	String name;
	
	//생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	//메소드
	public void info() {
		System.out.println(nation+ssn);
	}
	
	
}
