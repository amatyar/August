package August;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TryCatchFinally 
{

	public static void main(String[] args) 
	{
		
orders or = new orders();
or.receipt();
	}

}
class orders
{
	// create String array
	String[] order= 
		{
			"Coffee",
			"Cola",
			"Orange",
			"Chai",
			"Pizza", 
			"Burgger",
			"Pita wrap"
		};
	//method to write data from array to a file
	public void receipt()
	{
		PrintWriter exit = null;
		try 
		{
			System.out.println("we are wrting statement");
			//creating a new file OutputFile.txt
			exit = new PrintWriter(new FileWriter("OutputFile.txt"));
			//for loop
			for( int i = 0; i <order.length; i++)
			{
				exit.println("Order menu:"+ i + " = "+ order[i]);
				System.out.println("Order menu:"+ i + " = "+ order[i]);
			}
			
			System.out.println("********Next **********");
			
			int j = 0;
			while(j < order.length) 
			{	
				
				exit.println("Order Menu two:"+ j + " = "+ order[j]);
				System.out.println("Order menu:"+ j + " = "+ order[j]);
				j++;
			}
			System.out.println("********Next **********");
			
			for(String abc : order)
			{
				exit.println("Order Menu two:"+ order.length + " = "+ abc);
				System.out.println("Order menu:"+ order.length + " = "+ abc );
			}
		}
		catch(Exception ex) 
		{
			System.out.println("exception =>"+ ex.getMessage());
		}
		finally 
		{
			// check PrintWriter
			if(exit !=null)
			{
				System.out.println("Closing PrinterWriter");
				exit.close();
			}
			else
			{
				System.out.println("PrintWriter is not open");
			}
		}
	}
}