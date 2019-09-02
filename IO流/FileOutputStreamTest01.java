package javase.IO��;

import java.io.*;

/*
 * 		java.io.OutputStream;
 * 			java.io.FileOutputStream; �ļ��ֽ������
 * 	���ڴ�д��Ӳ��
 * 
 */
public class FileOutputStreamTest01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//�����ļ��ֽ������
			//�ὫԴ�ļ�����
			//fos = new FileOutputStream("temp.txt");
			
			//��׷�ӷ�ʽ
			fos = new FileOutputStream("temp.txt",true);
			
			String msg = "HelloWorld!";
			//��StingתΪbyte����
			byte[] bytes = msg.getBytes();
			
			//ȫ��д��
			fos.write(bytes);
			
			//����д��
			fos.write(bytes,0,3);
			
			//��֤������ȫд��
			fos.flush();//ǿ��д��
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				try {
					fos.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
