package javase.exception;
import java.io.*;
//finally���
public class Exception07 {
	public static void main(String[] args) {
		
		//ֻ����ִ��finally����֮ǰ�˳�JVM��finally���Ų�ִ��
		try {
			//�˳�JVM
			System.exit(0);
		}finally {
			//��ִ��
			System.out.println("finally");
		}
	}
}
