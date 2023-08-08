package August;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		//adding data
		map.put("Ram", 25);
		map.put("Sachin ", 47);
		map.put("Kiran", 65);
		//size of map
		System.out.println(map.size());
		// value 
		System.out.println(map.values());
		//object of map
		System.out.println(map);
		if(map.containsKey("Ram1")) {
			int a = map.get("Ram1");
			System.out.println(a);
		}
		else {
			System.out.println("No one here");
		}
// copy map
		HashMap<String, Integer> pam = new HashMap<String, Integer>(map);
		System.out.println(pam);
		
		//Iterate the map
		for(Map.Entry<String, Integer> ap: pam.entrySet()) {
			System.out.println("Key:\t"+ ap.getKey() + "\tValue\t"+ap.getValue());
		}
	}

}
