package javase.date;
//��ȡʱ��
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
public class SimpleDateFormatTest {
	public static void main (String[] args) {
		//java.util.Date;--String
		
		//��ʽ��y��  M��  d��  HСʱ  m��  s��  S����
		
		//�������ڸ�ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss SSS");
		System.out.println(sdf.format(new Date()));
		
		//��ȡ��ǰϵͳǰʮ����ʱ��
		Date d = new Date(System.currentTimeMillis()-1000*60*10);
		System.out.println(sdf.format(d));
	}	
}
