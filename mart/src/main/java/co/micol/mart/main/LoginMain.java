package co.micol.mart.main;

import java.util.Scanner;

import co.micol.mart.data.LoginData;
import co.micol.mart.menu.AdminLoginMenu;
import co.micol.mart.menu.CustomerLoginMenu;

public class LoginMain {
	AdminLoginMenu admin = new AdminLoginMenu();
	CustomerLoginMenu cm = new CustomerLoginMenu();
	
	public void Login() {
		LoginData ld = new LoginData();

		Scanner sc = new Scanner(System.in);

		System.out.println("로그인하세요");
		System.out.print("id >> ");
		String id = sc.nextLine();
		System.out.print("password >> ");
		String password = sc.nextLine();


		for (int i = 0; i < ld.loginVO.size(); i++) {
			if (id.equals("admin") && password.equals("admin")) {
				admin.loginSuccess(id);
			}
			if (id.equals(ld.loginVO.get(i).getId()) && password.equals(ld.loginVO.get(i).getPassword())) {
				cm.loginSuccess(id);
			}
		}

		if (!id.equals(ld.loginVO.get(0).getId()) || !password.equals(ld.loginVO.get(0).getPassword())) {
			cm.loginFailed();
		}

	}

	public void logout() {
		System.out.println("로그아웃 완료!");
		 System.exit(0);
	}
}
