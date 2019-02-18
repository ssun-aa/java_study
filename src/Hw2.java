import java.util.*;
class player{
	public String name;
	public String word;
	
}
public class Hw2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int i, flag=0, count=0, n;
		String word="아버지", str;
		n = sc.nextInt();
		player [] p;
		p = new player[n];
		
		for(i=0;i<n;i++){
			p[i] = new player();
			System.out.print("참가자의 이름을 입력하세요>>");
			p[i].name=sc.next();
		}
		
		System.out.println("시작하는 단어는 아버지입니다.");
		
		while(true) {
			for(i=0;i<n;i++) {
				System.out.print(p[i].name+">>");
				str = sc.next();
				if(word.charAt(word.length()-1)!=str.charAt(0)) {
					flag=1;
					System.out.println(p[i].name+"이 졌습니다.");
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
