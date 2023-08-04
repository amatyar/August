package August;

public class August03 
{
	public static void main(String[] args) 
	{
		Weekday day; // reference
		day = new Workday();
		day.Thrusday();
		
		day = new Busyday();
		day.Tuesday();
		
		day = new Businessday();
		day.Friday();

	}

}
interface Weekday
{
	public void Monday();
	public void Tuesday();
	public void Wednesday();
	public void Thrusday();
	public void Friday();
		
}
class Workday implements Weekday
{
	@Override
	public void Monday() 
	{
		System.out.println("start work");		
	}

	@Override
	public void Tuesday() 
	{
		System.out.println("second work");		
	}

	@Override
	public void Wednesday() {
		System.out.println("third work");
		
	}

	@Override
	public void Thrusday() {
		System.out.println("forth work");			
	}

	@Override
	public void Friday() {		
		System.out.println("fifth work");	
	}	
}
class Busyday implements Weekday{
	@Override
	public void Monday() {
		System.out.println("start busy work");	
		
	}
	@Override
	public void Tuesday() {
		System.out.println("start busy2 work");			
	}
	@Override
	public void Wednesday() {		
		System.out.println("start busy3 work");	
	}
	@Override
	public void Thrusday() {
		System.out.println("start busy4 work");		
	}
	@Override
	public void Friday() {		
		System.out.println("start busy5 work");	
	}	
}
class Businessday implements Weekday{
	@Override
	public void Monday() {
		System.out.println("start business work");		
	}
	@Override
	public void Tuesday() {
		System.out.println("start business 2 work");		
	}

	@Override
	public void Wednesday() {
		System.out.println("startbusiness 3 work");	
	}

	@Override
	public void Thrusday() {
		System.out.println("startbusiness 4 work");			
	}

	@Override
	public void Friday() {		
		System.out.println("start business 5 work");	
	}
	
}