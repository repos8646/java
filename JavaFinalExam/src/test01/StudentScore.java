package test01;

public class StudentScore {

	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	
	
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void updateScore(double) {
		
	}
	
	public void printStudentInfo() {
		System.out.println("학생이름 : " + this.studentName);
		System.out.println("학생 ID : " + this.studentId);
		System.out.println("과목 : " + this.subject);
		System.out.println("점수 : " + this.score);
	}

	
}
