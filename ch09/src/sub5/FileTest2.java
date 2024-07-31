package sub5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileTest2 {
	public static void main(String[] args) {
		
		// Files 실습 (바탕화면에 source.txt 파일 만들어 놓을 것)
		Path source = Paths.get("C:\\Users\\lotte4\\Desktop\\source.txt");
		Path target = Paths.get("C:\\Users\\lotte4\\Desktop\\target.txt");
		Path destination = Paths.get("C:\\Users\\lotte4\\Desktop\\temp\\Destination.txt");
				
		try { // 전부 하나씩 실행해야 함. 동시에 실행 시 오류 발생
			// 복사
			Files.copy(source, target);
					
			// 이동 -> temp 파일 만들어 놓을 것
			Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
					
			// 삭제
			Files.delete(target);
					
		} catch (IOException e) {
					e.printStackTrace();
		}
			
		System.out.println("프로그램 종료...");
	}
}
