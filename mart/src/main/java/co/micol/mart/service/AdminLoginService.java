package co.micol.mart.service;
import java.util.Scanner;

import co.micol.mart.data.LoginData;
import co.micol.mart.dto.LoginVO;
import co.micol.mart.menu.AdminLoginMenu;

public class AdminLoginService {
	Scanner sc = new Scanner(System.in);
	LoginData ld = new LoginData();

	public void menu() {
		boolean run = true;
		while (run) {
			System.out.println("========================== 관리자모드 > 회원관리 ==========================");
			System.out.println("  1.회원리스트     2.회원검색     3.회원수정     4.회원탈퇴     5.뒤로가기");
			System.out.println("===========================================================================");
		
				int menu = Integer.parseInt(sc.nextLine());
				switch (menu) {
				case 1:
					ListCustomer();
					break;
				case 2:
					System.out.println("검색할 회원의 아이디를 입력하세요 >> ");
					String searchId = sc.nextLine();
					selectCustomer(searchId);
					break;
				case 3:
					System.out.println("수정할 회원의 아이디를 입력하세요 >> ");
					String updateId = sc.nextLine();
					updateCustomer(updateId);
					break;
				case 4:
					System.out.println("삭제할 회원의 아이디를 입력하세요 >> ");
					String deleteId = sc.nextLine();
					deleteCustomer(deleteId);
					break;
				case 5:
					AdminLoginMenu ad = new AdminLoginMenu();
					ad.loginSuccess("admin");

				}
			
		}

	}

	private void deleteCustomer(String deleteId) {
		try {
//			for (LoginVO vo : ld.loginVO) {
//				if (vo.getId().equals(deleteId)) {
//					Iterator<LoginVO> iter = ld.loginVO.iterator();
//					while (iter.hasNext()) {
//						LoginVO root = iter.next();
//						if (root.equals(vo)) {
//							iter.remove();
//							break;
//						}
//					}
//				}
//			}
				
				for (int i = 0; i < ld.loginVO.size(); i++) {
					if(ld.loginVO.get(i).getId().equals(deleteId)) {
						ld.loginVO.remove(i);
						ListCustomer();
					}
				}

			System.out.println();
		} catch (Exception e) {
		}
	}

	private void updateCustomer(String updateId) {
		for (LoginVO vo : ld.loginVO) {
			if (vo.getId().equals(updateId)) {
				vo.CustomerInfoList();
				System.out.println("1.주소수정  2.전화번호수정");
				int menu = Integer.parseInt(sc.nextLine());
				if (menu == 1) {
					System.out.println("수정할 주소 >>");
					vo.setAddress(sc.nextLine());
				} else if (menu == 2) {
					System.out.println("수정할 전화번호 >>");
					vo.setTel(sc.nextLine());
				}
				System.out.println("회원정보 수정완료");
			}
		}
		System.out.println();
	}

	public void selectCustomer(String searchId) {
		for (LoginVO vo : ld.loginVO) {
			if (vo.getId().equals(searchId)) {
				vo.CustomerInfoList();
			}
		}
		System.out.println();
	}

	public void ListCustomer() {
		for (LoginVO vo : ld.loginVO) {
			vo.CustomerInfoList();
		}
		System.out.println();
	}

}
