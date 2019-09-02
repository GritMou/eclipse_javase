package javase.网络编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * 接收端
 * 
 */
public class UDP_Receive {
	public static void main(String[] args) throws Exception {
		
		DatagramSocket ds = new DatagramSocket(992);//需要指定哪个端口接受数据
		while(true) {
			byte[] buf =new byte[1024];
			int length = buf.length;
			DatagramPacket dp = new DatagramPacket(buf, length);
			
			ds.receive(dp);//程序在此等待数据
			
			String str = new String(dp.getData(),0,dp.getLength());
			InetAddress address = dp.getAddress();
			System.out.println(address+":"+str);
		}
	}
}
