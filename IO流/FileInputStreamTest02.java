package javase.IO��;
import java.io.*;
/*int read(byte[] bytes);
 * ��ȡ����ֽڣ��洢��byte������
 * 
 * */
public class FileInputStreamTest02 {
	public static void main(String[] args) throws Exception {
		//����������
		FileInputStream fis = new FileInputStream("");
		
		//byte����
		byte[] bytes = new byte[3]; //һ������3���ֽ�	
		
		int i1 = fis.read(bytes); //��ȡ���ֽ���	
		
		System.out.println(i1);
		
	}
}
