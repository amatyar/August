package August;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aug16 
{

	public static void main(String[] args) 
	{
		try {
			File myObj = new File("C:\\Users\\Rabindra\\OneDrive\\Desktop\\create.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data= myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
			
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("An error occured");
			ex.printStackTrace();
		}

	}

}
