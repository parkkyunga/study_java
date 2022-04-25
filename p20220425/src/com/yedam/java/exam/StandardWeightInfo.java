package com.yedam.java.exam;

public class StandardWeightInfo extends Human{

	public StandardWeightInfo(String name, double weight, double height) {
		super(name, weight, height);
	}
	
	public void getInfomation() {
		System.out.println(name+"님의 신장 "+height+", 몸무게 "+weight+", 표준체중 "+getStandardWeight()+"입니다.");
		
	}
	double standardWeight ;
	
	public double getStandardWeight() {
		standardWeight = (height-100) * 0.9;
		
		return standardWeight;
		
	}
}
