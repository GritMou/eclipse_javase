package javase.IO��;

import java.util.Scanner;
import java.io.*;

/*
 * ���ܼ�������
 * 
 */
public class BufferedReaderTest03 {
	public static void main(String[] args) {
		//Scanner
		/*
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		System.out.println("��������"+str);
		*/
		
		//BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str= br.readLine();
			System.out.println("��������"+str);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
