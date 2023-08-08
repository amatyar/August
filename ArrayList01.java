package August;
import java.util.ArrayList;

public class ArrayList01 
{
	public static void main(String[] args) 
	{
		Fuze fz = new Fuze(101,"Ram Krishna Patel","Burlington, MA02145");			      
		Fuze fz1 =new Fuze(102, "Lal Bahdur Shrma", "Arlington, MA 21045");
		Fuze fz3 =new Fuze(201, "Sarika Lopez", "78 Main Road, Boston, 02115");
		Fuze fz2 =new Fuze(112, "Ronny Mc Telor", "45 Drapper st, Brighton, MA 02215");
		Fuze fz4 =new Fuze(145, "Scott M Neil", "45 south st, Quincy, 02169");
			
		ArrayList<Fuze> fu= new ArrayList<>();
		fu.add(fz);
		fu.add(fz1);
		fu.add(fz2);
		fu.add(fz3);
		fu.add(fz4);
		fu.get(2).Display();
		System.out.println("----Next Case----");
		// for loop
		for ( int i = 0; i <fu.size(); i++)
		{
			//System.out.println(fu.get(i).EmpID+","+ fu.get(i).EmpName+","+fu.get(i).EmpAddress);
			fu.get(i).Display();
		}
		System.out.println("----Next Case while----");
		// while loop
		int i = 0;
		while( i < fu.size()) 
		{
			fu.get(i).Display();
			i++;
		}
		
		System.out.println("----Next Case for each----");
		// for each loop
		for(Fuze f : fu)
		{
			f.Display();
		}
	}
}
class Fuze
{
	int EmpID;
	String EmpName;
	String EmpAddress;
	public Fuze(int id, String nm, String ad) 
	{
		this.EmpID      = id;
		this.EmpName    = nm;
		this.EmpAddress = ad;
	}
	public void Display()
	{
		System.out.println("ID: "+this.EmpID+" Name: "+this.EmpName+" Address: "+this.EmpAddress);
	}
}