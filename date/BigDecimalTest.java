package javase.date;
import java.math.BigDecimal;
//精确度高
public class BigDecimalTest {

	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal(10);
		BigDecimal b2 = new BigDecimal(10);
		
		//做加法运算
		//错误：v1+v2
		
		//引用类型需要调用方法做加法运算
		BigDecimal b3 =b1.add(b2);
		System.out.println(b3);
	}
}
