package co.micol.mart.dto;

public class LoginVO {
	String id;
	String name;
	String password;
	String address;
	String tel;
	int money; // 보유금액
	int totalPayment; // 쓴금액
	int purchase;

	public LoginVO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public LoginVO(String id, String password, String name, String address, String tel, int money, int totalPayment,
			int purchase) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.tel = tel;
		this.money = money;
		this.totalPayment = totalPayment;
		this.purchase = purchase;
	}

	public LoginVO() {
		// TODO Auto-generated constructor stub
	}

	public LoginVO(String id) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(int totalPayment) {
		this.totalPayment = totalPayment;
	}

	public int getPurchase() {
		return purchase;
	}

	public void setPurchase(int purchase) {
		this.purchase = purchase;
	}

	@Override
	public String toString() {
		System.out.println(id + name + address + tel + money + totalPayment + purchase);
		return null;
	}

	public void CustomerInfoList() {
//		System.out.println("아  이  디 : "+id);
//		System.out.println("이 　　　름　: "+name);
//		System.out.println("주 　　　소　: "+address);
//		System.out.println("전 화 번 호 : "+tel);
//		System.out.println("현재보유금액 : "+money);
//		System.out.println("총구매금액　 : "+totalPayment);
//		System.out.println("구 매 횟 수 : "+purchase);
		
		System.out.println("아이디 :" + id + " 이름 :" + name + " 주소 :" + address + " 전화번호 :" + tel + " 현재보유금액 :" + money
				+ " 총구매금액 :" + totalPayment + " 구매횟수 :" + purchase);
	}
}
