package javase.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *  java.io.InputStream;
 * 		java.io.FileInputStream; 文件字节输入流
 * 
 */
public class FileInputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			//读取某文件，先创建“输入流”
			String filePath = "abc.txt";
			fis = new FileInputStream(filePath);
			
			//开始读取
			int i1 = fis.read(); //以字节的方式读取
			System.out.println(i1);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {  //保证流被释放
			if(fis!=null) {  //防止空指针异常
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
			
		}
	}
}
