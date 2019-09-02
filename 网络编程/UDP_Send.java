package javase.网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 * 使用UPD协议开发发送端
 */
public class UDP_Send {
	public static void main(String[] args) throws Exception {
		
		DatagramSocket ds = new DatagramSocket();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			String str = s.nextLine();
			if(str == "end") break;
			
			//发送数据的内容
			byte[] buf = s.nextLine().getBytes();
			int length =buf.length;
			InetAddress address = InetAddress.getByName("127.0.0.1");
			int port = 992;
			
			DatagramPacket dp = new DatagramPacket(buf, length, address, port);
			
			//发送
			ds.send(dp);
			
			
		}
			//关闭
			ds.close();
	}
}
