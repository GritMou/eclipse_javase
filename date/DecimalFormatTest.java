package javase.date;

import java.text.DecimalFormat;
import java.text.Format;

/*	
 * 	���ָ�ʽ��
 * 	# ��������
 * 	��ǧ��λ
 * 	. С����
 * 	0 ������0
 */

public class DecimalFormatTest {
	public static void main(String[] args) {
		//�������ָ�ʽ������
		DecimalFormat d1 = new DecimalFormat("###,###.0000");
		
		//����ǧ��λ������4λС����������0
		System.out.println(d1.format(1234567.123));
	}
}
