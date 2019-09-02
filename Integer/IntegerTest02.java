package javase.Integer;

public class IntegerTest02 {
	public static void main(String[] args) {
		
		//int-->Integer
		//������������-->��������
		Integer i1 = new Integer(10);
		
		//Integer-->int
		//��������-->������������
		int i2 = i1.intValue();
		System.out.println(i2+1);	//11
		
		//�������ַ���תΪ����
		//static int parseInt(String s);
		int a1 = Integer.parseInt("20");
		System.out.println(a1+1);	//21
		
		//static double parseDouble(String s);
		double a2 = Double.parseDouble("1.0");
		System.out.println(a2+2.0);
		
		//��int���͵�ʮ����ת��2����
		String s1 = Integer.toBinaryString(10);	
		System.out.println(s1); //1010
		
		//��int���͵�ʮ����ת����16����
		String s2 = Integer.toHexString(10);
		System.out.println(s2); //a
		
		//��int���͵�ʮ����ת����8����
		String s3 = Integer.toOctalString(10);
		System.out.println(s3); //12
		
		//int-->Integer
		Integer a3 = Integer.valueOf(10);
		System.out.println(a3);
		Integer a4 = Integer.valueOf(10);
		System.out.println(a4);
		
	} 
}
