package August;

public class tyrCatch 
{
	public static void main(String[] args) 
	{ // if else
		//when array index will be out of bound?
		int [] myNum = { 1,2,3,4};
		try 
		{
			
			System.out.println(myNum[5]);
		}
		catch(Exception e)
		{
			System.out.println(" you put wrong num."+ e.getMessage());
		}
		finally 
		{
			System.out.println("we are closing connection" );
		}
	}

}
