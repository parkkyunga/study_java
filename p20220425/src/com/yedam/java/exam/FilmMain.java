package com.yedam.java.exam;

public class FilmMain {
	public static void main(String[] args) {
		Movie movie = new Movie("추격자", 7, 5,"영화");
		movie.setTotalScore(4);
		movie.setTotalScore(1);
		movie.setTotalScore(2);
		movie.setTotalScore(5);
		movie.getInfomation();
		System.out.println("-----------------");
		
		Performance per = new Performance("지킬앤하이드", 9, 10, "장르");
		per.setTotalScore(5);
		per.setTotalScore(5);
		per.setTotalScore(5);
		per.getInfomation();
	}
}
