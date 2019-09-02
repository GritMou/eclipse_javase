package javase.IO流;

import java.io.*;

/*文件字符输出流
 * 
 * 
 * 
 * 
 * 
 */
public class FileWriterTest01 {
	public static void main(String[] args) throws Exception {
		//创建文件字符输出流
		//覆盖
		//FileWriter fw = new FileWriter("temp1.txt");
		
		//追加
		FileWriter fw = new FileWriter("temp1.txt",true);
		
		//开始写
		fw.write("哈哈哈哈哈");
		
		//将char数字一部分写入
		char[] chars ={'我','是','中','国','人'};
		fw.write(chars,0,5);
		
		//刷新
		fw.flush();
		
		fw.close();
	}
}
