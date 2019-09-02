package javase.������;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveThread extends Thread{
	private int port;
	public ReceiveThread(int port) {
		this.port = port;
	}
	public void run() {
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(port);
			while(true) {
			byte[] buf =new byte[1024];
			int length = buf.length;
			DatagramPacket dp = new DatagramPacket(buf, length);
			
			ds.receive(dp);//�����ڴ˵ȴ�����
			
			String str = new String(dp.getData(),0,dp.getLength());
			InetAddress address = dp.getAddress();
			System.out.println(address+":"+str);
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			ds.close();
		}
		
	}
}
