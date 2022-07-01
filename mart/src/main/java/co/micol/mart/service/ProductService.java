package co.micol.mart.service;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import co.micol.mart.data.ProductData;
import co.micol.mart.dto.ProductVO;
import co.micol.mart.menu.AdminLoginMenu;
import co.micol.mart.util.Listform;

public class ProductService /* extends ProductData */ {
	ProductData pd = new ProductData();
	Scanner sc = new Scanner(System.in);
	boolean run = true;

	public void menu() {

		while (run) {
			System.out.println("==========================================================================================");
			System.out.println("     1.상품리스트　    2.상품등록　　   3.상품정보수정     4.상품정보삭제     5.뒤로가기　　");
			System.out.println("==========================================================================================");
			System.out.println("메뉴를 선택하세요 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
//				System.out.println("==================== 관리자모드 >> 상품관리 >> 상품리스트 ====================");
				listProd(pd.productVO);
				break;
			case 2:
//				System.out.println("==================== 관리자모드 >> 상품관리 >> 상품등록 =====================");
				insertProd();
				break;
			case 3:
//				System.out.println("==================== 관리자모드 >> 상품관리 >> 상품수정 =====================");
				System.out.print("수정할 상품의 코드를 입력하세요 >> ");
				int updateCode = Integer.parseInt(sc.nextLine());
				updateProd(updateCode);
				break;
			case 4:
				System.out.print("삭제할 상품의 코드를 입력하세요 >> ");
				int deleteCode = Integer.parseInt(sc.nextLine());
				deleteProd(deleteCode);
				break;
			case 5:
				AdminLoginMenu am = new AdminLoginMenu();
				am.loginSuccess("admin");
				break;
			}
		}
	}

	private void deleteProd(int deleteCode) {
		try {
			for (ProductVO vo : pd.productVO) {
				if (vo.getCode() == deleteCode) {
					vo.productInfoList();
					System.out.println("해당상품을 삭제하시겠습니까?");
					System.out.println(" 1.네   2.아니요");
					if (Integer.parseInt(sc.nextLine()) == 1) {
						Iterator<ProductVO> iter = pd.productVO.iterator();
						while (iter.hasNext()) {
							ProductVO root = iter.next();
							if (root.equals(vo)) {
								iter.remove();
								break;
							}
						} // vo.remove()
						System.out.println("삭제완료");
					} else {
						System.out.println("삭제를 취소합니당");
						break;
					}
				}
			}
		} catch (Exception e) {

		}
	}

	private void updateProd(int updateCode) {
		for (ProductVO vo : pd.productVO) {
			if (vo.getCode() == updateCode) {
			//	vo.productInfoList();
				vo.productInfo();
				System.out.println("해당상품을 수정하시겠습니까?");
				System.out.println(" 1.네   2.아니요");
				int menu = Integer.parseInt(sc.nextLine());
				if (menu == 1) {
					System.out.print("새로운 카테고리>> ");
					String updateCate = sc.nextLine();
					System.out.print("새로운 상품명>> ");
					String updateName = sc.nextLine();
					System.out.print("새로운 상품가격>> ");
					int updatePrice = Integer.parseInt(sc.nextLine());
					System.out.print("새로운 상품재고>> ");
					int updateStock = Integer.parseInt(sc.nextLine());
					System.out.println("해당정보로 수정하시겠습니까?");
					System.out.println(" 1.네   2.아니요");
					int update = Integer.parseInt(sc.nextLine());
					if (update == 1) {
						vo.setCategory(updateCate);
						vo.setProdName(updateName);
						vo.setPrice(updatePrice);
						vo.setStock(updateStock);
						System.out.println("수정완료!");
						// ListProd(productVO);
					} else {
						break;
					}
				} else {
					break;
				}
			}
		}
	}

	public void insertProd() {
		ProductVO vo = new ProductVO();
	

		System.out.print("상품코드는 자동으로 입력됩니다 >> ");
		System.out.println(pd.productVO.size() + 1001);

		int code = (pd.productVO.size()) + 1001;

		System.out.print("상품카테고리를 입력하세요 >> ");
		String prodCategory = sc.nextLine();
		System.out.print("상품명을 입력하세요 >> ");
		String prodName = sc.nextLine();
		System.out.print("상품가격을 입력하세요 >> ");
		int prodPrice = Integer.parseInt(sc.nextLine());
		System.out.print("상품수량을 입력하세요 >> ");
		int prodStock = Integer.parseInt(sc.nextLine());
		vo = new ProductVO(code, prodCategory, prodName, prodPrice, prodStock, 0, true);
		pd.productVO.add(vo);

	}

	public void listProd(List<ProductVO> list) {
		DecimalFormat df = new DecimalFormat("0");
		df = new DecimalFormat("#,###");
		String[] str = new String[7];
		int line = 0;
		int page = 1;

		try {
			Listform.menuforAdmin();
			for (int i = 0; i < list.size(); i++) {
				str[0] = Integer.toString(list.get(i).getCode());
				str[1] = list.get(i).getCategory();
				str[2] = list.get(i).getProdName();
				str[3] = Integer.toString(list.get(i).getPrice());
				str[4] = Integer.toString(list.get(i).getStock());
				str[5] = Integer.toString(list.get(i).getSalesVolume());
				str[6] = (list.get(i).getCondition()) ? "판매중" : "품절";

				line++;
				String str3 = df.format(list.get(i).getPrice());

				System.out.printf("%6s %12s %12s %10s %5s %5s %8s", str[0], str[1], str[2], str3, str[4], str[5],
						str[6] + "\n");
				if (line % 10 == 0) {
					System.out.println("==========================================================================================");
					System.out.println();
					System.out.printf("%45s", "<< " + page + " >> \n");
					System.out.printf("%45s", "<.이전페이지    1.돌아가기    >.다음페이지");
					System.out.println();
					String sign = sc.nextLine();
					Listform.menuforAdmin();
					if (sign.equals(">")) {
						page++;
						continue;
					} else if (sign.equals("<")) {
						page--;
						i -= 20;
						line -= 20;
					}else if (sign.equals("1")) {
						menu();
					}
				} else if (line == list.size()) {
					System.out.println();
					System.out.printf("%45s", "<< " + page + " >> \n");
					System.out.printf("%45s", "<.이전페이지    1.돌아가기    >.다음페이지");
					System.out.println();
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
		} catch (IndexOutOfBoundsException e) {
			System.out.println("이전 페이지가 없습니다.");
			System.out.println("목록으로 돌아갑니다.");
			sc.nextLine();
		}
		System.out.println();
	}

}