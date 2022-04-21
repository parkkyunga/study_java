package co.edu.oop;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person("12345-12345", "홍길동", "대구광역시", 20);
		person.introduce();

		Person person2 = new Person("22222-33333", "john", "미    국", 30);
		person2.introduce();

		Person person3 = new Person("44444-55555", "박경아", "서울특별시", 50);
		person3.introduce();
	}
}
