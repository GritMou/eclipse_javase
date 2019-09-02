package javase.网络编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class SendThread extends Thread{
	
	private int port;
	public SendThread(int port) {
		this.port = port;
	}
	DatagramSocket ds = null;
	public void run() { 
		
		try {
			ds = new DatagramSocket();
			Scanner s = new Scanner(System.in);
			
			while(true) {
				String str = s.nextLine();
				if(str == "end") break;
				
				//发送数据的内容
				byte[] buf = s.next().getBytes();
				int length =buf.length;
				InetAddress address = InetAddress.getByName("127.0.0.1");
				//int port = 992;
				
				DatagramPacket dp = new DatagramPacket(buf, length, address, port);
				
				//发送
				ds.send(dp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ds.close();
		}
	}
}

