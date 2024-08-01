package test07;

public class Computer extends Product {
	
	private String manufactor;

	public Computer(String prodId, String prodName, int price, int quantity, String manufactor) {
		super(prodId, prodName, price, quantity);
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
		this.manufactor = manufactor;
	}

	public void printProductInfo() {
		
	}

	
	
}
