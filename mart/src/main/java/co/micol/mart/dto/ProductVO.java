package co.micol.mart.dto;

import java.text.DecimalFormat;

import co.micol.mart.util.Listform;

public class ProductVO implements Comparable<ProductVO> {
	int code;
	String category;
	String prodName;
	int price;// 단가
	int stock;// 재고
	int salesVolume;// 판매량
	boolean condition;// 판매상황:품절,판매가능..

	public ProductVO(int code, String category, String prodName, int price, int stock, int salesVolume,
			Boolean condition) {
		super();
		this.code = code;
		this.category = category;
		this.prodName = prodName;
		this.price = price;
		this.stock = stock;
		this.salesVolume = salesVolume;
		this.condition = condition;
	}

	public ProductVO() {
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
	}

	public boolean getCondition() {
		return condition;
	}

	public void setCondition(Boolean condition) {
		this.condition = condition;
	}

	public void productInfoList() {
		System.out.println(code + " " + category + " " + prodName + " " + price + stock + salesVolume + " "
				+ (condition ? "판매중2" : "품절"));
	}

	public void productInfo() {
		DecimalFormat df = new DecimalFormat("#,###");
		Listform.menuforCustomer();

		System.out.printf("%6s %12s %12s %10s  %8s", code, category, prodName, df.format(price), stock + "\n");

		System.out.println("===========================================================================");

	}

	@Override
	public String toString() {
		return " " + code + "  " + category + "  " + prodName + "  " + price + "  " + stock + "   " + salesVolume + "  "
				+ (condition ? "판매중1" : "품절") + "\n";
	}

	@Override
	public int compareTo(ProductVO o) {
		return this.code - o.code;
	}

}
