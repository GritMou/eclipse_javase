package javase.IO流;
import java.io.*;
public class BufferedWriterTest {
	public static void main(String[] args) throws Exception {
		
		//创建带有缓冲区的字符输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt",true));//追加
		
		//开始写
		bw.write("哈哈哈");
		
		//分行
		bw.newLine();
		
		bw.write("啦啦啦");
		
		//刷新
		bw.flush();
		
		bw.close();
	}
}
