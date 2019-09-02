package javase.IO流;

import java.util.Scanner;
import java.io.*;

/*
 * 接受键盘输入
 * 
 */
public class BufferedReaderTest03 {
	public static void main(String[] args) {
		//Scanner
		/*
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		System.out.println("您输入了"+str);
		*/
		
		//BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str= br.readLine();
			System.out.println("您输入了"+str);
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
