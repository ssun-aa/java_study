
import java.util.*;
class Account{
	
	public String ano;
	public String name;
	public int money;
	
	public Account(int i) {
		int number=i;//생성된 계좌 갯수
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
      System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
      System.out.println("----------------------------------");
      System.out.print("선택>");
     
      n = sc.nextInt();
      String x = sc.nextLine();
      System.out.println("--------");
      switch(n) {
      case 1:
          a[i] = new Account(i);

          System.out.println("계좌생성");
          System.out.println("--------");
          System.out.print("계좌번호: ");
          
          a[i].ano = sc.nextLine();
          System.out.print("계좌주: ");
          a[i].name = sc.nextLine();
          System.out.print("초기입금액: ");
          a[i].money = sc.nextInt();
          
          System.out.println("결과: 계좌가 생성되었습니다.");
          i++;
          break;
          
      case 2:
    	  System.out.println("계좌목록");
    	  System.out.println("--------");
    	  
    	  for(int j=0;j<i;j++) {
              System.out.println(a[j].ano+"	"+a[j].name+"	"+a[j].money);
    	  }
    	  break;
      case 3:
    	  System.out.println("예금");
    	  System.out.println("--------");
    	  System.out.print("계좌번호:");
          String number = sc.nextLine();
    	  for(int j=0;j<i;j++) {
              if(number.equals(a[j].ano)) {
            	  System.out.print("예금액: ");
            	  int money=sc.nextInt();
            	  a[j].money+=money;
            	  System.out.println("결과: 예금이 성공되었습니다");
              }
    	  }
    	  break;
      case 4:
    	  System.out.println("출금");
    	  System.out.println("--------");
    	  System.out.print("계좌번호:");
          number = sc.nextLine();
    	  for(int j=0;j<i;j++) {
              if(number.equals(a[j].ano)) {
            	  System.out.print("출금액: ");
            	  int money=sc.nextInt();
            	  try {
					sub(a[j],money);
	            	System.out.println("결과: 출금이 성공되었습니다");
				} catch (AccountErrorException e) {
					e.printStackTrace();
					
				}
              }
    	  }
    	  break;
      default:
    	  System.out.println("프로그램 종료");
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