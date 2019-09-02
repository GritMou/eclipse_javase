package javase.IO流;
import java.io.*;
/*int read(byte[] bytes);
 * 读取多个字节，存储到byte数组中
 * 
 * */
public class FileInputStreamTest02 {
	public static void main(String[] args) throws Exception {
		//创建输入流
		FileInputStream fis = new FileInputStream("");
		
		//byte数组
		byte[] bytes = new byte[3]; //一次最多读3个字节	
		
		int i1 = fis.read(bytes); //读取的字节数	
		
		System.out.println(i1);
		
	}
}
