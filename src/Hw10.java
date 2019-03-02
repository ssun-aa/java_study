import java.util.*;
import java.io.*;
class Words{
	
	final int max = 20000;
	String fileName = "word.txt";
	Random r = new Random();
	
	String getRandomWord() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(fileName));
			
		}catch(FileNotFoundException e){
			System.out.println("file not found error");
			System.exit(0);
		}
		int n = r.nextInt(max);
		return readWord(in , n);
	}
	
	String readWord(BufferedReader in, int n) {
		String word = null;
		try {
			while(n>0) {
				word = in.readLine();
				if(word == null)
					break;
				n--;
			}
		}catch(IOException e) {
			System.exit(0);
		}
		return word;
	}
}
class Hangman {

	final int Hidden = 2;
	StringBuffer hiddenword;
	String newWord;
	Scanner sc = new Scanner(System.in);
	int count;
	
	
	void run() {
		System.out.println("게임 시작");
		Words words = new Words();
		while(true) {
			newWord = words.getRandomWord();
			if(newWord == null)
				break;
			makehidden();
			start();
			System.out.println("NEXT(Y/N)");
			sc.nextLine();
			String answ = sc.nextLine();
			if(answ.equals("n")) {
			System.out.println("게임을 종료하셨습니다");
				break;
			}
		}
	}
	void makehidden() {
		
		hiddenword = new StringBuffer(newWord);
		Random r = new Random();
		
		for(int i = 0 ; i < Hidden ; i++) {
			int index = r.nextInt(newWord.length());
			char c = newWord.charAt(index);
			for(int j = 0 ; j < newWord.length() ; j++) {
				if(hiddenword.charAt(j)==c)
					hiddenword.setCharAt(j, '_');
			}
		}
	}
	void start() {
		count=0;
		char key;
		do {
			if(count == 5) {
				
				System.out.println("게임 종료되었습니다.");
				break;
			}
			System.out.println(hiddenword);
			System.out.println(">>");
			String text = sc.next();
			key = text.charAt(0);
		}while(!complete(key));
		System.out.println(newWord);
	}
	
	boolean complete(char key) {
		boolean flag = false;
		for(int i = 0 ; i < newWord.length(); i++) {
			if(hiddenword.charAt(i)=='_' && newWord.charAt(i)==key) {
				hiddenword.setCharAt(i, key);
				flag = true;
			}
		}
		if(!flag)
			count++;
		for(int i = 0 ; i < newWord.length() ; i++) {
			if(hiddenword.charAt(i)=='_')
				return false;
		}
		return true;
	}
}
public class Hw10{
	public static void main(String[] args) {
		
		Hangman hm = new Hangman();
		hm.run();
	}
}