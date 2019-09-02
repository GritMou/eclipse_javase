package javase.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 	�쳣
 * 		1.�ļ��������쳣 FileNotFoundException
 * 		��ָ���쳣	NullPointException
 * 		
 * 
 * 
 */
public class ExceptionTest {
	public static void main(String[] args) {
		
		//1.FileNotFoundEcxeption
		File f = new File("temp4.txt");
		
		//�����쳣
		try {
			new FileInputStream(f);
			System.out.println("�ɹ��� "+f+" �ļ�");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("�ļ������ڣ�");
		}
		
		System.out.println(m1());
		
	}
	public static int m1() {
		try {
			return 1;
		}catch(Exception e)	{
			return 2;
		}finally {
			return 3;
		}
	}
}
