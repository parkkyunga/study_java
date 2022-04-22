package co.edu.member;

public class Singleton {
	//필드
	//싱글톤객체 내에서만 쓸려고 private, 그럼 main클래스에서 못불러감
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {}
	
	//정적메소드
	static Singleton getInstance() {
		if(singleton == null ) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
