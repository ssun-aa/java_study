import java.util.*;

public class Q2_0207 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		
		for(int i=0;i<a.length();i++) {
			int count=1;
			for(int j=i;j<a.length()-1;j++) {
				if(a.charAt(j)==a.charAt(j+1))
					count++;
				else 
					break;
			}
			
			String answ = String.valueOf(count);
			System.out.print(a.charAt(i)+answ);
			i+=count-1;
		}
	}

}
