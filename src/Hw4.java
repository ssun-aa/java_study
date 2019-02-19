import java.util.*;

interface Stack{
	int MAX = 2;
	int length();
	Object pop();
	boolean push(Object ob);
	
}
class StringStack implements Stack{
	int count=0;
	Object ob;
	public int length() {
		count++;
		return count;
	}
	
	public Object pop() {
		count--;
		return ob;
	}
	public boolean push(Object ob) {
				
		if(length()>0) {
			this.ob=ob;
			return true;
		}
		else 
			return false;
	}
	
	
}
public class Hw4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringStack[] st = new StringStack[20];
		int i=0, n, count;
		while(true) {
			System.out.println("1.push 2.pop");
			n = sc.nextInt();
			sc.nextLine();
			switch(n) {
			case 1:
				
				if(i>=st[i].MAX) {
					System.out.println("�ִ밹���� �ʰ��Ͽ����ϴ�.");
					break;
				}
				
				st[i] = new StringStack();

				Object ob = sc.nextLine();
				
				if(st[i].push(ob)==true) {
					System.out.println("push ����");
					System.out.println(st[i].ob);
				}
				else
					System.out.println("push ����");
				i++;
				break;
			case 2:
				i--;
				if(i<0){
					System.out.println("pop�� object�� �����ϴ�");
					break;
				}
				Object obj= st[i].pop();
				System.out.println(obj);
				break;
			}
		}
		
	}

}
