package co.edu.oop;

public class Person {
	//필드
	String ssn;
	String name;
	String address;
	int age;
	
	//기본생성자1
	public Person() {
		
	}
	
	//매개변수로 필드초기화하는 생성자2
	public Person(String ssn, String name, String address, int age) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	//메소드
	void introduce() {
		System.out.println(
				"person [name : " + name + ", age : " + age + ", 주민번호 : " + this.ssn + ", 주소 : " + address + "]");
	}
}
