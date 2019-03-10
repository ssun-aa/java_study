import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoxExam {

	public static Map<String, Integer> makeMap(){
		Map<String, Integer> product = new HashMap<>();
		product.put("����", 2500);
		product.put("ũ���Ľ�", 5000);
		
		return product;
	}
	public static void main(String[] args) {
		Map<String, Integer> product = new HashMap<>();
		
		product = makeMap();
		Set<String> keys = product.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key +" :"+product.get(key));
		}
	}
}
