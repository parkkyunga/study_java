package com.yedam.java.exam;

public abstract class Culture {//추상클래스
	String title;
	int dirNum;
	int actNum;
	int audienceNum;
	int score;
	
	public Culture(String title, int dirNum, int actNum, int audienceNum, int score) {
		super();
		this.title = title;
		this.dirNum = dirNum;
		this.actNum = actNum;
		this.audienceNum = audienceNum;
		this.score = score;
	}
	
	public void setTotalScore(int score) {
		
	}
	public String getGrade() {
		return title;
		
	}
	public abstract void getInfomation();
}
