package test3;
/*
 * 날짜 : 2024/07/11
 * 이름 : 김보경
 * 내용 : 싱글톤 객체 연습문제
 */
class Vehicle {
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("============");
		System.out.println("차량명 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("------------");
	}
}

class CarFactory {
	// 싱글톤 객체
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	// 외부에 제공하기 위해서 getter 사용
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Vehicle createCar(String name, int price){
		return new Vehicle(name, price);
	}
}

public class Test05 {
	public static void main(String[] args) {
		
		// new CarFactory 안됨 -> getter 호출해서 가져와야 함
		CarFactory factory = CarFactory.getInstance();
		
		Vehicle avante = factory.createCar("아반테", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}
}
