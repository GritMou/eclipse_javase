package javase.exception;
/*
 * getMessage��printStackTrace������Ӧ��
 * 
 */
import java.io.*;
public class Exception06 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:/a");
			
		}catch(FileNotFoundException e){
			//��ӡ�쳣��ջ��Ϣ
			//һ���������ʹ�ø÷�ʽ���Գ���
			e.printStackTrace();
		/*
			java.io.FileNotFoundException: c:\a (ϵͳ�Ҳ���ָ�����ļ���)
			at java.base/java.io.FileInputStream.open0(Native Method)
			at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
			at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
			at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
			at javase.Exception.Exception06.main(Exception06.java:14)
		 */
			String msg = e.getMessage();
			System.out.println(msg);	//c:\a (ϵͳ�Ҳ���ָ�����ļ���)
			
		}
		//��δ����ִ��
		System.out.println("11111");
	}
}
	