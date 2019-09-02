package javase.exception;
import java.io.*;
//throws抛出
public class Exception03 {
	public static void main(String[] args) throws FileNotFoundException{
		try{
			m1();
		}catch(Exception e){
			System.out.println("m1");
		}
	}
	public static void m1() throws FileNotFoundException{
		m2();
	}
	public static void m2() throws FileNotFoundException{
		m3();	
	}
	public static void m3() throws FileNotFoundException{
		//FileInputStream构造方法声明位置上使用throws（向上抛）
		new FileInputStream ("c:/aa.txt");
	}	
}
