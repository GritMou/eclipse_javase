package javase.Integer;

public class IntegerTest01 {
	public static void main(String[] args) {
		
		//int���͵����ֵ����Сֵ
		System.out.println("int���ֵΪ��"+Integer.MAX_VALUE);
		System.out.println("int��СֵΪ��"+Integer.MIN_VALUE);
		
		//char���͵����ֵ����Сֵ
		System.out.println("char���ֵΪ��"+Character.MAX_VALUE);
		System.out.println("char��СֵΪ��"+Character.MAX_VALUE);
			
		//����Integer���͵Ķ���
		Integer i1 = new Integer(10);  		//int --> Integer
		Integer i2 = new Integer("123");	//String --> Integer
		System.out.println(i1);
		System.out.println(i2);
		
		//�������ͨ���������л��쳣�����ָ�ʽ���쳣
		//Integer i3 = new Integer("ABC"); // NumberFormatException
		//System.out.println(i3);
	}
}
