package javase.Integer;

public class IntegerTest02 {
	public static void main(String[] args) {
		
		//int-->Integer
		//基本数据类型-->引用类型
		Integer i1 = new Integer(10);
		
		//Integer-->int
		//引用类型-->基本数据类型
		int i2 = i1.intValue();
		System.out.println(i2+1);	//11
		
		//将数字字符串转为数字
		//static int parseInt(String s);
		int a1 = Integer.parseInt("20");
		System.out.println(a1+1);	//21
		
		//static double parseDouble(String s);
		double a2 = Double.parseDouble("1.0");
		System.out.println(a2+2.0);
		
		//将int类型的十进制转成2进制
		String s1 = Integer.toBinaryString(10);	
		System.out.println(s1); //1010
		
		//将int类型的十进制转换成16进制
		String s2 = Integer.toHexString(10);
		System.out.println(s2); //a
		
		//将int类型的十进制转换成8进制
		String s3 = Integer.toOctalString(10);
		System.out.println(s3); //12
		
		//int-->Integer
		Integer a3 = Integer.valueOf(10);
		System.out.println(a3);
		Integer a4 = Integer.valueOf(10);
		System.out.println(a4);
		
	} 
}
