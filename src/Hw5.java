
import java.util.*;
class Location{
	
	public double latitude;
	public double longitude;
		
}

public class Hw5 {
	
	public static void main(String[] args) {
		Map<String, Location> map = new HashMap<String, Location>();
		Scanner sc = new Scanner(System.in);
		Location [] location = new Location[3];
		for(int i=0;i<3;i++) {
			String key = sc.next();
			location[i] = new Location();
			location[i].latitude = sc.nextDouble();
			location[i].longitude = sc.nextDouble();
			
			map.put(key, location[i]);
		}
//		
//		
		sc.nextLine();
		String KEY = sc.nextLine();
		System.out.println(map.get(KEY).latitude +" "+map.get(KEY).longitude );
		
		
	}
}
