package ch07.sec06.Package2;   // <-다른 패키지

import ch07.sec06.Package1.A;

public class D extends A{
	//생성자 선언                 // <-상속을 통해서 사용 가능
	public D() {
		//A() 생성자 호출
		super();   //o
	}
	
	//메소드 선언
	public void method1() {
		//A 필드값 변경
		this.field = "value";   //o
		//A 메소드 호출
		this.method();          //o
	}
	
	//메소드 선언                  // <-직접 객체 생성해서 사용하는 것은 안됨
	public void method2() {
		A a = new A();          //x
		a.field = "value";      //x
		a.method();             //x
	}
}
