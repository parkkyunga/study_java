package com.yedam.java.exam;

public abstract class Culture {
	String title;
	int director;
	int actor;
	int audience;
	int score;
	
	
	public Culture(String title, int director, int actor) {
		super();
		this.title = title;
		this.director = director;
		this.actor = actor;
	}
	
	//관객수와 총점을 누적 
	public void setTotalScore(int score) {
		this.audience++;
		this.score+=score;
	}
	//평점구하는기능 
	public String getGrade() {
		int avg = this.score/this.audience;
		String grade = null;
		switch(avg) {
		case 1:
			grade = "☆";
			break;
		case 2:
			grade = "☆☆";
			break;
		case 3:
			grade = "☆☆☆";
			break;
		case 4:
			grade = "☆☆☆☆";
			break;
		case 5:
			grade = "☆☆☆☆☆";
			break;
		}
		
		return grade;	
	}
	
	//정보출력 
	public abstract void getInfomation();
}
