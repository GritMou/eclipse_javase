package javase.IO��;
import java.io.*;
/*
 *  BufferedReader		���л��������ַ�������
	BufferedWriter		���л��������ַ������
	BufferedInputStream	�ֽ�������
	BufferedOutputStream �ֽ������
 
 */
public class BufferedReaderTest01 {
	public static void main(String[] args) throws Exception {
		//����һ�����л��������ַ�������
		/*
		 * FileReader fr = new FileReader("temp.txt")
		 * 
		 * BufferedReader br = new BufferedReader(fr);���ļ��ַ���������װ
		 * 
		 * BufferedReader br �ǰ�װ��
		 */
		BufferedReader br = new BufferedReader(new FileReader("temp.txt"));
		
		//��ʼ��
		String temp = null;
		while((temp=br.readLine())!= null) {
			System.out.println(temp);	
		}
		//�رհ�װ��
		br.close();
	}
}
		
