package test04;

public class Member {
	
	private String name;
	private String memberId;
	private Book borrowedBook;
	
	public Member(String name, String memberId) {
		super();
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	
	public void borrowBook(Book book) {
		if(this.borrowedBook == null && !book.isBorrowed()) {
			book.borrowBook();
			this.borrowedBook = book;
		}else if(this.borrowedBook != null) {
			System.out.println("이것이 자바다 이미 대출됨");
		}else {
			System.out.println("도서 대출 불가");
		}
	}
	
	public void returnBook(Book book) {
		if(this.borrowedBook != null) {
			this.borrowedBook.returnBook();
			this.borrowedBook = null;
		}else {
			System.out.println("대출한 도서가 없습니다.");
		}
	}
	
	public void getMemberInfo() {
		System.out.println("회원명 : " + this.name);
		System.out.println("아이디 : " + this.memberId);
		System.out.println("대출한 도서 : " + (this.borrowedBook != null ? this.borrowedBook.getTitle() : "없음"));
	}
	
	
}
