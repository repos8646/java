package sub8;
/*
 * 날짜 : 2024/07/11
 * 이름 : 김보경
 * 내용 : 인터페이스 실습하기
 * 
 * 인터페이스(Interface)
   	 - 표준화 클래스 설계에 사용되는 구조체
	 - 오직 추상 메서드만 선언
  	 - 인터페이스를 활용해서 다형성을 구현하고 객체간 결합도를 완화
  	 - 다중상속 효과
 */
class Computer{
	public void boot() {
		System.out.println("부팅...");
	}
}

interface Internet{
	public void access();
}

class Tv extends Computer implements Internet {
	public void show() {
		System.out.println("TV 시청...");
	}

	@Override
	public void access() {
		System.out.println("인터넷 접속...");
	}
}


public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스 실습1 - 표준화된 클래스 설계
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.soundUp();
		lg.powerOff();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chDown();
		samsung.soundDown();
		samsung.powerOff();
		
		
		// 인터페이스 실습2 - 다형성 예제
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);   //Cable이 Socket을 구현함
		
		socket.switchOn();
		socket.switchOff();
		
		// 인터페이스 실습3 - 다중 상속 효과 예제
		/* Child가 Parent 2가지에서 상속받는 경우
			- 1개는 상속, 1개는 구현으로 하는 것
			- 프로그래밍이 복잡해지기 때문에 권장하진 않음, 문법적으로만 가능하다는 정도
		*/
		
		Tv tv = new Tv();   //다형성 적용X, 해보면 각각 하나씩만 되어버림
		tv.boot();
		tv.access();
		tv.show();
	}
}
