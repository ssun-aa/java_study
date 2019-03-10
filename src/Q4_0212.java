import java.util.*;

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int a[]);
}
public class Q4_0212 extends Calculator{
	
	double sum=0, average;
	
	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		
		return a-b;
	}
	
	@Override
	public double average(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		
		average=sum/(a.length);
		
		return average;
	}
	
	public static void main(String[] args) {
		Q4_0212 c = new Q4_0212();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int [] {2,3,4}));

	}

}
