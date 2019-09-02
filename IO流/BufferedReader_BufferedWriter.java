package javase.IO��;
import java.io.*;
//�ļ�����
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
