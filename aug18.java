package August;
import java.io.FileWriter;
import java.io.IOException;
// for write files
public class aug18 {

	public static void main(String[] args) {

		String book = "MyRecord.txt";

		try {
			FileWriter writer= new FileWriter(book);
			writer.write("Hello Greetings.\n");
			writer.write("I am from Boston, MA.Learning Java  from class Q012.\n");
			writer.write("Selenium.\n");
			writer.close();
			System.out.println("done");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
