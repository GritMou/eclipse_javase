package javase.exception;
/*
 * getMessage和printStackTrace方法的应用
 * 
 */
import java.io.*;
public class Exception06 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:/a");
			
		}catch(FileNotFoundException e){
			//打印异常堆栈信息
			//一般情况都会使用该方式调试程序
			e.printStackTrace();
		/*
			java.io.FileNotFoundException: c:\a (系统找不到指定的文件。)
			at java.base/java.io.FileInputStream.open0(Native Method)
			at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
			at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
			at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
			at javase.Exception.Exception06.main(Exception06.java:14)
		 */
			String msg = e.getMessage();
			System.out.println(msg);	//c:\a (系统找不到指定的文件。)
			
		}
		//这段代码会执行
		System.out.println("11111");
	}
}
	