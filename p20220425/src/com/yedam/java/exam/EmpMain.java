package com.yedam.java.exam;

public class EmpMain {
	public static void main(String[] args) {
		EmpDept emp = new EmpDept("이지나", 3000, "교육부");
		
		emp.getInfomation();
		emp.print();
	}
}
