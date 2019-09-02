package javase.exception;

import java.io.*;

public class Exception05 {
	//���벻ͨ��,IOExceptionδ����
	/*
	public static void main(String[] args) throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("abc");
		fis.read();
	}
	//����ͨ��
	/*
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream fis = new FileInputStream("abc");
		fis.read();
	}
	//����ͨ��
	*/
	/*
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("abc");
		fis.read();
	}
	*/
	public static void main(String[] args) throws IOException{
		try{
			FileInputStream fis = new FileInputStream("abc");
			fis.read();
			System.out.println("try");
			
		}catch(FileNotFoundException e) {
			System.out.println("�ļ������ڣ�");
			System.out.println(e);//java.io.FileNotFoundException: abc (ϵͳ�Ҳ���ָ�����ļ���)
			
		}catch(IOException e) {
			System.out.println("IO�쳣");
		}
		System.out.println("xxxxxx");
	}
}