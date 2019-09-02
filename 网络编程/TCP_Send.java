package javase.ÍøÂç±à³Ì;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCP_Send {
	public static void main(String[] args) throws Exception {
		
		Socket s = new Socket("127.0.0.1",578);
	
		OutputStream output = s.getOutputStream();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String str = scanner.nextLine();
			if(str.equals("end")) break;
			
			output.write(str.getBytes());
		}
		
		
		s.close();
	}
}
