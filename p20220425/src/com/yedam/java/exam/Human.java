package com.yedam.java.exam;

public class Human {
	String name;
	double weight;
	double height;
	

	
	public Human(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}



	public void getInfomation() {
		System.out.printf(this.name +" 키 :"+ this.height +" 몸무게 :"+ this.weight);
	}
}
