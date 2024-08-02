package test04;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}
	
	public String getTitle() {
		return title;
	}
	// 추가
	public boolean isBorrowed() {
		return isBorrowd;
	} 

	public void borrowBook() {
		if(!isBorrowd) {
			this.isBorrowd = true;
			System.out.println("도서대출 : " + this.title);
		}else {
			System.out.println(this.title + " 이미 대출됨");
		}
	}
	
	public void returnBook() {
		if(isBorrowd) {
			this.isBorrowd = false;
			System.out.println("도서반납 : " + this.title);
		}
	}
	
	public void getBookInfo() {
		System.out.println("도서명 : " + this.title);
		System.out.println("저자 : " + this.author);
		System.out.println("ISBN : " + this.isbn);
		System.out.println("대출여부 : " + (this.isBorrowd ? "불가능" : "가능"));
		
		
	}
	

	
	

}
