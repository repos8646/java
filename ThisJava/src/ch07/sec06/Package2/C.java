package ch07.sec06.Package2;

import ch07.sec06.Package1.A;

public class C {
	//메소드 선언
	public void method() {
		A a = new A();       //x
		a.field = "value";   //x
		a.method();          //x
		
		/* C클래스는 A클래스와 다른 패키지에 있기 때문에
		 * A의 protected 필드, 생성자, 메소드에 접근할 수 없다.
		 */
	}
}
