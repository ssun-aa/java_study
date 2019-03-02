import java.io.*;
import java.util.*;

public class ByteExam1 {

	public static void main(String[] args) {
		try(
				DataInputStream in = new DataInputStream(new FileInputStream("word.txt"));
				){
			
			String st = in.readUTF();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
