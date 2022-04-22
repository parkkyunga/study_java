package co.edu.company;

import java.util.Scanner;

import co.edu.member.Person;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person sp = new Person("92","kim");
		
		sp.info();
		
		//manager,programmer -> employee 를 상속받고 ,getSalary를 오버라이드
		//manager -> baseSalary + 1000000
		//programmer ->baseSalary + 2000000
		Manager mn = new Manager();
		System.out.println("관리자의 월급 : "+mn.getSalary());
		Programmer prog = new Programmer();
		System.out.println("프로그래머의 월급 : "+prog.getSalary());
		
		
		Bird bird =  new Bird();
		bird.fly();
		bird.walk();
	}
}
