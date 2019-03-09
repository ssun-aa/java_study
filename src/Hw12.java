import java.util.*;

class Customer{
	String name;
	int number;
	
	public Customer(String name, int number){
		this.name = name;
		this.number = number;
	}
}

public class Hw12 {
	static Scanner sc = new Scanner(System.in);
	static String name;
	static int number, i, level;
	
	public static void reset(Customer []c) {
		int i;
		for(i = 0 ; i < 10 ; i++)
			c[i] = new Customer("---",i+1);//"---"로 초기화
		
	}
	public static void reservation(Customer [] c) {
		
		for(i = 0 ; i < 10 ; i++)
			System.out.print(c[i].name+" ");//예약 내역 출력
		System.out.println();
		
		System.out.print("이름 : ");
		sc.nextLine();
		name = sc.nextLine();
		
		do {
			System.out.print("번호 : ");
			number = sc.nextInt();
			if(number>=1 && number<=10) {//좌석이 유효한 경우
				if(!c[number-1].name.equals("---"))//예약자가 있을 경우;실패
					System.out.println("이미 예약된 자리 입니다. 다시 입력 해 주십시오.");
				else{
					c[number-1]= new Customer(name, number);//예약자가 없을 경우;성공
					break;
				}
			}
			else if(number<1 || number>10)//좌석이 유효하지 않은 경우;실패
				System.out.println("잘못된 번호 입니다. 다시 입력 해 주십시오.");
		}while(true);//성공 할 때까지 반복
				
	}
	public static void comfirm(Customer [] c) {
		for(i = 0 ; i < 10 ; i++)
			System.out.print(c[i].name+" ");
		System.out.println();
	}
	public static void cancle(Customer [] c) {
		int flag = 0;
		
		for(i = 0 ; i < 10 ; i++)
			System.out.print(c[i].name+" ");
		System.out.println();
		sc.nextLine();

		do {
			System.out.print("이름 : ");
			name = sc.nextLine();
			
			for(i = 0 ; i < 10 ; i++) {
				if(name.equals(c[i].name)) {//이름이 일치하면
					c[i].name = "---";//다시 이름 공백으로 바꾸고
					flag = 1;//성공 flag로 바꿈
				}
			}
			if(flag==1) {//일치한 이름이 있을 경우;성공
				System.out.println("취소에 성공하셨습니다.");
				break;
			}
			else
				System.out.println("일치하는 이름이 없습니다. 다시 입력해 주십시오.");
		}while(true);
	}
	public static void main(String[] args) {
		
		int scount = 0, acount = 0, bcount = 0;
		Customer [] s = new Customer[10];
		Customer [] a = new Customer[10];
		Customer [] b = new Customer[10];
		
		reset(s);
		reset(a);
		reset(b);
		
		while(true) {//4가 입력 될 때까지 무한 반복
			
			System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >>");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				do {
				System.out.print("좌석 구분 S(1), A(2), B(3) >>");
				level = sc.nextInt();
				
				if(level==1) {
					if(scount==10) {//s석 예약 수가 10명인 경우
						System.out.println("예약할 남은 좌석이 없습니다");
					}
					else {
						System.out.print("S>>");
						reservation(s);
						scount++;//예약 횟수 ++
						break;
					}
				}
				else if(level==2) {
					if(acount==10) {
						System.out.println("예약할 남은 좌석이 없습니다");
					}
					else {
						System.out.print("A>>");
						reservation(a);
						acount++;
						break;
					}
				}
				else if(level==3) {
					if(bcount==10) {
						System.out.println("예약할 남은 좌석이 없습니다");
					}
					else {
						System.out.print("B>>");
						reservation(b);
						bcount++;
						break;
					}
				}
				else// s석 a석 b석 외의 숫자를 입력 한 경우
					System.out.println("잘못된 좌석입니다. 다시 입력 해 주십시오");
				}while(true);
				
				break;
				
			case 2:
				System.out.print("S>>");
				comfirm(s);
				
				System.out.print("A>>");
				comfirm(a);
				
				System.out.print("B>>");
				comfirm(b);
				
				System.out.println("<<<조회를 완료하였습니다.>>>");
				
				break;
				
			case 3:
				do {
				System.out.print("좌석 구분 S(1), A(2), B(3) >>");
				level = sc.nextInt();
				if(level == 1) {
					if(scount==0) {//s석 예약 수가 0 인 경우
						System.out.println("취소할 좌석이 없습니다");
						break;
					}
					System.out.print("S>>");
					cancle(s);//취소 후
					scount--;//예약 수 --
					break;
				}
				else if(level == 2) {
					if(acount==0) {
						System.out.println("취소할 좌석이 없습니다");
						break;
					}
					System.out.print("A>>");
					cancle(a);
					acount--;
					break;
				}
				else if(level == 3) {
					if(bcount==0) {
						System.out.println("취소할 좌석이 없습니다");
						break;
					}
					System.out.print("B>>");
					cancle(b);
					bcount--;
					break;
				}
				else// s석 a석 b석 외의 숫자를 입력 한 경우
					System.out.println("잘못된 좌석입니다. 다시 입력 해 주십시오");
				}while(true);
			
				break;
				
			case 4:
				break;
				
			default:// 1,2,3,4 외의 메뉴가 입력 된 경우
				System.out.println("없는 메뉴입니다. 다시 입력 해 주십시오.");
				break;
			}
			
			if(n == 4)//4가 입력 된 경우 종료
				break;
			
		
		}
	}
}
