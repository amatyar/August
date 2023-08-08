package August;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class ListConstructor 
{
	public static void main(String[] args) 
	{
		Walmart[] wl = {
				new Walmart(10021, "Soap", "soft and slik for hair", 9.45),
				new Walmart(20012, "Crossian", "Flor, milk, butter, sugar", 5.69),
				new Walmart(30112, "Banana", "Chiquita, Guatemala", 1.49)
						};
		
		List<Walmart> walmart = Arrays.asList(wl);		
		walmart.stream().forEach(x -> x.displayProduct());		
		walmart.stream().forEach(y -> y.Price_Increse(2));
		// for loop
		for(int i = 0; i < wl.length; i++) 
		{
			System.out.println(wl[i].Product_Name);
		}
		HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
		for(Walmart s: walmart) {
			if(hm.containsKey(s.Product_Name)) 
			{
				hm.get(s.Product_Name).add(s.product_ID+"-"+s.Product_Description+"-"+s.Product_Price);
			}
			else
			{
				hm.put(s.Product_Name, new ArrayList<String>());
				hm.get(s.Product_Name).add(s.Product_Description+"-"+s.product_ID+"-"+s.Product_Price);
			}
		}
System.out.println(hm);
	}
}
class Walmart
{ 
	//Properties
	int product_ID;
	String Product_Name;
	String Product_Description;
	double Product_Price;
	//constructor
	public Walmart(int id, String Name, String Description, double Price)
	{
		this.product_ID 		 = id;
		this.Product_Name 		 = Name;
		this.Product_Description = Description;
		this.Product_Price       = Price;
	}
	public int getProductID()
	{
		return product_ID ;
	}
	public void setproduct_ID (int id) {
		this.product_ID= id;
	}
	public String getProductName()
	{
		return Product_Name;
	}
	public void setProductName(String Name)
	{
		this.Product_Name = Name;
	}
	public String getProductDescription()
	{
		return Product_Description;
	}
	public void setProductionDescription(String Description)
	{
		this.Product_Description = Description;
	}
	public double getProductPrice()
	{
		return Product_Price;
	}
	public void setProductPrice(double Price)
	{
		this.Product_Price= Price;
	}
	public void displayProduct()
	{
		System.out.println("ID :"+ this.product_ID +", Name of Product:  "+this.Product_Name +", Description: "+this.Product_Description+" ,Price :$ "+this.Product_Price);
	}
	public void Price_Increse(int i) 
	{
		this.Product_Price += i;
		
		System.out.println("New Price  :$"+this.Product_Price);
		
	}
}