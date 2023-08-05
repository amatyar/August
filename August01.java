package August;

import java.util.ArrayList;
import java.util.Arrays;

public class August01 
{

	public static void main(String[] args) 
	{

		ArrayList<String> lang = new ArrayList<String>(Arrays.asList("Java", "Python", "C#", "C++","Noge.js"));
		System.out.println("ArrayList" + lang);
		for(int i = 0; i < lang.size(); i++)
		{
			//System.out.println(lang.size());
			System.out.println(i);
		}
		
		System.out.println("*************New Line**********");
		int k =0;
		while(k < lang.size())
		{
			System.out.println(k);
			k++;
			
		}
		System.out.println("*************New Line**********");
		//create new array of string type
				String[] arr = new String[lang.size()]; 
				
		// convert arraylist to array
				lang.toArray();	
				
				

		
		for(String ab : lang)
		{
			System.out.println(lang);
		}//System.out.println(Arrays.toString(lang));
		
	}

}
