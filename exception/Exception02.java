package javase.exception;
import java.io.*;
/*
  *处理异常的两种方式：
 * 	1，声明抛出 throws
 *  2，捕捉 	try...catch...
 * 
 * */
public class Exception02 {
	//public static void main(String[] args) throws FileNotFoundException {
	//public static void main(String[] args) throws IOException {
	public static void main(String[] args) throws Exception {
		//编译异常
		FileInputStream fis = new FileInputStream("c:/a.txt");
	}
}
