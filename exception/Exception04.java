package javase.exception;
import java.io.*;
/*
 * try...catch...��׽
 * �﷨��
 * 	try{
 * 		���ܳ����쳣�Ĵ��룻
 * 	}catch(�쳣����1 ����){
 * 		�����Ĵ��룻
 * 	}catch{
 * 		�����쳣�Ĵ��룻
 *  }...
 * 
 *  1��catch����д�������������ϵ��£���С���͵������ͽ��в�׽
 *  2��try...catch...�����ִ��1��catch����
 */
public class Exception04 {
	public static void main(String[] args) {
		
		try {
			
			//FileNotFoundException�쳣
			FileInputStream fis = new FileInputStream("c:/a.txt");
			
			//IOException�쳣
			fis.read();
			
		/* �����޷�ͨ��
		 * catch����д�������������ϵ��£���С����׽
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
