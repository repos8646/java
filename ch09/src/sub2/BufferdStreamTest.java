package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2024/07/18
 * 이름 : 김보경
 * 내용 : 버퍼 보조 스트림 실습하기
 */
public class BufferdStreamTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip"; // 일반예외
		String target = "C:\\Users\\lotte4\\Desktop\\workspace2.zip";
		
		
		try {
			// 입력스트림 생성 및 파일연결 -> 보조스트림에 비하면 copy가 굉장히 느림
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			// 보조스트림 -> 용량이 큰 파일에 적합
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				
				// 파일 읽기
				int data = bis.read();
				
				if(data == -1) {
					// 더 이상 읽을 파일 내용이 없을 경우
					break;
				}
				
				// 파일 쓰기
				bos.write(data);
			}
			
			// 버퍼 비우기
			bos.flush();
			
			// 스트림 해제
			bis.close();
			bos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}