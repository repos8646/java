package sub5;

//문법적으로 부모 클래스를 상속받으면 자식 클래스에서 생성자를 한번 호출해야 함
public class Sedan extends Car{

	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); // 부모클래스 생성자 호출
		this.cc = cc;
	}
	
	@Override
	public void speedUp(int speed) {
		// Sedan에 맞게 speedUp 메서드 재정의
		
		this.speed += speed * cc;
		
	}
	
	public void show() {
		super.show(); //super -> 부모클래스를 의미
		System.out.println("배기량 : " + cc);
	}
	
	
}
