package javase.exception;
import java.io.*;
public class Exception09 {
	public static void main(String[] args) {
		//���������
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("Exception09.java");
		}catch(FileNotFoundException e) {
		}finally {
			
			//Ϊ�˱�֤��Դһ���ͷ�
			if(fis!=null) {
				try {
					fis.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
