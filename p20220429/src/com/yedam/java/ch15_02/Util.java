package com.yedam.java.ch15_02;

public class Util {
//	public static Box<T> boxing(Object object) { 
//	제네릭타입 리턴되는 타입앞에 T적어줌
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
}
