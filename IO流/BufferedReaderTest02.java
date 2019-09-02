package javase.IO��;
import java.io.*;

public class BufferedReaderTest02 {
	public static void main(String[] args) throws Exception{
		/*
		FileInputStream fis = new FileInputStream("temp.txt");//�ļ��ֽ�������
		
		//ת����(���ֽ���ת��Ϊ�ַ���)
		InputStreamReader isr = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(isr);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("temp.txt")));
		
		//��ʼ��
		String temp = null;
		while((temp = br.readLine())!=null) {
			System.out.println(temp);
		}
		
		//�ر��������
		br.close();
	}
}	
