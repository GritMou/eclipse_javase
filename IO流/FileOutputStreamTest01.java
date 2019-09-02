package javase.IO流;

import java.io.*;

/*
 * 		java.io.OutputStream;
 * 			java.io.FileOutputStream; 文件字节输出流
 * 	将内存写入硬盘
 * 
 */
public class FileOutputStreamTest01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//创建文件字节输出流
			//会将源文件覆盖
			//fos = new FileOutputStream("temp.txt");
			
			//以追加方式
			fos = new FileOutputStream("temp.txt",true);
			
			String msg = "HelloWorld!";
			//将Sting转为byte数组
			byte[] bytes = msg.getBytes();
			
			//全部写入
			fos.write(bytes);
			
			//部分写入
			fos.write(bytes,0,3);
			
			//保证数据完全写入
			fos.flush();//强制写入
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				try {
					fos.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
