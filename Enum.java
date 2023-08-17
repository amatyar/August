package August;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.stream.Stream;

public class Enum 
{
	public static void main(String[] args) 
	{
		Days[] days = Days.values();
		System.out.println("Days in a week:");
		// Using for loop
		for(Days day: days)
		{
			System.out.println(day);
		}
		System.out.println("\n**88Next Case88**\n");
		//using for each loop
		EnumSet.allOf(Days.class).forEach(day -> System.out.println(day));
		
		System.out.println("\n**88Next Case88**\n");
		// Using Arrays
		Arrays.asList(Days.values()).forEach(day -> System.out.println(day));
		System.out.println("\n**88Next Case88**\n");
		//using Stream
		Stream.of(Days.values()).forEach(System.out:: println);
		
		System.out.println("\n**88Next Case88**\n");
		workdays wd = new workdays(Days.Thrusday);
		wd.pickup();
	}
}
enum Days
{
Sunday, Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday	
}
class workdays{
	Days wday;
	public workdays(Days dy)
	{
		this.wday = dy;
	}
	public void pickup() {
		switch(wday)
		{
		case Sunday:
			System.out.println("It's holiday . enjoy.");
			break;
		case Monday:
			System.out.println("It's workday . enjoy.");
		break;
		case Tuesday:
			System.out.println("It's workday . enjoy.");
			break;
		case Wednesday:
			System.out.println("It's meeting day . enjoy.");
			break;
		case Thrusday:
			System.out.println("It's work day . enjoy.");
			break;
		case Friday:
			System.out.println("It's work day . enjoy.");
			break;
			default:
				System.out.println("It's holiday . enjoy.");
		}
	}
}