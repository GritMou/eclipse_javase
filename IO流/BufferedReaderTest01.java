package javase.IO流;
import java.io.*;
/*
 *  BufferedReader		带有缓冲区的字符输入流
	BufferedWriter		带有缓冲区的字符输出流
	BufferedInputStream	字节输入流
	BufferedOutputStream 字节输出流
 
 */
public class BufferedReaderTest01 {
	public static void main(String[] args) throws Exception {
		//创建一个带有缓冲区的字符输入流
		/*
		 * FileReader fr = new FileReader("temp.txt")
		 * 
		 * BufferedReader br = new BufferedReader(fr);将文件字符输入流包装
		 * 
		 * BufferedReader br 是包装流
		 */
		BufferedReader br = new BufferedReader(new FileReader("temp.txt"));
		
		//开始读
		String temp = null;
		while((temp=br.readLine())!= null) {
			System.out.println(temp);	
		}
		//关闭包装流
		br.close();
	}
}
		
