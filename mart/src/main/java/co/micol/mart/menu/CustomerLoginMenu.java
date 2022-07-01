package co.micol.mart.menu;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.micol.mart.data.LoginData;
import co.micol.mart.data.ProductData;
import co.micol.mart.dto.ProductVO;
import co.micol.mart.interfaced.Login;
import co.micol.mart.main.LoginMain;
import co.micol.mart.service.ShoppingService;
import co.micol.mart.util.Listform;

public class CustomerLoginMenu  implements Login {
	

	DecimalFormat df = new DecimalFormat("0");
	Scanner sc = new Scanner(System.in);
	CustomerLoginMenu cm; 
	String logId;
	int money = 0;
	int volume;
	int stock;
	int totalPay;
	String myName;
	String buyProdName;
	int purchase;// 구매횟수

	LoginData ld = new LoginData();

	int prodCode;	
	
	

	String id;
	ProductData pd = new ProductData();
	@Override
	public void loginSuccess(String id) {
		this.id =id;
		customerMenu();
	}

	@Override
	public void loginFailed() {
		System.out.println("다시 로그인 하세요.");
		return;
	}

	private void customerMenu()  {
		ShoppingService ss = new ShoppingService(id);
		boolean run = true;
		while (run) {
			System.out.println("==========================================================================");
			System.out.println("          1.쇼핑하기　　        2.마이페이지　         3.로그아웃　　  ");
			System.out.println("==========================================================================");
			System.out.println("메뉴를 선택하세요 >> ");

			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				ss.ListShopping(pd.productVO);
				break;
			case 2:
				ss.myPage();
				break;
			case 3:
				LoginMain login = new LoginMain();
				login.logout();
				break;
			}
		}
	}

	private void purchase() {
		// TODO Auto-generated method stub
		System.out.println("구매하려는 상품의 코드를 입력하세요. ");
		//
		prodCode = Integer.parseInt(sc.nextLine());
		for (ProductVO pvo : pd.productVO) {
			if (prodCode == pvo.getCode()) {
				pvo.productInfo();

				for (int i = 0; i < ld.loginVO.size(); i++) {

					String a = ld.loginVO.get(i).getId();
					if (a.equals(logId)) {

						money = ld.loginVO.get(i).getMoney();
						String name = ld.loginVO.get(i).getName();

						System.out.println("\n" + name + "님 현재 보유금액은 " + df.format(money) + "원 입니다. 구매하시겠습니까?");
						System.out.println("1.네  2.아니요(목록보기)");
						if (sc.nextLine().equals("1")) {
							// 내가가진 돈 > 물건가격(구매성공)
							if (money > pvo.getPrice()) {
								System.out.println("구매성공 !");

								// 구매횟수 1추가
								int purchase2 = ld.loginVO.get(i).getPurchase();
								this.purchase = purchase2;
								purchase2++;
								ld.loginVO.get(i).setPurchase(purchase2);
								purchase = ld.loginVO.get(i).getPurchase();
								
								money -= pvo.getPrice();
								ld.loginVO.get(i).setMoney(money);

								volume = pvo.getSalesVolume();
								volume += 1;
								pvo.setSalesVolume(volume);

								stock = pvo.getStock();
								stock -= 1;
								pvo.setStock(stock);

								totalPay += pvo.getPrice();

								myName = ld.loginVO.get(i).getName();

								buyProdName = pvo.getProdName();
								pvo.setProdName(buyProdName);

								myPage();
								break;
							} else {
								System.out.println("구매가능한 돈이 부족합니다.");
								System.out.println("메인으로 돌아갑니다.");
								sc.nextLine();
								cm.loginSuccess(logId);

								return;
							}

						} else {
							cm.loginSuccess(logId);
							break;
						}
					}
				}
			}
		}
	}

	private void myPage() {
		// TODO Auto-generated method stub
		for (int i = 0; i < ld.loginVO.size(); i++) {

			if (logId.equals(ld.loginVO.get(i).getId())) {
				totalPay = ld.loginVO.get(i).getTotalPayment();
				myName = ld.loginVO.get(i).getName();
				money = ld.loginVO.get(i).getMoney();
				if (ld.loginVO.get(i).getTotalPayment() == 0) {
					buyProdName = "구매내역이 없습니다.";
				}

				for (ProductVO pvo : pd.productVO) {
					if (prodCode == pvo.getCode()) {
						money = pvo.getPrice();
						ld.loginVO.get(i).setMoney(money);
						money = ld.loginVO.get(i).getMoney();

						totalPay -= pvo.getPrice();

						buyProdName = pvo.getProdName();
					}

				}
				purchase = ld.loginVO.get(i).getPurchase();
				System.out.println("========== 마이페이지 =============");
				System.out.println("  이     름    > " + myName);
				System.out.println("현 재 보 유 금 액 > " + df.format(money));
				System.out.println(" 총 구 매 금 액  > " + df.format(totalPay));
				System.out.println(" 구  매  내  역 > " + buyProdName);
				System.out.println(" 구  매  횟  수 > "+purchase);
				System.out.println("=================================");
				System.out.println("메뉴로 돌아가려면 아무버튼이나 누르세요");

				sc.nextLine();
				cm.loginSuccess(logId);
			}
	}

	}
}
