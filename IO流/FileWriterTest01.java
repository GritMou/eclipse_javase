package javase.IO��;

import java.io.*;

/*�ļ��ַ������
 * 
 * 
 * 
 * 
 * 
 */
public class FileWriterTest01 {
	public static void main(String[] args) throws Exception {
		//�����ļ��ַ������
		//����
		//FileWriter fw = new FileWriter("temp1.txt");
		
		//׷��
		FileWriter fw = new FileWriter("temp1.txt",true);
		
		//��ʼд
		fw.write("����������");
		
		//��char����һ����д��
		char[] chars ={'��','��','��','��','��'};
		fw.write(chars,0,5);
		
		//ˢ��
		fw.flush();
		
		fw.close();
	}
}
