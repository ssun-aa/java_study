import java.text.SimpleDateFormat;
import java.util.*;

public class Q3_0305{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		
		cal1.set(2019, 3, 9);
		
		long today = System.currentTimeMillis();
		long then = cal1.getTimeInMillis();
		
		long sum = then-today;
		sum = sum / 1000;
		sum = sum/60/60/24;

		if(then > today )
			System.out.println("�������� ���÷κ���" + sum + "�� �������ϴ�");
		else if(then < today)
			System.out.println("������ �����Ϸκ���" + sum + "�� ���ҽ��ϴ�");
		else
			System.out.println("�������� ���ð� �����ϴ�.");
		
				
	}
}