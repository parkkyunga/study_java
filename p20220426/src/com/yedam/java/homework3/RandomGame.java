package com.yedam.java.homework3;

import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		double rndNo = (Math.random())*2;
		
		if((int)rndNo == 0) {
			RPGgame rpg = new RPGgame();
			
		}else if((int)rndNo == 1) {
			ArcadeGame arc = new ArcadeGame();
		}
		
		
	}
		
}
