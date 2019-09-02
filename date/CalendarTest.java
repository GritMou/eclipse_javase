package javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//获取日历
public class CalendarTest {
	public static void main(String[] args) throws ParseException {
		
		//获取日历
		Calendar c = Calendar.getInstance();
		int i = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(i);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));
		
		//2011,11,1是星期几
		String s = "2011,11,1";
		Date d = new SimpleDateFormat("2011,11,1").parse(s);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
}
