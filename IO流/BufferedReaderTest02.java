package javase.IO流;
import java.io.*;

public class BufferedReaderTest02 {
	public static void main(String[] args) throws Exception{
		/*
		FileInputStream fis = new FileInputStream("temp.txt");//文件字节输入流
		
		//转换流(将字节流转换为字符流)
		InputStreamReader isr = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(isr);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("temp.txt")));
		
		//开始读
		String temp = null;
		while((temp = br.readLine())!=null) {
			System.out.println(temp);
		}
		
		//关闭最外层流
		br.close();
	}
}	
