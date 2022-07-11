package com.yedam.java.ch13_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");// 값 못들어갔음..
		set.add("iBATIS");

		int size = set.size();
		System.out.println("총 객체 수 : " + size);// 총 5개 넣었지만 "Java" 같아서 중복이라여김

		// set이 string이면 iterotor도 string이여함
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		System.out.println();
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체 수 : " + set.size());
		for (String str : set) {
			System.out.println("\t" + str);
		}
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}
}
