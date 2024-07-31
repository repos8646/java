package ch07.sec10.Exam01;

public class SmartPhone extends Phone {
	//생성자 선언
	SmartPhone(String owner){
		//Phone 호출
		super(owner);
	}
	
	//메소드 선언
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
