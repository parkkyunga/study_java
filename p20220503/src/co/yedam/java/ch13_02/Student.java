package co.yedam.java.ch13_02;

public class Student {
	int sno;
	String name;

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && name.equals(student.name);
		} else {
			return false;
		}

	}

}
