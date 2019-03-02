import java.time.LocalDateTime;
import java.util.*;

public class Hw9 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		if(cal.get(Calendar.HOUR_OF_DAY)>=4 && cal.get(Calendar.HOUR_OF_DAY)<12) {
			System.out.println("Good Morning");
		}
		else if(cal.get(Calendar.HOUR_OF_DAY)<18) {
			System.out.println("Good Afternoon");
		}
		else
			System.out.println("Good Night");
		
		LocalDateTime timePoint = LocalDateTime.now();

		StringBuffer sb = new StringBuffer();
		Formatter f = new Formatter(sb);
		
		int year = timePoint.getYear();
		int month = timePoint.getMonthValue();
		int day = timePoint.getDayOfMonth();
		int hour = timePoint.getHour();
		int minute = timePoint.getMinute();
		
		f.format("%d/%d/%d %d:%d",year, month, day, hour, minute);
		
		System.out.println(f);
		
		f.close();
	}
}
