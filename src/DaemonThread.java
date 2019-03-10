
public class DaemonThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("Daemon 쓰레드가 실행 중입니다.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main 쓰레드가 종료됩니다.");
	}

}
