package co.edu.oop;

public class ShoppingMall {
	//필드
	int orderNo;
	String id;
	String name;
	int orderItemNo;
	String address;
	
	//생성자
	public ShoppingMall(int oderNo,String id,String name,int orderItemNo,String address) {
		this.orderNo = oderNo;
		this.id = id;
		this.name = name;
		this.orderItemNo = orderItemNo;
		this.address = address;
	}
	
	//메소드
	void list() {
		System.out.println("\n주문번호 : " + orderNo);
		System.out.println("아 이 디 : " + id);
		System.out.println("이   름 : " + name);
		System.out.println("주문상품번호 : " + orderItemNo);
		System.out.println("주   소 : " + address);
	}
}
