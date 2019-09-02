package javase.exception;
import java.io.*;
public class Exception09 {
	public static void main(String[] args) {
		//在外边声明
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("Exception09.java");
		}catch(FileNotFoundException e) {
		}finally {
			
			//为了保证资源一定释放
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
