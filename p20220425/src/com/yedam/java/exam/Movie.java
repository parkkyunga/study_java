package com.yedam.java.exam;

public abstract  class Movie{
	String genre;

	public Movie(String genre) {
		super();
		genre = genre;
	}
	
	public abstract void getInfomation();
}
