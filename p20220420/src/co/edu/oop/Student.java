package co.edu.oop;

public class Student {
	//필드
	String name ;
	int age;
	int kor;
	int eng;
	int math;
	
	//생성자

	public Student(){
		
	}
	
	//메소드
	void getInfo() {
		System.out.println("학생이름 : "+name+"\n나이 : "+age);
	}
	
}
