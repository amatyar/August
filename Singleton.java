package August;
/*
 Singleton is a design pattern that tells us that we can create only one instance of a class and that instance can be accessed globally.
•	Makes sure that the instance is only created the first time.
 */
public class Singleton 
{
	public static void main(String[] args) 
	{
		Database data;
		data = Database.myData();
		data.display();
		
		data.str = (data.str).toUpperCase();
		System.out.println(data.str);

	}

}
class Database
{
	public String str;
	private static Database db = null;
	private Database()
	{
		str = "Hello i am string of singleton.";
	}
	//method
	public static Database myData()
	{
		// to make ensure only one instance is created
		if(db == null)
		{
			db = new Database();
		}
		return db;
	}
	 public void display()
	 {
		 System.out.println("I am from singleton class.");
	 }
	
}
