package javase.������;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 * ʹ��UPDЭ�鿪�����Ͷ�
 */
public class UDP_Send {
	public static void main(String[] args) throws Exception {
		
		DatagramSocket ds = new DatagramSocket();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			String str = s.nextLine();
			if(str == "end") break;
			
			//�������ݵ�����
			byte[] buf = s.nextLine().getBytes();
			int length =buf.length;
			InetAddress address = InetAddress.getByName("127.0.0.1");
			int port = 992;
			
			DatagramPacket dp = new DatagramPacket(buf, length, address, port);
			
			//����
			ds.send(dp);
			
			
		}
			//�ر�
			ds.close();
	}
}
