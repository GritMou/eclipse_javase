package javase.date;
import java.math.BigDecimal;
//��ȷ�ȸ�
public class BigDecimalTest {

	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal(10);
		BigDecimal b2 = new BigDecimal(10);
		
		//���ӷ�����
		//����v1+v2
		
		//����������Ҫ���÷������ӷ�����
		BigDecimal b3 =b1.add(b2);
		System.out.println(b3);
	}
}
