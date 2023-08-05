package August;

import java.util.Arrays;
import java.util.List;

//import java.util.Arrays;
//import java.util.List;

public class aug04 {

	public static void main(String[] args) 
	{
		Crew[] cr = 
			{
				new Crew(1, "Jonney Lam", 200.25),
				new Crew(2, "Raghu Nath Patel", 25.5),
				new Crew(3, "Krish Kumar", 45.25),
				new Crew(12, "Ahmaed Abdul", 5000.15)
			};
		List<Crew> clist= Arrays.asList(cr);
		clist.stream().forEach(cre -> cre.dispalyRaise(2));
		for(int i =0 ; i < cr.length; i++)
		{
			System.out.println(cr[i].C_Salary);
		}

	}

}
class Crew{
	int C_id;
	String C_Name;
	double C_Salary;
	
	//constructor
	public Crew(int id, String nm, double sl) 
	{
		this.C_id = id;
		this.C_Name = nm;
		this.C_Salary = sl;
	}
	public void dispalyRaise(int i)
	{
		this.C_Salary *= i;
	}
}