package co.micol.mart.menu;

import java.util.Scanner;
import co.micol.mart.interfaced.Login;
import co.micol.mart.main.LoginMain;
import co.micol.mart.service.AdminLoginService;
import co.micol.mart.service.ProductService;
import co.micol.mart.service.SalesService;

public class AdminLoginMenu implements Login {
	String id;

	@Override
	public void loginSuccess(String id) {
		this.id = id;
		adminMenu();
	}

	@Override
	public void loginFailed() {
		return;
	}
	
	private void adminMenu() {
		boolean run = true;
		while (run) {
			System.out.println("============================== 관리자모드 =================================");
			System.out.println("      1.회원관리　　     2.상품관리　　     3.매출관리　　    4.로그아웃　　  ");
			System.out.println("===========================================================================");
			System.out.println("메뉴를 선택하세요 >> ");

			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				AdminLoginService loginService = new AdminLoginService();
				loginService.menu();
				run = false;
				break;
			case 2:
				ProductService prodService = new ProductService();
				prodService.menu();
				break;
			case 3:
				SalesService salesService = new SalesService();
				salesService.menu();
				break;
			case 4:
				LoginMain login = new LoginMain();
				login.logout();
				break;
			}
		}
	}
}
