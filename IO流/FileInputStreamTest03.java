package javase.IO流;
import java.io.*;
//循环读取
public class FileInputStreamTest03 {
	public static void main(String[] args) throws IOException {
		
		//创建流
		FileInputStream fis = new FileInputStream("FileInputStreamTest02.java");
		
		//创建byte数组
		byte[] bytes =new byte[1024]; //每次读取1kb
		
		//while循环读取
		/*while(true) {
			int temp = fis.read(bytes);
			if(temp==1) {
				break;
			}
			//将byte数组中有效的数据转换成字符串
			System.out.println(new String(bytes,0,temp));
		}*/
		
		//while循环
		int temp = 0;
		while((temp = fis.read(bytes))!=-1) {
			System.out.println(new String(bytes,0,temp));
		}
		fis.close();
	}
}
