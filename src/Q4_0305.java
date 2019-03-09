import java.io.*;
import java.util.*;

public class Q4_0305 {

	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter pw = null;
		String word;
		
		try {
			in = new BufferedReader(new FileReader("data.txt"));
			pw = new PrintWriter(new FileWriter("answer.txt"));
			ArrayList<String> list = new ArrayList<String>();
			word = null;
			System.out.println("<오름차순 정렬 전>");
			while((word = in.readLine() )!= null) {
				list.add(word);
				System.out.println(word);
			}
			in.close();
			Collections.sort(list);
			Iterator<String> iter = list.iterator();
			System.out.println("<오름차순 정렬 후>");
			while(iter.hasNext()) {
				word = iter.next();
				System.out.println(word);
				pw.println(word);
			}
			pw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
