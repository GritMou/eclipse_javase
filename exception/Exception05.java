package javase.exception;

import java.io.*;

public class Exception05 {
	//编译不通过,IOException未处理
	/*
	public static void main(String[] args) throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("abc");
		fis.read();
	}
	//编译通过
	/*
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream fis = new FileInputStream("abc");
		fis.read();
	}
	//编译通过
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
			System.out.println("文件不存在！");
			System.out.println(e);//java.io.FileNotFoundException: abc (系统找不到指定的文件。)
			
		}catch(IOException e) {
			System.out.println("IO异常");
		}
		System.out.println("xxxxxx");
	}
}