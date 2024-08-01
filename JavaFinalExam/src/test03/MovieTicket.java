package test03;

public class MovieTicket {

	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}
	
	public void bookTicket() {
		
	
	}
	

	public void cancelBook() {
		
	}
	
	public void printTicketInfo() {
		System.out.println("영화제목 : " + this.movieTitle);
		System.out.println("상영시간 : " + this.screenTime);
		System.out.println("좌석번호 : " + this.seatNumber);
		System.out.println("예매여부 : " + this.isBooked);
	}
	
}
