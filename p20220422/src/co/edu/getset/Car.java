package co.edu.getset;

public class Car {
	//필드
	private String company;
	private String model;
	private String color;
	private int speed;
	
	//생성자
	public Car() {}

	//메소드
	//get,set쓰는이유 무결성때문(데이터보호,정보은닉)
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		//속도 mile => km
		return speed * 2;
	}

	public void setSpeed(int speed) {
		if(speed < 0) {
			speed = 0;
		}//자동차속도 -값있을수없으니까
		this.speed = speed;
	}
	
}
