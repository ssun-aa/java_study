import java.util.*;
class player{
	public String name;
	public String word;
	
}
public class Hw2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int i, flag=0, count=0, n;
		String word="�ƹ���", str;
		n = sc.nextInt();
		player [] p;
		p = new player[n];
		
		for(i=0;i<n;i++){
			p[i] = new player();
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			p[i].name=sc.next();
		}
		
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		
		while(true) {
			for(i=0;i<n;i++) {
				System.out.print(p[i].name+">>");
				str = sc.next();
				if(word.charAt(word.length()-1)!=str.charAt(0)) {
					flag=1;
					System.out.println(p[i].name+"�� �����ϴ�.");
					break;
				}
				else
					word=str;
			}
			if(flag==1)
				break;
		}
	}
}
