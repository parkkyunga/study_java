package co.edu.oop;

import java.util.Scanner;

public class ShoppingMallMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문번호를 입력하시오");
		int ordno = Integer.parseInt(sc.nextLine());
		
		System.out.println("아이디를 입력하시오");
		String id = sc.nextLine();
		
		System.out.println("이름을 입력하시오");
		String name = sc.nextLine();

		System.out.println("상품넘버를 입력하시오");
		int itemno = Integer.parseInt(sc.nextLine());

		System.out.println("주소를 입력하시오");
		String addr = sc.nextLine();
		
		ShoppingMall spm = new ShoppingMall(ordno, id, name, itemno, addr);
		spm.list();
	}
}
