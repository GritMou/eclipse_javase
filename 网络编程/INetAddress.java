package javase.网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 获取Ip地址
 * 
 * 
 */
public class INetAddress {
	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("PC201710251810");
			System.out.println(ip);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}
}
