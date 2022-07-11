package co.micol.prj20220504.dto;

import java.sql.Date;

public class StudentVO { // set,get으로 이루어진 클래스를 dto라함
	private String id; // 학번
	private String name;
	private String major;
	private String address;
	private String tel;
	private Date birthday;

	public StudentVO() {
	}

	// 생성자오버로딩
	public StudentVO(String id, String name, String major, String address, String tel, Date birthday) {
		this.id = id;
		this.name = name;
		this.major = major;
		this.address = address;
		this.tel = tel;
		this.birthday = birthday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		System.out.print("id  : " + id+", ");
		System.out.print("name : " + name+", ");
		System.out.print("major : " + major+", ");
		System.out.print("address : " + address+", ");
		System.out.print("tel : " + tel+", ");
		System.out.println("birthday : " + birthday+" ");
		return null;
	}

}
