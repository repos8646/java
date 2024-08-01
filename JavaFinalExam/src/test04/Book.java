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

	public void borrowBook() {
		
	}
	
	public void returnBook() {}
	
	public void getBookInfo() {
		System.out.println("도서명 : " + this.title);
		System.out.println("저자 : " + this.author);
		System.out.println("ISBN : " + this.isbn);
		System.out.println("대출여부 : " + this.isBorrowd);
	}
	

	
	

}
