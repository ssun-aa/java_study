
public class TaxiExam {

	public static void main(String[] args) {

		Taxi taxi = new Taxi();
		taxi.BASE_FARE = 2500;
	
		taxi.start();
		taxi.afterMidnight();
		taxi.stop(1000);
	}

}
