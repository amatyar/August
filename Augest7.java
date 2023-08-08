package August;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
public class Augest7 {

	public static void main(String[] args) {
		//Define an array list and loop over it
		ArrayList<String> Duties = new ArrayList<>();
		Duties.add("Writer");
		Duties.add("Coder");
		Duties.add("");
		Duties.add("Teacher");
		Duties.add("Sweper");
		//String a = Duties.stream().filter(x->x.isEmpty()).count();
		// Counting Blank or empty 
		System.out.println(Duties.stream().filter(x->x.isEmpty()).count());
		//not empty
		System.out.println(Duties.stream().filter(x->!x.isEmpty()).count());
		
		// use for each loop
		for(String dt: Duties) 
		{
			System.out.println(dt);
		}
		
		
		System.out.println("************ case Next***********");
		
		// Define a hashmap and loop over it
		HashMap<String, String> Bookies = new HashMap<>();
		Bookies.put("Java", "Oxford");
		Bookies.put("C#", "Stanford");
		Bookies.put("JavaScript", "London");
		
		
		for (Entry<String, String> ent : Bookies.entrySet()) 
		{
			System.out.println(ent);
			System.out.println(" ");
		}
		
		System.out.println("\n Values only\n ");
		for(String value: Bookies.values()) 
		{
			System.out.println(value);
		}

	}

}
