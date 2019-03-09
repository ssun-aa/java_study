import java.util.*;
import java.io.*;

public class Hw11 {
	public static void main(String[] args) {
		
		File file1 = new File("a.jpg");
		File file2 = new File("b.jpg");
		
		long fsize1 = file1.length();//���� ������ ũ��
		System.out.println("���� ������ ũ��: "+fsize1);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos = new FileOutputStream(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int input = 0, count = 0;
		
		byte[] data = new byte[1024];
		
		try {
			while((input = fis.read(data))!=-1) {
				fos.write(data, 0, input);
				count+=input;

				if(count % 10 == 0) {
					float per = ((float)count/fsize1)*100;
					System.out.println((int)per +"% ī�� ��.");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
