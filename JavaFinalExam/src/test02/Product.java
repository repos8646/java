package test02;

public class Product {

	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId, String productName, int price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void updatePrice(int price) {
		if(price > 0) {
			this.price = price;
			System.out.println("키보드 가격 수정 됨");
		}else {
			System.out.println("입력이 잘못되었습니다.");
		}
	
	}
	
	public void addStock(int stock) {
		if(stock > 0) {
			this.quantity += stock;
			System.out.println("키보드 " + quantity + "개 재고 추가 됨");
		}
	}
	
	public void printProductInfo() {
		System.out.println("상품 ID : " + this.productId);
		System.out.println("상품이름 : " + this.productName);
		System.out.println("상품가격 : " + this.price);
		System.out.println("재고수량 : " + this.quantity);
	}
	
}
