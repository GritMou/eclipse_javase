package javase.IO��;

import java.io.*;

//�ļ�����
public class FileInput_OutputStream {
	public static void main(String[] args) throws Exception {
		//����������
		FileInputStream fis = new FileInputStream("temp.txt");
		
		//���������
		FileOutputStream fos = new FileOutputStream("temp1.txt");
		
		//һ���һ��д
		byte[] bytes = new byte[1024]; //ÿ�ζ�ȡ1kb
		int temp = 0;
		while((temp = fis.read(bytes))!=-1) {
			fos.write(bytes,0,temp);
		}
		//ˢ��
		fos.flush();
		//�ر�
		fis.close();
		fos.close();
	}
}
