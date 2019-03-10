
public class Taxi implements Meter {

	int BASE_FARE = 3000;

	@Override
	public void start() {
		System.out.println("운행을 시작합니다");
	}
	@Override
	public void stop(int distance) {
		int fare = BASE_FARE + distance * 2;
		System.out.println("운행을 종료합니다. 요금은 "+ fare +"원 입니다.");
	}
	@Override
	public void afterMidnight() {
		BASE_FARE=BASE_FARE * 2;
	}

}
