package com.yedam.java.exam;

public class Performance extends Culture{


	String genre;

	
	public Performance(String title, int director, int actor, String genre) {
		super(title, director, actor);
		this.genre = genre;
	}




	@Override
	public void getInfomation() {

		System.out.println(genre + "제목 : " + title);
		System.out.println("감독 : " + director);
		System.out.println("배우 : " +actor);
		System.out.println(genre + "총점 : " + score);
		System.out.println(genre + "평점 : " + getGrade());
		
	}
}
