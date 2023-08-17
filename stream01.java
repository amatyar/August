package August;
import java.util.*;
import java.util.stream.Collectors;
public class stream01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>languages = new ArrayList <String>();
		languages.add("English");
		languages.add("German");
		languages.add("French");
		languages.add("Nepali");
		//printout
		for(String language:languages)
		{
		System.out.println(language);
		}
		
		
		languages.stream().forEach(System.out::println);
		System.out.println("-----");
		
		languages.stream().filter(item->item.startsWith("E")).toList();
		languages.stream().sorted().forEach(System.out::println);
		
		languages.stream().sorted().forEach(x -> System.out.println(x));
		System.out.println("-----");
		languages.stream().sorted().forEach(x -> System.out.println(x));
		
		
	List<String> language = languages.stream().map(item->item.toUpperCase())
			.collect(Collectors.toList());
	
	
				for( String ap:language) 
				{
					System.out.println(ap);
				}
				
			
				//Create new Hashmap of type String,String 
				   Map<String,Integer> languagesMap = new HashMap<String,Integer>(); 
				  
				   //Loop through  each element in the ArrayList and insert into HashMap 
				   for(String jcdString : languages) { 
					   languagesMap.put(jcdString, jcdString.length()); 
				   } 
				  
				   //Now loop through each key,pair in jcdMap 
				   for (Map.Entry<String,Integer> jcdEntry : languagesMap.entrySet()) { 
				      System.out.println("Key="+jcdEntry.getKey()+" Value="+jcdEntry.getValue()); 
				   } 
	}

}
