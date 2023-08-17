package August;
/*
Singleton is a design pattern that tells us that we can create only one instance of a class and that instance can be accessed globally.
•	Makes sure that the instance is only created the first time.
*/

public class August16a {

	public static void main(String[] args) {
		Data012 data = Data012.myData();
		data.display();
		
		data.str = (data.str).toUpperCase();
		System.out.println(data.str);

	}

}
class Data012
{
	public String str;
	private static Data012 db = null;
	private Data012()
	{
		str = "Hello i am string of singleton.";
	}
	//method
	public static Data012 myData()
	{
		// to make ensure only one instance is created
		if(db == null)
		{
			db = new Data012();
		}
		return db;
	}
	 public void display()
	 {
		 System.out.println("I am from singleton class.");
	 }
	
}