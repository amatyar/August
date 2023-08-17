package August;
import java.util.*;
import java.util.stream.Stream;

public class New {

	public static void main(String[] args) {
		
		// Initialization of Collection 
		List<Order> orderBook = new ArrayList<>();
		
		Order ShopABuy = new Order("Shop A for buy", 300, 900.30, Order.Side.BUY);
		Order sellA = new Order("Sell back", 600, 890.30, Order.Side.SELL);
		Order ShopBBuy = new Order("Shop B for buy", 400, 552, Order.Side.BUY);
		Order sellB = new Order("Sell back from B", 200, 550, Order.Side.SELL);
		Order JustB = new Order("collecting only", 300, 130, Order.Side.BUY); 
		// Adding 
		orderBook.add(ShopABuy);
		orderBook.add(sellA); 
		orderBook.add(ShopBBuy);
		orderBook.add(sellB); 
		orderBook.add(JustB); 
		//  Filtering Collection elements 
		// Filtering buy and sell order using filter() method
		Stream<Order> stream = orderBook.stream(); 
		
		Stream buyOrders = stream .filter((Order o) -> o.side().equals(Order.Side.BUY)); 
		
		System.out.println("No of Buy Order Placed :" + buyOrders.count());

		Stream<Order> sellOrders = orderBook .stream() .filter((Order o) -> o.side() == Order.Side.SELL);
		System.out.println("No of Sell Order Placed : " + sellOrders.count()); 
		
		// Reduce or Fold operation 
		// Calculating total value of all orders
		double value = orderBook.stream().mapToDouble((Order o) -> o.price()) .sum(); 
		System.out.println("Total value of all orders : " + value);
		long quantity = orderBook.stream().mapToLong((Order o) -> o.quantity()) .sum(); 
		System.out.println("Total quantity of all orders : " + quantity); 
		}
	} 
class Order 
{ 
	
	enum Side 
	{
		BUY, 
		SELL;
	} 
	//private final used for constant variable mean only access in this class and can't change
	private final String symbol;
	private final int quantity; 
	private double price; 
	private final Side side;
	// Constructor 
	public Order(String symbol, int quantity, double price, Side side) 
	{ 
		this.symbol = symbol; 
		this.quantity = quantity; 
		this.price = price; 
		this.side = side; 
	} 
	
	public double price() 
	{ 
		return price; 
	}
	public void price(double price) 
	{ 
		this.price = price;
	} 
	public String symbol() 
	{ 
		return symbol; 
	} 
	public int quantity() 
	{ 
		return quantity;
	} 
	public Side side() 
	{ 
		return side; 
	} 
}

		
