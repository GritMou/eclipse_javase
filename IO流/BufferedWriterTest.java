package javase.IO��;
import java.io.*;
public class BufferedWriterTest {
	public static void main(String[] args) throws Exception {
		
		//�������л��������ַ������
		BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt",true));//׷��
		
		//��ʼд
		bw.write("������");
		
		//����
		bw.newLine();
		
		bw.write("������");
		
		//ˢ��
		bw.flush();
		
		bw.close();
	}
}
