package sub1;

public class Apple {
	
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

	
	
}
