package classes;
import java.lang.*;

public class Appitizers extends FoodItem
{
	private String size;
	
	public void setSize(String size)
	{
		this.size = size;
	}
	public String getSize()
	{
		return size;
	}
	public void showInfo()
	{
		System.out.println("Food id: "+fid);
		System.out.println("Food name: "+name);
		System.out.println("Available Quantity: "+availableQuantity);
		System.out.println("Size: "+size);
		System.out.println();
	}
}