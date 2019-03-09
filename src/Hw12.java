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
			c[i] = new Customer("---",i+1);//"---"�� �ʱ�ȭ
		
	}
	public static void reservation(Customer [] c) {
		
		for(i = 0 ; i < 10 ; i++)
			System.out.print(c[i].name+" ");//���� ���� ���
		System.out.println();
		
		System.out.print("�̸� : ");
		sc.nextLine();
		name = sc.nextLine();
		
		do {
			System.out.print("��ȣ : ");
			number = sc.nextInt();
			if(number>=1 && number<=10) {//�¼��� ��ȿ�� ���
				if(!c[number-1].name.equals("---"))//�����ڰ� ���� ���;����
					System.out.println("�̹� ����� �ڸ� �Դϴ�. �ٽ� �Է� �� �ֽʽÿ�.");
				else{
					c[number-1]= new Customer(name, number);//�����ڰ� ���� ���;����
					break;
				}
			}
			else if(number<1 || number>10)//�¼��� ��ȿ���� ���� ���;����
				System.out.println("�߸��� ��ȣ �Դϴ�. �ٽ� �Է� �� �ֽʽÿ�.");
		}while(true);//���� �� ������ �ݺ�
				
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
			System.out.print("�̸� : ");
			name = sc.nextLine();
			
			for(i = 0 ; i < 10 ; i++) {
				if(name.equals(c[i].name)) {//�̸��� ��ġ�ϸ�
					c[i].name = "---";//�ٽ� �̸� �������� �ٲٰ�
					flag = 1;//���� flag�� �ٲ�
				}
			}
			if(flag==1) {//��ġ�� �̸��� ���� ���;����
				System.out.println("��ҿ� �����ϼ̽��ϴ�.");
				break;
			}
			else
				System.out.println("��ġ�ϴ� �̸��� �����ϴ�. �ٽ� �Է��� �ֽʽÿ�.");
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
		
		while(true) {//4�� �Է� �� ������ ���� �ݺ�
			
			System.out.print("����(1), ��ȸ(2), ���(3), ������(4) >>");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				do {
				System.out.print("�¼� ���� S(1), A(2), B(3) >>");
				level = sc.nextInt();
				
				if(level==1) {
					if(scount==10) {//s�� ���� ���� 10���� ���
						System.out.println("������ ���� �¼��� �����ϴ�");
					}
					else {
						System.out.print("S>>");
						reservation(s);
						scount++;//���� Ƚ�� ++
						break;
					}
				}
				else if(level==2) {
					if(acount==10) {
						System.out.println("������ ���� �¼��� �����ϴ�");
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
						System.out.println("������ ���� �¼��� �����ϴ�");
					}
					else {
						System.out.print("B>>");
						reservation(b);
						bcount++;
						break;
					}
				}
				else// s�� a�� b�� ���� ���ڸ� �Է� �� ���
					System.out.println("�߸��� �¼��Դϴ�. �ٽ� �Է� �� �ֽʽÿ�");
				}while(true);
				
				break;
				
			case 2:
				System.out.print("S>>");
				comfirm(s);
				
				System.out.print("A>>");
				comfirm(a);
				
				System.out.print("B>>");
				comfirm(b);
				
				System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
				
				break;
				
			case 3:
				do {
				System.out.print("�¼� ���� S(1), A(2), B(3) >>");
				level = sc.nextInt();
				if(level == 1) {
					if(scount==0) {//s�� ���� ���� 0 �� ���
						System.out.println("����� �¼��� �����ϴ�");
						break;
					}
					System.out.print("S>>");
					cancle(s);//��� ��
					scount--;//���� �� --
					break;
				}
				else if(level == 2) {
					if(acount==0) {
						System.out.println("����� �¼��� �����ϴ�");
						break;
					}
					System.out.print("A>>");
					cancle(a);
					acount--;
					break;
				}
				else if(level == 3) {
					if(bcount==0) {
						System.out.println("����� �¼��� �����ϴ�");
						break;
					}
					System.out.print("B>>");
					cancle(b);
					bcount--;
					break;
				}
				else// s�� a�� b�� ���� ���ڸ� �Է� �� ���
					System.out.println("�߸��� �¼��Դϴ�. �ٽ� �Է� �� �ֽʽÿ�");
				}while(true);
			
				break;
				
			case 4:
				break;
				
			default:// 1,2,3,4 ���� �޴��� �Է� �� ���
				System.out.println("���� �޴��Դϴ�. �ٽ� �Է� �� �ֽʽÿ�.");
				break;
			}
			
			if(n == 4)//4�� �Է� �� ��� ����
				break;
			
		
		}
	}
}
