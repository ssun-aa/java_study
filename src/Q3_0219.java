
import java.util.*;
class Account{
	
	public String ano;
	public String name;
	public int money;
	
	public Account(int i) {
		int number=i;//������ ���� ����
	}
}
public class Q3_0219 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      Account [] a;
      a = new Account[100];
      int i=0, n;
      do{
      System.out.println("----------------------------------");
      System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
      System.out.println("----------------------------------");
      System.out.print("����>");
     
      n = sc.nextInt();
      String x = sc.nextLine();
      System.out.println("--------");
      switch(n) {
      case 1:
          a[i] = new Account(i);

          System.out.println("���»���");
          System.out.println("--------");
          System.out.print("���¹�ȣ: ");
          
          a[i].ano = sc.nextLine();
          System.out.print("������: ");
          a[i].name = sc.nextLine();
          System.out.print("�ʱ��Աݾ�: ");
          a[i].money = sc.nextInt();
          
          System.out.println("���: ���°� �����Ǿ����ϴ�.");
          i++;
          break;
          
      case 2:
    	  System.out.println("���¸��");
    	  System.out.println("--------");
    	  
    	  for(int j=0;j<i;j++) {
              System.out.println(a[j].ano+"	"+a[j].name+"	"+a[j].money);
    	  }
    	  break;
      case 3:
    	  System.out.println("����");
    	  System.out.println("--------");
    	  System.out.print("���¹�ȣ:");
          String number = sc.nextLine();
    	  for(int j=0;j<i;j++) {
              if(number.equals(a[j].ano)) {
            	  System.out.print("���ݾ�: ");
            	  int money=sc.nextInt();
            	  a[j].money+=money;
            	  System.out.println("���: ������ �����Ǿ����ϴ�");
              }
    	  }
    	  break;
      case 4:
    	  System.out.println("���");
    	  System.out.println("--------");
    	  System.out.print("���¹�ȣ:");
          number = sc.nextLine();
    	  for(int j=0;j<i;j++) {
              if(number.equals(a[j].ano)) {
            	  System.out.print("��ݾ�: ");
            	  int money=sc.nextInt();
            	  try {
					sub(a[j],money);
	            	System.out.println("���: ����� �����Ǿ����ϴ�");
				} catch (AccountErrorException e) {
					e.printStackTrace();
					
				}
              }
    	  }
    	  break;
      default:
    	  System.out.println("���α׷� ����");
    	  break;
      }
      }while(n!=5);
   }
   
static void sub(Account a,int money) throws AccountErrorException{
	
	if(a.money<money) throw new AccountErrorException();
	a.money-=money;
}
}

class AccountErrorException extends Exception {}