package javase.IO��;
import java.io.*;
public class �ݹ����ĳĿ¼���������ļ� {
	public static void main(String[] args) {
		
		File f = new File("C:\\XiTongZhiJia");
		
		//���÷�������
		method(f);
	}
	
	static void method(File f) {
		if(f.isFile()) {
			return;
		}
		//1.f������Ŀ¼
		File[] fs = f.listFiles();
		
		//2.f�������ļ�
		for(File subF:fs) {
			
			System.out.println(subF.getAbsolutePath());
			method(subF);
		}
	}
}
