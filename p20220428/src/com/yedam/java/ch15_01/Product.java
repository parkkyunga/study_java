package com.yedam.java.ch15_01;

public class Product<T,M> {
	private T t;
	private M m;
	
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}
}

class Tv{}
class Car{}
