package co.micol.mart.data;

import java.util.ArrayList;
import java.util.List;

import co.micol.mart.dto.ProductVO;

public class ProductData {
	public List<ProductVO> productVO = new ArrayList<ProductVO>();

	public ProductData() {


		// 1001~1010 과일/채소
		productVO.add(new ProductVO(1001, "과일/채소", "실속플러스사과", 11990, 19, 1, true));
		productVO.add(new ProductVO(1002, "과일/채소", "빨간대저토마토", 5900, 14, 6, true));
		productVO.add(new ProductVO(1003, "과일/채소", "상주햇곶감　　", 13900, 17, 3, true));
		productVO.add(new ProductVO(1004, "과일/채소", "씨없는청포도　", 5000, 12, 8, true));
		productVO.add(new ProductVO(1005, "과일/채소", "아이스홍시　　", 22500, 20, 0, true));
		productVO.add(new ProductVO(1006, "과일/채소", "국산블루베리　", 9900, 19, 1, true));
		productVO.add(new ProductVO(1007, "과일/채소", "유기농바나나　", 3900, 8, 12, true));
		productVO.add(new ProductVO(1008, "과일/채소", "간편대파　　　", 3990, 20, 0, true));
		productVO.add(new ProductVO(1009, "과일/채소", "깐마늘　　　　", 2900, 20, 0, true));
		productVO.add(new ProductVO(1010, "과일/채소", "호박고구마　　", 6990, 20, 0, true));

		// 1011~1020 냉장/냉동/밀키트
		productVO.add(new ProductVO(1011, "냉장/냉동/밀키트", "모듬떡볶이　", 9900, 20, 0, true));
		productVO.add(new ProductVO(1012, "냉장/냉동/밀키트", "즉석부대찌개", 6990, 20, 0, true));
		productVO.add(new ProductVO(1013, "냉장/냉동/밀키트", "냉동닭가슴살", 11490, 20, 0, true));
		productVO.add(new ProductVO(1014, "냉장/냉동/밀키트", "버거키트 　", 8990, 20, 0, true));
		productVO.add(new ProductVO(1015, "냉장/냉동/밀키트", "해물누룽지탕", 6990, 20, 0, true));
		productVO.add(new ProductVO(1016, "냉장/냉동/밀키트", "핫도그키트　", 8990, 20, 0, true));
		productVO.add(new ProductVO(1017, "냉장/냉동/밀키트", "닭갈비키트　", 10490, 20, 0, true));
		productVO.add(new ProductVO(1018, "냉장/냉동/밀키트", "대구매운탕　", 6990, 20, 0, true));
		productVO.add(new ProductVO(1019, "냉장/냉동/밀키트", "월드콘세트　", 4890, 20, 0, true));
		productVO.add(new ProductVO(1020, "냉장/냉동/밀키트", "아이스크림　", 6990, 20, 0, true));
		
		//1021~1030 유제품/음료
		productVO.add(new ProductVO(1021, "유제품/음료", "그릭요거트　", 2990, 20, 0, true));
		productVO.add(new ProductVO(1022, "유제품/음료", "저지방우유　", 5490, 19, 1, true));
		productVO.add(new ProductVO(1023, "유제품/음료", "플레인요거트", 4990, 20, 0, true));
		productVO.add(new ProductVO(1024, "유제품/음료", "슈레드치즈　", 9990, 20, 0, true));
		productVO.add(new ProductVO(1025, "유제품/음료", "크림치즈　　", 4990, 20, 0, true));
		productVO.add(new ProductVO(1026, "유제품/음료", "검은콩두유　", 14990, 20, 0, true));
		productVO.add(new ProductVO(1027, "유제품/음료", "오렌지주스　", 3990, 20, 0, true));
		productVO.add(new ProductVO(1028, "유제품/음료", "사과주스　　", 3990, 20, 0, true));
		productVO.add(new ProductVO(1029, "유제품/음료", "라떼　　　　", 2990, 20, 0, true));
		productVO.add(new ProductVO(1030, "유제품/음료", "아메리카노　", 1990, 18, 2, true));

		//1031~1040 과자/시리얼
		productVO.add(new ProductVO(1031, "과자/시리얼", "홈런볼초코　", 3200, 6, 14, true));
		productVO.add(new ProductVO(1032, "과자/시리얼", "콘푸로스트　", 4990, 14, 6, true));
		productVO.add(new ProductVO(1033, "과자/시리얼", "포카칩　　　", 6990, 20, 0, true));
		
	}

}
