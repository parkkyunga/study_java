package com.yedam.java.exam;

public class Movie extends Culture{
	
	String genre;

	public Movie(String title, int director, int actor,String genre) {
		super(title, director, actor);
		this.genre = genre;
	}
	

	public void getInfomation() {
		System.out.println(genre+"제목 >> "+title);
		System.out.println("감독수 >> "+director);
		System.out.println("배우수 >> "+actor);
		System.out.println(genre+"총점 >> "+score);
		System.out.println(genre+"평점 >> "+getGrade());
	}
}
