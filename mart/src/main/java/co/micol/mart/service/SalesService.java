package co.micol.mart.service;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import co.micol.mart.data.ProductData;
import co.micol.mart.dto.ProductVO;
import co.micol.mart.menu.AdminLoginMenu;
import co.micol.mart.util.Listform;

public class SalesService {
ProductData pd = new ProductData();
	public void menu() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("========================= 관리자모드 >> 매출관리 ==========================");
			System.out.println("           1.판매량순　　         2.카테고리별            3.뒤로가기　　 ");
			System.out.println("===========================================================================");
			System.out.println("메뉴를 선택하세요 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				sortStock(pd.productVO);
				break;
			case 2:
				System.out.println("  1.과일/채소   2.냉장/냉동/밀키트   3.유제품/음료   4.과자/시리얼   ");
				String[] cateArr = { "과일/채소", "냉장/냉동/밀키트", "유제품/음료", "과자/시리얼" };
				int categoryNum = Integer.parseInt(sc.nextLine())-1;
				for (int i = 0; i < cateArr.length; i++) {
					if (categoryNum == i) {
						Listform.listForm_category(pd.productVO, cateArr[categoryNum]);
					}
				}
			case 3:
				AdminLoginMenu am = new AdminLoginMenu();
				am.loginSuccess("admin");
				break;
						
			}

		}

	}

	ProductService ps = new ProductService();

	private void sortStock(List<ProductVO> list) {
		// Collections.sort(productVO);
		// productVO.sort(Comparator.comparing(ProductVO::getCode).thenComparing(ProductVO::getProdName));
		// productVO.sort(Comparator.comparing(ProductVO::getSalesVolume,
		// Comparator.reverseOrder()));

		// 판매량순->코드순 정렬
		System.out.println("====================== 관리자모드 >> 매출관리 >> 판매량순으로보기 ========================");
		pd.productVO.sort(Comparator.comparing(ProductVO::getSalesVolume, Comparator.reverseOrder())
				.thenComparing(ProductVO::getCode));
		ps.listProd(list);
	}

	private void sortCategory(List<ProductVO> list) {
		pd.productVO.sort(Comparator.comparing(ProductVO::getCategory, Comparator.reverseOrder())
				.thenComparing(ProductVO::getCode));
		//ps.listProd(list,ProductVO.getCategory());
	}
}