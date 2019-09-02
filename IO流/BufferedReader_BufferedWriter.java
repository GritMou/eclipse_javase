package javase.IO流;
import java.io.*;
//文件复制
public class BufferedReader_BufferedWriter {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("temp.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("tempCopy.txt"));
		
		String temp = null;
		while((temp= br.readLine())!=null) {
			bw.write(temp);
			bw.newLine();
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
