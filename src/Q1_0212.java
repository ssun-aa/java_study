import java.util.*;

public class Q1_0212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		for(int i=0;i<a.length();i++) {
			if((a.charAt(i)>='0') && (a.charAt(i)<='9'))
				System.out.print(a.charAt(i));
			
		}
	}

}
