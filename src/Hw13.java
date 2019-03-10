class Thread5 extends Thread{
	public void run() {
		for(int i = 0 ; !Hw13.stopped; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(3*1000);//3초 쉬고
			}catch(Exception e) {}
		}
		
	}
}
public class Hw13 {
	static boolean stopped = false;
	
	public static void main(String[] args) {
		
		Thread5 th1 = new Thread5();
		th1.start();
		
		try {
			Thread.sleep(6*1000);//6초 쉬고
		}catch(Exception e) {}
		
		stopped = true;//쓰레드 정지 
		
		System.out.println("stopped");
		
	}
}
