package co.edu.oop;

public class Student {
	//학생1명관리프로그램
	//필드:학번,이름,국어,영어,수학
	int stdNo ;
	String name;
	int kor;
	int eng;
	int math;
	double avg;
	
	//생성자
	//기본생성자를 통한 데이터입력
	public Student() {
		this.stdNo = 1;
		this.name = "홍길동";
		this.kor = 70;
		this.eng = 100;
		this.math = 80;
	}
	
	//메소드:학생정보리스트,점수평균
	void list() {
		System.out.println("학번: "+this.stdNo+"| 이름: "+this.name+"| 국어점수: "+this.kor+"| 영어점수: "+this.eng+"| 수학점수: "+math);
	}
	void avg() {
		avg = (this.kor+this.eng+this.math)/3;
		System.out.println("평균점수: "+avg);
	}
}
