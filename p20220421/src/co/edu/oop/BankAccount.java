package co.edu.oop;

public class BankAccount {
	//필드
	String Account ; //계좌번호
	String name; //예금주
	int money; //잔액
	
	//생성자
	public BankAccount(String account, String name, int money) {
		this.Account = account;
		this.name = name;
		this.money = money;
	}

	// 메소드 예금,출금,잔액 총3개
	void diposit(int dep) {
		money += dep;
		System.out.println("\n계좌번호 > "+this.Account);
		System.out.println("이름 > "+this.name);
		System.out.println("현재잔액 > "+this.money+"\n");
	}

	void withDraw(int with) {
		money -= with;
		System.out.println("\n계좌번호 > "+this.Account);
		System.out.println("이름 > "+this.name);
		System.out.println("현재잔액 > "+this.money+"\n");
	}

	void nowMoney() {
		System.out.println("현재잔액 > " + money+"\n");
	}

}
