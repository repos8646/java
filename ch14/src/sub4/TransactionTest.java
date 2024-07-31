package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 날짜 : 2024/07/30
 * 이름 : 김보경
 * 내용 : Transaction 실습하기
 */
public class TransactionTest {
	//final 상수로 고정, 상수는 대문자 표기가 관례, final static 같이 쓴다고 외우기
	private final static String HOST = "jdbc:mysql://127.0.0.1:3306/bank";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("에러를 발생 하시겠습니까?");
	
		int answer = scan.nextInt();
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 트랜잭션 시작 (false - 수동모드)
			conn.setAutoCommit(false);
			
			String sql1 = "UPDATE `bank_account` set `a_balance` = `a_balance` - 10000 where `a_no`=?";
			String sql2 = "UPDATE `bank_account` set `a_balance` = `a_balance` + 10000 where `a_no`=?";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-11-1003");
			
			psmt1.executeUpdate(); // SQL 실행
			
			if(answer == 1) {
				throw new Exception("에러가 발생했습니다.");
			}
			
			psmt2.executeUpdate(); // SQL 실행
			
			// 트랜잭션 커밋(=작업 성공 처리)
			conn.commit();
			
			// 종료
			psmt1.close();
			psmt2.close();
			conn.close();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		 
		
			try {
				// 트랜잭션 취소(작업 실패처리)
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		
		System.out.println("트랜잭션 완료...");
	}
}
