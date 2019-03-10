import java.util.*;
public class Hw14 {
 
	static Vector words = new Vector();
	String[] data = {"사과", "배", "홍시", "키위", "바나나", "토마토", "귤", "수박", "딸기" };
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
				
				int value = (int)(Math.random()*data.length);//data 길이 내로 랜덤 인덱스 추첨
				words.add(data[value]);//data에 저장 된 단어들 중 랜덤으로 저장
				
				try{
					Thread.sleep(3*1000);//3초 쉼
				}catch(Exception e){}
			}
		}
	}
}