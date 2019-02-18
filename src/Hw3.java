import java.util.*;

class Product{
	Scanner sc = new Scanner(System.in);

	int id;
	String def;
	String prod;
	int price;
	Product(int id){
		this.id=id-1;
		System.out.print("상품 설명>>");
		def=sc.nextLine();
		System.out.print("생산자>>");
		prod=sc.nextLine();
		System.out.print("가격>>");
		price=sc.nextInt();
	}
	void show() {
		System.out.println("상품 ID>>"+id);
		System.out.println("상품 설명>>"+def);
		System.out.println("생산자>>"+prod);
		System.out.println("가격>>"+price);
	}
	
}
class Book extends Product{
	Scanner sc = new Scanner(System.in);

	int ISBN;
	String writer;
	String title;
	
	Book(int id){
		super(id);
		System.out.print("책 제목>>");
		title=sc.nextLine();
		System.out.print("저자>>");
		writer=sc.next();
		System.out.print("ISBN 번호>>");
		ISBN=sc.nextInt();
	}
	void show(){
		super.show();
		System.out.println("ISBN>>"+ISBN);
		System.out.println("책 제목>>"+title);
		System.out.println("저자>>"+writer);
		
	}
	
}
class CompactDisc extends Product{
	Scanner sc = new Scanner(System.in);

	String albem;
	String singer;
	CompactDisc(int id){
		super(id);
		System.out.print("앨범 제목>>");
		albem=sc.nextLine();
		System.out.print("가수>>");
		singer=sc.next();
		
	}
	void show(){
		super.show();
		System.out.println("앨범 제목>>"+albem);
		System.out.println("가수>>"+singer);
	}
	
}
class ConverstionBook extends Book{
	String launguage;
	
	ConverstionBook(int id){
		super(id);
		System.out.print("언어>>");
		launguage=sc.next();
	}
	void show() {
		super.show();
		System.out.println("언어>>"+launguage);

	}
}
public class Hw3 {

	public static void main(String[] args) {
		Product[] p = new Product[10];
		Scanner sc = new Scanner(System.in);
		int n, m, count=0;
		do{
		System.out.print("(1).상품추가  (2).모든 상품 조회 (3).끝내기>>");
		n = sc.nextInt();
		switch(n) {
		case 1:
			count++;
			if(count>10) {
				System.out.println("추가할 수 없습니다.");
				break;
			}
			System.out.print("상품 종류 (1).책  (2).음악CD (3).회화책>>");
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
