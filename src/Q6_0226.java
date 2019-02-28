import java.util.*;
public class Q6_0226 {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
	
		//list1.addAll(list2);//123456 합집합
		//list1.removeAll(list2);//12 차집합
		//list1.retainAll(list2);//34 교집합
		
		System.out.println(list1);
	}
}
