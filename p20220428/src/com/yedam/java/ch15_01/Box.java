package com.yedam.java.ch15_01;

public class Box<T> {
//	private Object object;
//	private Object object=new Apple();
	private T t;
	
//	public Object getObject() {return object;}
	public T get() {return t;}
	
//	public void setObject(Object object) {this.object = object;}
	public void set(T t) {this.t = t;}
	
	

}
