package sub1;

public class Account {

	String bank;
	String acc;
	String name;
	int balance;
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("---------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.acc);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("---------------------");
		
	}
}
