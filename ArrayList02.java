package August;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 
{

	public static void main(String[] args) 
	{
		
		List<String> city= Arrays.asList("Cambridge","Abington", "Acton", "Acushnet","Adams",
		"Agawam","Amesbury","Amherst","Andover","Arlington");
		String q = city.get(5);
		System.out.println(q);
		//Retrieve
		for(int i = 0; i < city.size(); i++)
		{
			//System.out.println(city.get(i));
		}
		System.out.println(Arrays.toString(city.toArray()));
		// update 
		city.set(4, "Quincy");
		System.out.println(city);
		
		List<String> States = new ArrayList<>();
		// add
		States.add("Boston");
		States.add("Qiuncy");
		States.add("Dochester");
		// update
		States.set(2, "North Quincy");
		System.out.println(States);
		// remove
		States.remove(0);
		System.out.println(States);
		


	}
}