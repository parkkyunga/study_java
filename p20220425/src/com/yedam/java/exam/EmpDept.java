package com.yedam.java.exam;

public class EmpDept extends Employee {
	String department;
	


	public EmpDept(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}



	public String getDepartment() {
		return department;
	}
	
	@Override
	public void getInfomation() {
		System.out.println("이름:"+this.name+" 연봉:"+this.salary+" 부서:"+this.department);
	}
	
	@Override
	public void print() {
		super.print();//부모클래스 메소드 호출
		System.out.println("서브클래스");
	}
	
	
}
