package javase.IO流;

import java.io.*;

//文件复制
public class FileInput_OutputStream {
	public static void main(String[] args) throws Exception {
		//创建输入流
		FileInputStream fis = new FileInputStream("temp.txt");
		
		//创建输出流
		FileOutputStream fos = new FileOutputStream("temp1.txt");
		
		//一遍度一边写
		byte[] bytes = new byte[1024]; //每次读取1kb
		int temp = 0;
		while((temp = fis.read(bytes))!=-1) {
			fos.write(bytes,0,temp);
		}
		//刷新
		fos.flush();
		//关闭
		fis.close();
		fos.close();
	}
}
