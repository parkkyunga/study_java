package co.edu.Exam;

public class Student {
	//필드
	int stdNo;
	String stdName;
	int kor;
	int eng;
	int math;
	
	public Student() {
		
	}

	//매개변수 생성자만들기
	


	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		
		this.stdNo = stdNo;
		System.out.println(stdNo+"******************");
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	//getinfo, getavg
}
