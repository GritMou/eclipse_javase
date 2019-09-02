package javase.IO流;

import java.io.*;

//文件复制，(纯文本)
public class FileReader_Writer {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("temp1.txt");
		FileWriter fw = new FileWriter("copytemp1.txt");
		
		char[] chars = new char[512];//1kb
		int temp = 0;
		while((temp=fr.read(chars))!=-1) {
			//写入
			fw.write(chars,0,temp);
		}
		
		fw.flush();
		fr.close();
		fw.close();
	}
}
