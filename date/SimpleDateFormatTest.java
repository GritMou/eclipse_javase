package javase.date;
//获取时间
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
public class SimpleDateFormatTest {
	public static void main (String[] args) {
		//java.util.Date;--String
		
		//格式：y年  M月  d日  H小时  m分  s秒  S毫秒
		
		//创建日期格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
		System.out.println(sdf.format(new Date()));
		
		//获取当前系统前十分钟时间
		Date d = new Date(System.currentTimeMillis()-1000*60*10);
		System.out.println(sdf.format(d));
	}	
}
