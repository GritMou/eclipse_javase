package javase.IO��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *  java.io.InputStream;
 * 		java.io.FileInputStream; �ļ��ֽ�������
 * 
 */
public class FileInputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			//��ȡĳ�ļ����ȴ�������������
			String filePath = "abc.txt";
			fis = new FileInputStream(filePath);
			
			//��ʼ��ȡ
			int i1 = fis.read(); //���ֽڵķ�ʽ��ȡ
			System.out.println(i1);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {  //��֤�����ͷ�
			if(fis!=null) {  //��ֹ��ָ���쳣
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
			
		}
	}
}
