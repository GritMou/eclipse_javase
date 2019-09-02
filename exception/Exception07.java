package javase.exception;
import java.io.*;
//finally语句
public class Exception07 {
	public static void main(String[] args) {
		
		//只有在执行finally语句块之前退出JVM，finally语句才不执行
		try {
			//退出JVM
			System.exit(0);
		}finally {
			//不执行
			System.out.println("finally");
		}
	}
}
