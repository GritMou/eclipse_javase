package javase.������;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * ���ն�
 * 
 */
public class UDP_Receive {
	public static void main(String[] args) throws Exception {
		
		DatagramSocket ds = new DatagramSocket(992);//��Ҫָ���ĸ��˿ڽ�������
		while(true) {
			byte[] buf =new byte[1024];
			int length = buf.length;
			DatagramPacket dp = new DatagramPacket(buf, length);
			
			ds.receive(dp);//�����ڴ˵ȴ�����
			
			String str = new String(dp.getData(),0,dp.getLength());
			InetAddress address = dp.getAddress();
			System.out.println(address+":"+str);
		}
	}
}
