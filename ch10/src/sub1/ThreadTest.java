package sub1;
/*
 * 날짜 : 2024/07/22
 * 이름 : 김보경
 * 내용 : 스레드 실습하기
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		 SubThread sub1 = new SubThread("sub1");
		 SubThread sub2 = new SubThread("sub2");

		 //sub1.run(); // 단일 스레드 실행
		 //sub2.run();
		 
		 // 작업 스레드 시작
		 sub1.start(); // 실행 순서는 상태에 따라 달라질 수 있음
		 sub2.start(); // 병행 실행
		 
		 for(int i=0 ; i<10 ; i++) {
			 
			 System.out.println("Main Thread 실행...");
			 
			 try {
				Thread.sleep(1000); // 스레드 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 
		 System.out.println("Main Thread 종료...");
	}
}
