package javase.IO��;
import java.io.*;
//ѭ����ȡ
public class FileInputStreamTest03 {
	public static void main(String[] args) throws IOException {
		
		//������
		FileInputStream fis = new FileInputStream("FileInputStreamTest02.java");
		
		//����byte����
		byte[] bytes =new byte[1024]; //ÿ�ζ�ȡ1kb
		
		//whileѭ����ȡ
		/*while(true) {
			int temp = fis.read(bytes);
			if(temp==1) {
				break;
			}
			//��byte��������Ч������ת�����ַ���
			System.out.println(new String(bytes,0,temp));
		}*/
		
		//whileѭ��
		int temp = 0;
		while((temp = fis.read(bytes))!=-1) {
			System.out.println(new String(bytes,0,temp));
		}
		fis.close();
	}
}
