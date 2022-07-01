package co.micol.mart.util;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import co.micol.mart.dto.ProductVO;

public class Listform {
	
	public static void listForm_category(List<ProductVO> list, String cate) {

		DecimalFormat df = new DecimalFormat("0");
		df = new DecimalFormat("#,###");
		System.out.println("========================== 관리자모드 >> 매출관리 >> "+cate+" ===========================");
		
		menuforAdmin();
		String[] str = new String[7];
		int line = 0;
		int page = 1;
		Scanner sc = new Scanner(System.in);
		try {
			for (int i = 0; i < list.size(); i++) {
				if (cate.equals(list.get(i).getCategory())) {
					str[0] = Integer.toString(list.get(i).getCode());
					str[1] = list.get(i).getCategory();
					str[2] = list.get(i).getProdName();
					str[3] = Integer.toString(list.get(i).getPrice());
					str[4] = Integer.toString(list.get(i).getStock());
					str[5] = Integer.toString(list.get(i).getSalesVolume());
					str[6] = (list.get(i).getCondition()) ? "판매중" : "품절";
					line++;
					String str3 = df.format(list.get(i).getPrice());
					System.out.printf("%5s %10s %10s %10s %5s %5s %8s", str[0], str[1], str[2], str3, str[4], str[5],
							str[6] + "\n");

					if (line % 10 == 0) {
						System.out.println("=========================================================================================");
						System.out.println();
						System.out.printf("%45s", "<< " + page + " >> \n");
						String sign = sc.nextLine();
						if (sign.equals(">")) {
							page++;
							System.out.println("다음페이지가 없습니다.");
							System.out.println("목록으로 돌아갑니다.");
							sc.nextLine();
							continue;
						} else if (sign.equals("<")) {
							page--;
							i -= 20;
							line -= 20;
						}
					}else if (line == list.size()) {
						System.out.println();
						System.out.printf("%35s", "<< " + page + " >> \n");

						if (sc.nextLine().equals("<")) {
							Listform.menuforAdmin();
							page--;
							i -= ((i % 10) + 11);
							line -= ((line % 10) + 10);
						} else {
							page++;
							System.out.println("마지막페이지입니다. 목록으로 돌아갑니다.");
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


	public static void menuforAdmin() {
		String[] menus = { "상품코드", "카테고리", "상품명", "가격", "재고량", "판매량", "판매상황" };
		System.out.println("==========================================================================================");
		System.out.printf("%5s %10s %12s %10s %5s %5s %8s", menus[0], menus[1], menus[2], menus[3],
				menus[4], menus[5], menus[6] + "\n");
		System.out.println("==========================================================================================");
	}
	public static void menuforCustomer() {
		String[] menus = { "상품코드", "카테고리", "상품명", "가격", "판매가능(개)" };
		System.out.println("===========================================================================");
		System.out.printf("%5s %10s %15s %10s %10s ", menus[0], menus[1], menus[2], menus[3],
				menus[4] );
		System.out.println();
		System.out.println("===========================================================================");
	}


}
