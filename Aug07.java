package August;

public class Aug07 {

	public static void main(String[] args) {
		String str = "Rabindra";
		int c=0; 
		String u = "";
		
		 for( int i =0; i < str.length(); i++)
		 {			
			 u = str.charAt(i) + u;
		 }
		 System.out.println(u);
		 
		str= str.toLowerCase();
		 
		 for ( int i = 0; i <str.length(); i++)
		 {
			 if( str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
				 //System.out.println("yes");
			// else 
				// System.out.println("No");
				 
				 //System.out.println(str.charAt(i));
			 {					
				 c++;
			 }					 
		 
		} System.out.println("Total no of vowel :" + c);
	}
}
