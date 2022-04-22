package co.edu.company;

public class Programmer extends Employee {
	@Override
	int getSalary() {
		baseSalary+=2000000;
		return baseSalary;
	}
	
}
