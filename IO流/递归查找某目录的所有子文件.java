package javase.IO流;
import java.io.*;
public class 递归查找某目录的所有子文件 {
	public static void main(String[] args) {
		
		File f = new File("C:\\XiTongZhiJia");
		
		//调用方法查找
		method(f);
	}
	
	static void method(File f) {
		if(f.isFile()) {
			return;
		}
		//1.f可能是目录
		File[] fs = f.listFiles();
		
		//2.f可能是文件
		for(File subF:fs) {
			
			System.out.println(subF.getAbsolutePath());
			method(subF);
		}
	}
}
