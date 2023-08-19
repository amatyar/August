package August;
import java.io.*;

public class aug18a {

	public static void main(String[] args) throws IOException {
		// File path is passed as parameter
        File file = new File("MyRecord.txt");        
 
        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String str;
      
        while ((str = br.readLine()) != null) 
        { 
          
            System.out.println(str);
        }

	}

}
