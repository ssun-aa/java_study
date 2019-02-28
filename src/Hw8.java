import java.util.*;
public class Hw8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vector = new Vector<Integer>();
		int max=0;
		
		for(int i = 0 ; i < 10 ; i ++) {
			vector.add(sc.nextInt());
			if(i==0)
				max = vector.elementAt(0);
			else {
				if(max < vector.elementAt(i))
					max = vector.elementAt(i);
			}	
		}
		System.out.println(max);
	}

}
