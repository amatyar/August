package August;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream02 {

	public static void main(String[] args) {
		// SELECT max(salary), employee_id, employee_name FROM Employee
		// stream also work same
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered);
		
		
		//get count of empty string
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
		//get count of empty string
		long count1 = strings.parallelStream().filter(string -> string.isEmpty()).count();
		
		System.out.println(count1);
		//Collectors
		List<String> filtered1 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered1);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);
	}

}
