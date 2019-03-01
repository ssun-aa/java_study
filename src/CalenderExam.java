import java.util.*;


public class CalenderExam {

	public static  String hundredDaysAfter() {
		
		Calendar cal = Calendar.getInstance();
	
//		String s = cal.get(Calendar.YEAR) + "년" + cal.get(Calendar.MONTH)+1 + "월" + cal.get(Calendar.DATE) + "일";
//		System.out.println(s);
//	
//		int years = cal.get(Calendar.YEAR);
//		int months = cal.get(Calendar.MONTH)+1;
//		int days = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
//		s = years + "년" + months + "월" + days + "일";
//		System.out.println(s);
		System.out.println(hour);
		return "";
		
	}
	public static void main(String[] args) {
	
		CalenderExam ce = new CalenderExam();
		ce.hundredDaysAfter();
	}
	
}
