package javase.date;

import java.text.DecimalFormat;
import java.text.Format;

/*	
 * 	数字格式化
 * 	# 任意数字
 * 	，千分位
 * 	. 小数点
 * 	0 不够补0
 */

public class DecimalFormatTest {
	public static void main(String[] args) {
		//创建数字格式化对象
		DecimalFormat d1 = new DecimalFormat("###,###.0000");
		
		//加入千分位，保留4位小数，不够补0
		System.out.println(d1.format(1234567.123));
	}
}
