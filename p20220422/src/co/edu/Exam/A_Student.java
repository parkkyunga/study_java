package co.edu.Exam;

public class A_Student {
	
	//필드
	// 학생 정보 : 학번, 이름, 국어, 수학, 영어
	int studentNo;
	String studentName;
	int kor;
	int eng;
	int math;
	
	//생성자
	public A_Student() {

	}
	
	
	public A_Student(int studentNo, String studentName, int kor, int eng, int math) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	
	}


	//메소드
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
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

	public int getInfo() {
		System.out.println("이름 >" + studentName + "\n국어>"+kor+"\n영어>"+eng+"\n수학>"+math);
		System.out.println("평균>" + getAvg());
		return 1;
	}
	
	public double getAvg() {
		return (kor+eng+math)/3.0;		
	}
	
	


}
