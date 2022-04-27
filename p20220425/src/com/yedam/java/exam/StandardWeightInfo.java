package com.yedam.java.exam;

public class StandardWeightInfo extends Human{

	public StandardWeightInfo(String name, double weight, double height) {
		super(name, weight, height);
	}
	
	@Override
	public void getInfomation() {
		super.getInfomation();
		System.out.printf(", 표준체중 %.1f 입니다\n",getStandardWeight());
	// 	printf는 한줄에 값전부출력할수있음
	//	System.out.println(name+"님의 신장 "+height+", 몸무게 "+weight+", 표준체중 "+getStandardWeight()+"입니다.");
		
	}
	double standardWeight ;
	
	public double getStandardWeight() {
		standardWeight = (height-100) * 0.9;
		
		return standardWeight;
		
	}
}
