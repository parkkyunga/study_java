package com.yedam.java.exam;

public class ObesityInfo extends StandardWeightInfo{

	public ObesityInfo(String name, double weight, double height) {
		super(name, weight, height);
	}
	
	public void getInfomation() {
		getObesity();
	}
	
	
	public double getObesity() {
		double BMI = (weight-getStandardWeight())/getStandardWeight()*100;
		
		if (BMI <= getStandardWeight()) {
			System.out.println(name+"님의 신장 "+height+", 몸무게 "+weight+", 비만입니다.");
			
		}else {
			System.out.println(name+"님의 신장 "+height+", 몸무게 "+weight+", 정상입니다.");
		}
		return BMI;
		
	}
}
