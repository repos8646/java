package test4;
/*
 * 날짜 : 2024/07/19
 * 이름 : 김보경
 * 내용 : 자바 API 클래스 연습문제
 */
class Apple{
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override // 부모클래스가 없으니 Object의 메서드라는 것을 알아야 함
	public String toString() {
		return "Apple [country="+country+", price="+price + "]";
	}
}

class Banana{
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Banana [country="+country+", price="+price + "]";
	}
}

class Grape{
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Grape [country="+country+", price="+price + "]";
	}
}

public class Test05 {

	public static void main(String[] args) {
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("미국", 2000);
		Grape grape = new Grape("일본", 1000);
		
		showInfo(apple);
		showInfo(banana);
		showInfo(grape);
	}
	// 접근권한, 반환타입 // apple, banana, grape를 모두 부를 수 있는 상위클래스(부모클래스)가 없기 때문에 최상위 클래스 Object를 떠올릴 것
	public static void showInfo(Object fruit){ //업캐스팅
		// Object에 연결해서 instanceof를 생각
		if(fruit instanceof Apple) { //다운캐스팅
			Apple apple = (Apple) fruit; // toString이 생략되어 있음
			System.out.println(apple);
		}else if(fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			System.out.println(banana);
		}else if(fruit instanceof Grape) {
			Grape grape = (Grape) fruit;
			System.out.println(grape);
		}
	}
		
}

