package ch13.sec03.exam01;

public class Box <T> {
	//필드
	private T t;
	
	//Getter 메소드
	public T getT() {
		return t;
	}
	
	//Setter 메소드
	public void setT(T t) {
		this.t = t;
	}
}
