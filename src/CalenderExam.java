import java.util.*;


public class CalenderExam {

	public static  String hundredDaysAfter() {
		
		Calendar cal = Calendar.getInstance();
	
//		String s = cal.get(Calendar.YEAR) + "��" + cal.get(Calendar.MONTH)+1 + "��" + cal.get(Calendar.DATE) + "��";
//		System.out.println(s);
//	
//		int years = cal.get(Calendar.YEAR);
//		int months = cal.get(Calendar.MONTH)+1;
//		int days = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
//		s = years + "��" + months + "��" + days + "��";
//		System.out.println(s);
		System.out.println(hour);
		return "";
		
	}
	public static void main(String[] args) {
	
		CalenderExam ce = new CalenderExam();
		ce.hundredDaysAfter();
	}
	
}
