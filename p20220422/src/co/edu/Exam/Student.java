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

	public Student(int stdNo, String stdName, int kor, int eng, int math) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getStdNo() {
		return stdNo;
	}
	
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
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

	public double getAvg() {
		return (kor+eng+math)/3.0;		
	}
	
	//getinfo, getavg
	public int getInfo() {
		System.out.println("이름 >" + stdName + "\n국어>"+kor+"\n영어>"+eng+"\n수학>"+math);
		System.out.println("평균>" + getAvg());
		return 1;
	}
}
