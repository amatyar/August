package August;
import java.util.*;
public class Aug04a {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Android", "Mobile");
		map.put("Eclipse IDE", "Java");
		map.put("Eclipse RCP", "Java");
		map.put("Git", "Version control system");

		// convert keys to array
		String[] keys = map.keySet().toArray(new String[map.keySet().size()]);

		for (String string : keys) {
		    System.out.println(string);
		}
		// convert keys to list
		List<String> list = new ArrayList<String>(map.keySet());
		for (String string : list) {
		    System.out.println(string);
		}

	}

}
