package com.yedam.java.ch08_02;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.driver(new Bus());
		driver.driver(new Taxi());
	}
}
