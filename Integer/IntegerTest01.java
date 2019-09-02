package javase.Integer;

public class IntegerTest01 {
	public static void main(String[] args) {
		
		//int类型的最大值和最小值
		System.out.println("int最大值为："+Integer.MAX_VALUE);
		System.out.println("int最小值为："+Integer.MIN_VALUE);
		
		//char类型的最大值和最小值
		System.out.println("char最大值为："+Character.MAX_VALUE);
		System.out.println("char最小值为："+Character.MAX_VALUE);
			
		//创建Integer类型的对象
		Integer i1 = new Integer(10);  		//int --> Integer
		Integer i2 = new Integer("123");	//String --> Integer
		System.out.println(i1);
		System.out.println(i2);
		
		//编译可以通过，但运行会异常，数字格式化异常
		//Integer i3 = new Integer("ABC"); // NumberFormatException
		//System.out.println(i3);
	}
}
