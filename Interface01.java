package August;

public class Interface01 
{
	public static void main(String[] args) 
	{
		//Once you create a Java Class which implements any Interface, the object instance can be referenced as an instance of the Interface
		Books bk; 
		
		 bk= new JavaBook();
		bk.Color();		
		
		
		bk = new ManulAQ();
		bk.Read();
		
		JavaBook jb = new JavaBook();
		jb.see();

	}
}
interface Look
{
	void see();
}
interface Books 
{
	public void Read();
	void Color();	
}
class JavaBook implements Books,Look
{
	@Override
	public void Read() {		
		System.out.println("Read book for test.");
	}

	@Override
	public void Color() {
		System.out.println("Which color is best for book cover?");		
	}

	@Override
	public void see() {
		System.out.println("Look praperly.");
		
	}		
}
class ManulAQ implements Books
{
	@Override
	public void Read() {
		System.out.println("Only read , do not practice.");		
	}
	@Override
	public void Color() {
		System.out.println("I am going to get blue color Manul book.");		
	}	
}