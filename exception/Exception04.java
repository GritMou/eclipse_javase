package javase.exception;
import java.io.*;
/*
 * try...catch...捕捉
 * 语法：
 * 	try{
 * 		可能出现异常的代码；
 * 	}catch(异常类型1 变量){
 * 		处理常的代码；
 * 	}catch{
 * 		处理异常的代码；
 *  }...
 * 
 *  1，catch可以写多个，但必须从上到下，从小类型到大类型进行捕捉
 *  2，try...catch...中最多执行1个catch语句块
 */
public class Exception04 {
	public static void main(String[] args) {
		
		try {
			
			//FileNotFoundException异常
			FileInputStream fis = new FileInputStream("c:/a.txt");
			
			//IOException异常
			fis.read();
			
		/* 编译无法通过
		 * catch可以写多个，但必须从上到下，从小到大捕捉
		}catch(IOException e) {	
		
		}catch(FileNotFoundException e) {	
		
		}
		*/
			
		}catch(FileNotFoundException e) {
			System.out.println();
			
		}catch(IOException e) {
			
		}

	}
}
