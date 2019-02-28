import java.util.*;

class Student implements Comparable<Student>{
	
	String name;
	int kor, eng, math;
	String total;
	
	Student(String name, int kor, int eng, int math, String total){
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
	}
	
	public String getTotal() {
		
		return total; 
	}
	
	public String getName() {
		
		return name;
	}
	@Override
	public int compareTo(Student student) {
		
		return total.compareTo(student.getTotal());
	}
}

public class Q5_0226 {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> array1 = new ArrayList<Student>();

		Student st1 = new Student("Kim", 60,30,50,"140");
		Student st2 = new Student("lee", 80,90,80,"250");
		Student st3 = new Student("park", 30,80,20,"130");
		
		array1.add(st1);
		array1.add(st2);
		array1.add(st3);
	    
		Collections.sort(array1);
		
	    for (int i=0; i<array1.size(); i++) {
	    	
	    	System.out.println(array1.get(i).getName());
	    	
	    }
	}
}
