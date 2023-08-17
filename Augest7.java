package August;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Stream;
public class Augest7 {

	public static void main(String[] args) {
		//Define an array list and loop over it
		ArrayList<String> Duties = new ArrayList<>();
		Duties.add("Writer");
		Duties.add("Coder");
		Duties.add("");
		Duties.add("Teacher");
		Duties.add("Sweper");
		
		System.out.println(Duties);
		
		Stream<String> stream = Duties.stream();
		System.out.println(stream.filter(x -> x.startsWith("C")).toList());
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
		System.out.println("********************");
		System.out.println("Get all keys and values: "+ Bookies.entrySet());
		
		
		
		List<String> names = Arrays.asList("chinmay","","sarika","ram","","sham");
		System.out.println(names.stream().filter(x -> x.isEmpty()).count());
		
		// taking the blank string to list
		List<String> name2 = Arrays.asList("chinmay","","sarika","ram","","sham");
		System.out.println(names.stream().filter(x -> x.isEmpty()).toList());
		
		//Only the string
		List<String> name3 = Arrays.asList("chinmay","","sarika","ram","","sham");
		System.out.println(names.stream().filter(x -> !x.isEmpty()).toList());
		
		// names starts with "S"
		List<String> name4 = Arrays.asList("chinmay","","sarika","ram","","sham");
		System.out.println(name4.stream().filter(x -> x.contains("i")).toList());
		
		// string greater then 4
		System.out.println(name4.stream().filter(x -> x.length() > 4).toList());
		
	
		// Working with every element of string 
		// ["chinmay","shirish","ravi"] ===> //["CHINMAY","SHIRISH","RAVI"]
		// ["chinmay","shirish","ravi"] ===>  // ["chinmay","shirish"]
		
		List<Integer> transactions = Arrays.asList(100,-1900,78888,-900,-4523,98);
		
		System.out.println(transactions.stream().filter(tra -> tra >0).toList());
		System.out.println(transactions.stream().filter(tra -> tra < 0).toList());
		
		
		// Convert every list in map to Upper case()
		
		List<String> countries =Arrays.asList("USA","China","ameica","Africa","London");
		System.out.println(countries.stream().map(x -> x.toUpperCase()).toList());
		
		
		List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 117, 19, 23, 29);
		System.out.println(numbers.stream().map(x -> x * 2).toList());
		
		List<Integer> salary = Arrays.asList(6000,6000,6500,56777,9000);
		System.out.println(numbers.stream().map(x -> x * 2).toList());
		
		System.out.println(salary.stream().map(x -> x + x * 0.10).toList());
		System.out.println("**********");
		Integer var = numbers.stream().max(Integer::compare).get();
		System.out.println(var);
		System.out.println("**********");
		// Define a array list and loop over it 
		// Define a hashmap and loop over it 
		
		 
		 IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics(); 
		 System.out.println("Highest prime number in List : " + stats.getMax()); 
		 System.out.println("Lowest prime number in List : " + stats.getMin());
		 System.out.println("Sum of all prime numbers : " + stats.getSum()); 
		 System.out.println("Average of all prime numbers : " + stats.getAverage());

	}

}
