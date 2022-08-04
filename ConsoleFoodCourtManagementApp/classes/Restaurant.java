package classes;
import java.lang.*;
import interfaces.*;


public class Restaurant implements FoodItemOperations
{
	private String rid;
	private String name;
	private FoodItem foodItems[] = new FoodItem [10];
	
	
	public void setRid(String rid){this.rid = rid;}
	public void setName(String name){this.name = name;}
	
	
	public String getRid(){return rid;}
	public String getName(){return name;}
	
	public boolean insertFoodItem(FoodItem f)
	{
		boolean flag = false;
		for(int i=0; i<foodItems.length; i++)
		{
			if(foodItems[i] == null)
			{
				foodItems[i] = f;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeFoodItem(FoodItem f)
	{
		boolean flag = false;
		for(int i=0; i<foodItems.length; i++)
		{
			if(foodItems[i].equals(f))
			{
				foodItems[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public void showAllFoodItems()
	{
		for(int i =0; i<foodItems.length; i++)
		{
			if(foodItems[i] != null)
			{
				System.out.println(" Your FoodItems:" +foodItems[i].getName());
			}
		}
	}
	public FoodItem searchFoodItem(String fid)
	{
		FoodItem f = null;
		
		for(int i=0; i<foodItems.length; i++)
		{
			if(foodItems[i] != null)
			{
				if(foodItems[i].getFid().equals(fid))
				{
					f = foodItems[i];
					break;
				}
			}
		}
		return f;
	}
}