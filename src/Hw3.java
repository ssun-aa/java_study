import java.util.*;

class Product{
	Scanner sc = new Scanner(System.in);

	int id;
	String def;
	String prod;
	int price;
	Product(int id){
		this.id=id-1;
		System.out.print("��ǰ ����>>");
		def=sc.nextLine();
		System.out.print("������>>");
		prod=sc.nextLine();
		System.out.print("����>>");
		price=sc.nextInt();
	}
	void show() {
		System.out.println("��ǰ ID>>"+id);
		System.out.println("��ǰ ����>>"+def);
		System.out.println("������>>"+prod);
		System.out.println("����>>"+price);
	}
	
}
class Book extends Product{
	Scanner sc = new Scanner(System.in);

	int ISBN;
	String writer;
	String title;
	
	Book(int id){
		super(id);
		System.out.print("å ����>>");
		title=sc.nextLine();
		System.out.print("����>>");
		writer=sc.next();
		System.out.print("ISBN ��ȣ>>");
		ISBN=sc.nextInt();
	}
	void show(){
		super.show();
		System.out.println("ISBN>>"+ISBN);
		System.out.println("å ����>>"+title);
		System.out.println("����>>"+writer);
		
	}
	
}
class CompactDisc extends Product{
	Scanner sc = new Scanner(System.in);

	String albem;
	String singer;
	CompactDisc(int id){
		super(id);
		System.out.print("�ٹ� ����>>");
		albem=sc.nextLine();
		System.out.print("����>>");
		singer=sc.next();
		
	}
	void show(){
		super.show();
		System.out.println("�ٹ� ����>>"+albem);
		System.out.println("����>>"+singer);
	}
	
}
class ConverstionBook extends Book{
	String launguage;
	
	ConverstionBook(int id){
		super(id);
		System.out.print("���>>");
		launguage=sc.next();
	}
	void show() {
		super.show();
		System.out.println("���>>"+launguage);

	}
}
public class Hw3 {

	public static void main(String[] args) {
		Product[] p = new Product[10];
		Scanner sc = new Scanner(System.in);
		int n, m, count=0;
		do{
		System.out.print("(1).��ǰ�߰�  (2).��� ��ǰ ��ȸ (3).������>>");
		n = sc.nextInt();
		switch(n) {
		case 1:
			count++;
			if(count>10) {
				System.out.println("�߰��� �� �����ϴ�.");
				break;
			}
			System.out.print("��ǰ ���� (1).å  (2).����CD (3).ȸȭå>>");
			m= sc.nextInt();
			if(m==1) {
				p[count-1] = new Book(count);
			}
			else if(m==2) {
				p[count-1] = new CompactDisc(count);
				
			}
			else {
				p[count-1] = new ConverstionBook(count); 
			}
			break;
		case 2:
			for(int i=0;i<count;i++) {
				p[i].show();
				System.out.println();
			}
			break;
			
		}
		
		}while(n!=3);
	}

}
