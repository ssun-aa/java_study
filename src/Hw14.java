import java.util.*;
public class Hw14 {
 
	static Vector words = new Vector();
	String[] data = {"���", "��", "ȫ��", "Ű��", "�ٳ���", "�丶��", "��", "����", "����" };
	WordGenerator wg = new WordGenerator();
 
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Hw14 game = new Hw14();
		
		game.wg.start(); 
		
		while(true){
			System.out.println(words);
			System.out.print(">>");
			
			String input = s.nextLine(); 
   
			words.remove(input);			
		}
	}
	
	class WordGenerator extends Thread{
		public void run(){
			while(true){
				
				int value = (int)(Math.random()*data.length);//data ���� ���� ���� �ε��� ��÷
				words.add(data[value]);//data�� ���� �� �ܾ�� �� �������� ����
				
				try{
					Thread.sleep(3*1000);//3�� ��
				}catch(Exception e){}
			}
		}
	}
}