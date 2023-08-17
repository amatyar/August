package August;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lambda {

	public static void main(String[] args) {
		List<Integer> aList = Arrays.asList(6,88,23,14,17,12,32,51,79,94);
		Stream<Integer> stream = aList.stream().filter(num -> num %2 == 0);
		stream.forEach(num -> System.out.println(num));


	}

}
