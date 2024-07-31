package sub3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread {

	private Socket socket;
	
	public SendThread(Socket socket) {
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // System.in 키보드 입력스트림
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String msg = br.readLine();
				
				if(msg.equals("bye")) {
					break;
				}
				
				writer.println(msg);
				writer.flush();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
