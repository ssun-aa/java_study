
public class Q4_0313 {
	public static void main(String[] args){
		Thread3 th1 = new Thread3();
		th1.setDaemon(true);
		th1.start();
		
		try {
			Thread.sleep(5*1000);
		} catch (Exception e) {}
		
		System.out.println("종료합니다.");
	}

}
class Thread3 extends Thread{
	
	public void run() {
		for(int i = 0 ; i < 10 ; i ++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}