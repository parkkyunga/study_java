package co.edu.company;

public class Bird extends Animal{
	
	void fly() {
		System.out.println("날수있음");
	}
	@Override
	void walk() {
		System.out.println("헤엄칠수있음");
	}


}
