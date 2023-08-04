package August;

import java.util.HashMap;
import java.util.Map;

public class Auge03a 
{

	public static void main(String[] args) 
	{
		// Map is interface , Birds is object , HashMap is implements class of Map
		Map<String, String> Birds = new HashMap<String, String>();
		// adding key and value
		Birds.put("Color", "blue");
		Birds.put("Size", "Large");
		Birds.put("Live", "On Trees");
		// testing 
		System.out.println(Birds);
		
		// creating loop
		for (Map.Entry<String, String> entry : Birds.entrySet()) 
		{
			System.out.println(entry.getKey() + " "+entry.getValue());			
		}
		
		// Next case develop
		Map<String, String> jobs = new HashMap<String, String>();
		jobs.put("Teacher", "Mathematics");
		jobs.put("Carpenter", "Construction");
		jobs.put("Doctor", "Treatment");
		
		//loop foreach
		for(String work: jobs.keySet()) {
			System.out.println(work);
		}
		for(String work: jobs.values()) {
			System.out.println(work);
		}
		
		
		// One more time
		Map<String, String> subjects = new HashMap<String, String>();
		subjects.put("Math", "Calculas");
		subjects.put("Computer", "programming");
		
		System.out.println(subjects);
		System.out.println(subjects.get("Math"));
		
		// loop 
		for(String book : subjects.keySet())
		{
			System.out.println(book +"\t" +subjects.get(book));
			
			
		}
	}

}
