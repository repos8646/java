package sub3;

import java.io.Serializable;

public class Apple implements Serializable {
	
	private String Country;
	private int price;
	public Apple(String country, int price) {
		this.Country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Apple [Country=" + Country + ", price=" + price + "]";
	}

	public void show() {
		System.out.println("원산지 : " + Country);
		System.out.println("가격 : " + price);
	}
	
}
