package javase.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 	异常
 * 		1.文件不存在异常 FileNotFoundException
 * 		空指针异常	NullPointException
 * 		
 * 
 * 
 */
public class ExceptionTest {
	public static void main(String[] args) {
		
		//1.FileNotFoundEcxeption
		File f = new File("temp4.txt");
		
		//处理异常
		try {
			new FileInputStream(f);
			System.out.println("成功打开 "+f+" 文件");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("文件不存在！");
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
