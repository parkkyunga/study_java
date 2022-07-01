package co.micol.mart.service;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import co.micol.mart.data.LoginData;
import co.micol.mart.data.ProductData;
import co.micol.mart.dto.ProductVO;
import co.micol.mart.menu.CustomerLoginMenu;
import co.micol.mart.util.Listform;

public class ShoppingService {
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0");
	CustomerLoginMenu cm = new CustomerLoginMenu();
	String logId;
	int money = 0;
	int volume;
	int stock;
	int totalPay;
	String myName;
	String buyProdName;
	int purchase;// 구매횟수

	
	public ShoppingService(String id) {
		this.logId = id;
	}

	public void ListShopping(List<ProductVO> list) {
		df = new DecimalFormat("#,###");
		int line = 0;
		int page = 1;

		try {
			Listform.menuforCustomer();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getCondition() == true) {
					int code = list.get(i).getCode();
					String category = list.get(i).getCategory();
					String ProdNm = list.get(i).getProdName();
					String price = df.format(list.get(i).getPrice());
					int stock = list.get(i).getStock();

					line++;
					System.out.printf("%6s %12s %12s %10s  %8s", code, category, ProdNm, price, stock + "\n");

					if (line % 10 == 0) {
						System.out.println("==========================================================================");
						System.out.println();
						System.out.printf("%35s", "<< " + page + " >> \n");
						System.out.printf("%45s", "<.이전페이지   1.바로구매하기  2.돌아가기   >.다음페이지");
						System.out.println();
						String sign = sc.nextLine();
						if (sign.equals(">")) {
							// 다음페이지
							Listform.menuforCustomer();
							page++;
							continue;
						} else if (sign.equals("<")) {
							// 이전페이지
							Listform.menuforCustomer();
							page--;
							i -= 20;
							line -= 20;
						} else if (sign.equals("1")) {
							// 바로구매
							purchase();
						} else if (sign.equals("2")) {
							// 돌아가기
							cm.loginSuccess(logId);
						}
					} else if (line == list.size()) {
						System.out.println();
						System.out.printf("%35s", "<< " + page + " >> \n");
						if (sc.nextLine().equals("<")) {
							Listform.menuforCustomer();
							page--;
							i -= ((i % 10) + 11);
							line -= ((line % 10) + 10);
						} else {
							page++;
							System.out.println("마지막페이지입니다.");
							sc.nextLine();
						}
					}
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("이전 페이지가 없습니다.");
			System.out.println("목록으로 돌아갑니다.");
			sc.nextLine();
		}
		System.out.println();
	}

	LoginData ld = new LoginData();

	ProductData pd = new ProductData();
	int prodCode;

	public void purchase() {

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

	public void myPage() {
		for (int i = 0; i < ld.loginVO.size(); i++) {
			if (logId.equals(ld.loginVO.get(i).getId())) {
				totalPay = ld.loginVO.get(i).getTotalPayment();
				myName = ld.loginVO.get(i).getName();
				money = ld.loginVO.get(i).getMoney();
				purchase = ld.loginVO.get(i).getPurchase();
				if (ld.loginVO.get(i).getTotalPayment() == 0) {
					buyProdName = "구매내역이 없습니다.";
				}else {
					buyProdName = "";
				}
				for (ProductVO pvo : pd.productVO) {
					if (prodCode == pvo.getCode()) {
						totalPay += pvo.getPrice();
						buyProdName = pvo.getProdName();
					}
				}
				System.out.println("========== 마이페이지 =============");
				System.out.println("  이     름    > " + myName);
				System.out.println("현 재 보 유 금 액 > " + df.format(money));
				System.out.println(" 총 구 매 금 액  > " + df.format(totalPay));
				System.out.println(" 구  매  횟  수 > " + purchase);
				System.out.println(" 구  매  내  역 > " + buyProdName);
				System.out.println("=================================");
				System.out.println("메뉴로 돌아가려면 아무버튼이나 누르세요");

				sc.nextLine();
				cm.loginSuccess(logId);
			}
		}

	}

}
