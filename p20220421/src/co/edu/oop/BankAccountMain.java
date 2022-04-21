package co.edu.oop;

import java.util.Scanner;

public class BankAccountMain {
	public static void main(String[] args) {
		//인스턴스1개, 인자3개가지도록생성
		//스캐너사용
		//반복문써서 1예금 2출금 3잔액확인 4종료
		BankAccount ba = new BankAccount("1223-152-122", "홍길동", 0);
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("1.예금 |2.출금 |3.잔액확인 |4.종료");

			int selNum = sc.nextInt();
			
			if(selNum == 1) {
				System.out.println("예금할 금액을 입력하시오");
				int dep = sc.nextInt();
				ba.diposit(dep);
			}else if(selNum == 2) {
				System.out.println("출금할 금액을 입력하시오");
				int with = sc.nextInt();
				ba.withDraw(with);
			}else if(selNum == 3) {
				ba.nowMoney();
			}else {
				System.out.println("종료합니다");
				break;
				
			}
		}
		
	
		
	}
}
