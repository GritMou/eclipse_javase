package javase.ÍøÂç±à³Ì;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Receive {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(578);
		
		Socket client = ss.accept();
		
		InputStream input = client.getInputStream();
		
		byte[] buf = new byte[1024];
		int length = -1;
		while((length = input.read(buf))!=-1) {
			
			System.out.println(new String(buf,0,length));
		}
		
		//String s = new String(buf,0,length);
		
		
 		client.close();
		ss.close();
	}
}
