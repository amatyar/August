package August;
public class EXCEPTION {

	public static void main(String[] args) {
		try {
			   String Password = "StrongPassword";
			   
			   if(Password.length()<8) {
			    
			//throw is used to write what message should be displayed so catch keyword can display this message in runtime
			// new keyword is used to create new object of class MyException.
			    throw new MyException("Password is too short, Please try again.");
			   }
			   
			   String MobileNumber = "6174365079";
			   
				   if (MobileNumber.length()<10)
				   {
				    throw new MyException("Enter valid Phone Number.");
				   }
				   else 
				   {
				   
				   System.out.println("Congratulation Registered");
				   
				   }
			  }
			  
			  
		catch (Exception E) 
		{
			   System.out.println("Function called");
			   System.out.println("Caught");
			   System.out.println(E.getMessage());
			   E.printStackTrace();
	}
	}

}
class MyException extends Exception
{
	 
	 //the inherited class Exception is predefined class.
	 public MyException(String S) 
	 {
	  super(S);
	  
	 }
	 
}