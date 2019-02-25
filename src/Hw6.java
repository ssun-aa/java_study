import java.util.*;

public class Hw6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		System.out.println("히스토그램을 그립니다.");
		
		int []count = new int[26];
		char a ;
		for(int i = 0 ; i < text.length() ; i++) {
			if(text.charAt(i)>='a'&&text.charAt(i)<='z') {
				count[text.charAt(i)-'a']++;
			}
				
			else if(text.charAt(i)>='A'&&text.charAt(i)<='Z') {
				count[text.charAt(i)-'A']++;
			}
		}
		for(int i = 0 ; i < 26 ; i++) {
			a = 'A';
			a+=i;
			System.out.print(a);
			for(int j = 0 ; j < count[i] ; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

}
