package August;
import java.util.*;
import java.util.stream.Stream;

public class hashMap
{
	public static void main(String[] args) 
	{
		Map<String, Integer> data = new HashMap<>();
		data.put("Android", 300);
		data.put("IPhone", 1300);
		data.put("Samsung", 900);
		data.put("Motorolla", 600);

	
	//converting key to array
	String[] keys = data.keySet().toArray(new String[data.keySet().size()]);
			for(String str : keys) 
			{
				System.out.println(str);
			}			
	
	// convert key to list
		List<String> list= new ArrayList<String>(data.keySet());	
		for(String str : list)
		{
			System.out.println(str);
		}
		
		//using Stream
		Stream<String>  stream = data.keySet().stream();
		stream.forEach((value)-> {
			System.out.println(value);
		});
		System.out.println("------");
		// using Iterator
		Iterator<Integer> it = data.values().iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
			
		}
		
		// using entry iterator
		Set<Map.Entry<String, Integer> > ent = data.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = ent.iterator();
		while(it2.hasNext()) {
			Map.Entry<String, Integer> entry= it2.next();
			String k = entry.getKey();
			Integer v= entry.getValue();
			System.out.println(k + ", "+v);
	}
		
		
	}
}