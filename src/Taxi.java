
public class Taxi implements Meter {

	int BASE_FARE = 3000;

	@Override
	public void start() {
		System.out.println("������ �����մϴ�");
	}
	@Override
	public void stop(int distance) {
		int fare = BASE_FARE + distance * 2;
		System.out.println("������ �����մϴ�. ����� "+ fare +"�� �Դϴ�.");
	}
	@Override
	public void afterMidnight() {
		BASE_FARE=BASE_FARE * 2;
	}

}
