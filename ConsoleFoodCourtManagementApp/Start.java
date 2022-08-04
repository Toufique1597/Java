import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt fc = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("-----------------------------------");
		System.out.println("Welcome to Toufique & Rafid FoodCourt");
		System.out.println("-----------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Restaurant Management");
			System.out.println("\t3. Restaurant FoodIteam Management");
			System.out.println("\t4. FoodIteam Quantity Add-Sell");
			System.out.println("\t5. Exit");
			System.out.println("-----------------------------------\n");
			
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("-----------------------------------");
			
			switch(choice)
			{
				case 1:
					System.out.println("---------------------------------");
					System.out.println("You Choose Employee Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Show All Employees");
					System.out.println("\t4. Search an  Employee");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employe Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(fc.insertEmployee(e1)){ System.out.println("Employee Inserted with ID: "+e1.getEmpId());}
							else{System.out.println("Employee Can Not be Insertd......");}
							
							break;
							
						case 2:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = fc.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(fc.removeEmployee(e2)){ System.out.println("Employee Removed with ID: "+e2.getEmpId());}
								else{System.out.println("Employee Can Not be Removed......");}
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							break;
							
						case 3:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to See All Employees");
							System.out.println("---------------------------------");
							
							fc.showAllEmployees();
							
							break;
							
							
						case 4:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Search: ");
							String empId3 = sc.next();
							
							Employee e3 = fc.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
							break;
						
						case 5:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
							
							break;
							
						default:
							System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
							break;
						
					}
					
					break;
				
				case 2: 
					System.out.println("---------------------------------");
					System.out.println("You Choose Resturant  Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Restaurant");
					System.out.println("\t2. Remove an Existing Restaurant");
					System.out.println("\t3. Show All Restaurant");
					System.out.println("\t4. Search A Resturant");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert New Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurent ID: ");
							String rid1 = sc.next();
							System.out.print("Enter Restaurent Name: ");
							String name1 = sc.next();
							
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
							
							if(fc.insertRestaurant(r1)){System.out.println("Restaurant Inserted with RID: "+r1.getRid());}
							else{System.out.println("Restaurant can not be inserted");}
							
							break;
							
						case 2:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Remove Existing Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an RestaurentID to Remove: ");
							String rid2 = sc.next();
							
							Restaurant r2 = fc.searchRestaurant(rid2);
							
							if(r2 != null)
							{
								if(fc.removeRestaurant(r2)){ System.out.println("Restaurant Removed with ID: "+r2.getRid());}
								else{System.out.println("Restaurant Can Not be Removed......");}
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							break;
						
							
							
						case 3:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to See All Restaurant");
							System.out.println("---------------------------------");
							
							fc.showAllRestaurants();
							
							break;
						
						
						
						
							
							
							
						case 4:
						
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search a Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid3 = sc.next();
							
							Restaurant r3 = fc.searchRestaurant(rid3);
							
							if(r3 != null)
							{
								System.out.println("Resturant Found");
								System.out.println(" Restaurant Name: "+r3.getName());
								System.out.println("Restaurant RID: "+r3.getRid());
								r3.showAllFoodItems();
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							
							
							break;
							
			
							
						case 5:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
						
							break;
							
						default:
							System.out.println("Invalid Option............");
							break;
					}
					
					break;
				
				case 3:
					System.out.println("---------------------------------");
					System.out.println("You Choose Restaurant FoodIteam Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New FoodItem");
					System.out.println("\t2. Remove Existing FoodItem");
					System.out.println("\t3. Show All FoodItem");
					System.out.println("\t4. Search a FoodItem");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						
						case 1:
							
							//System.out.println("---------------------------------");
							System.out.println("You Choose Insert New FoodItem");
							System.out.println("---------------------------------");
							
							System.out.print("Enter RID: ");
							String rid1 = sc.next();
							
							if(fc.searchRestaurant(rid1)!= null)
							{
								System.out.println("\tWhat type of FoodItem do you want to create?");
								System.out.println("\t1. MainDish");
								System.out.println("\t2. Appitizers");
								System.out.println("\t3. Go Back");
								
								System.out.print("your Type: ");
								int Type = sc.nextInt();
								
								if(Type == 1)
								{
									System.out.print("Enter Food id: ");
									String fid1  = sc.next();
									System.out.print("Enter Food Name: ");
									String name1 = sc.next();
									System.out.print("Enter Available Quantity: ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Price: ");
									double p1 = sc.nextDouble();
									System.out.print("Enter category: ");
									String c1  = sc.next();
									
									MainDish md= new MainDish();
									md.setFid(fid1);
									md.setName(name1);
									md.setAvailableQuantity(aq1);
									md.setPrice(p1);
									md.setCategory(c1);
									
									
									
									
									if(fc.searchRestaurant(rid1).insertFoodItem(md))
									{
										System.out.println("FoodItem Inserted for "+ rid1 + " with Name " + name1);
									}
									else
									{
										System.out.println("FoodItem Can Not Be Inserted");
									}
									
									
								}
								else if(Type == 2)
								{
									System.out.print("Enter FoodId: ");
									String fid1 = sc.next();
									System.out.print("Enter FoodName: ");
									String name1 = sc.next();
									System.out.print("Enter Size: ");
									String s1 = sc.next();
									System.out.print("Enter Available Quantity: ");
									int aq2 = sc.nextInt();
									
									Appitizers ap = new Appitizers();
									ap.setFid(fid1);
									ap.setName(name1);
									ap.setSize(s1);
									ap.setAvailableQuantity(aq2);
									
									
									if(fc.searchRestaurant(rid1).insertFoodItem(ap))
									{
										System.out.println("FoodIteam Inserted for Restaurant Id "+ rid1 + " with Name " + name1);
									}
									else
									{
										System.out.println("FoodItem Can Not Be Inserted");
									}
								}
								else if(Type == 3)
								{
									System.out.println("Going Back.........");
								}
								else
								{
									System.out.println("Invalid  Type");
								}
							}
							else
							{
								System.out.println("FID MISMATCH");
							}
							
							break;
							
						case 2:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Remove Existing FoodItem");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							
							
							System.out.print("Enter  FoodId to Remove: ");
							String fid2 = sc.next();
							FoodItem f2= fc.searchRestaurant(rid2).searchFoodItem(fid2);
							
							
							
							if(f2 != null)
							{
								if(fc.searchRestaurant(rid2).removeFoodItem(f2))
								{ System.out.println(" Removed with Food ID: "+f2.getFid());}
								else{System.out.println("FoodItem Can Not be Removed......");}
							}
							else
							{
								System.out.println("FoodItem Does Not Exist");
							}
						
							break;
							
						case 3:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to See All FoodItems");
							System.out.println("---------------------------------");
							System.out.print("Enter Restaurant ID: ");
							String rid3 = sc.next();
							fc.searchRestaurant(rid3).showAllFoodItems();
							
							
						
							break;
							
						case 4:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Search a FoodItem");
							System.out.println("---------------------------------");
							System.out.print("Enter   Restaurant ID: ");
							String rid4 = sc.next();
							
							System.out.print("Enter  FID: ");
							String fid4 = sc.next();
							
							FoodItem f3 = fc.searchRestaurant(rid4).searchFoodItem(fid4);
							
							if(f3 != null)
							{
								System.out.println("Food Item Found");
								
								f3.showInfo();
							}
							else
							{
								System.out.println("FoodItem Does Not Exist");
							}
							
							
							
							break;
						
						case 5:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
						   
						
							break;
							
						default:
						    System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
							
							break;
					}
					
					break;
					
				case 4:
					System.out.println("---------------------------------");
					System.out.println("You Choose FoodItem Quantity Add-Sell");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Add FoodItem");
					System.out.println("\t2. Sell FoodItem");
					System.out.println("\t3. Show Add Sell History");
					System.out.println("\t4. Go Back");
					
					System.out.print("Enter You Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to AddFoodItem");
							System.out.println("---------------------------------");
							
							System.out.print("Enter  RestaurantId: ");
							String rid1 = sc.next();
							
							if(fc.searchRestaurant(rid1) != null)
							{
								System.out.print("Enter FoodId: ");
								String fid1 = sc.next();
								
								if(fc.searchRestaurant(rid1).searchFoodItem(fid1) != null)
								{
									System.out.print("Enter Add FoodItem: ");
									int am = sc.nextInt();
									
									if(fc.searchRestaurant(rid1).searchFoodItem(fid1).addQuantity(am))
									{
										System.out.println("Add FoodItem Successfull");
										frwd.writeInFile("addQuantity: $"+ am +" in Food Id " + fid1 + " by " + rid1);
									}
									else
									{
										System.out.println("Can Not Add");
									}
								}
								else
								{
									System.out.println("Invalid Food Id");
								}
								
							}
							else
							{
								System.out.println("RID MISMATCH");
							}
							
							break;
							
						case 2:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to SellFoodItem");
							System.out.println("---------------------------------");
							
							System.out.print("Enter  RestaurantId: ");
							String rid2 = sc.next();
							
							if(fc.searchRestaurant(rid2) != null)
							{
								System.out.print("Enter FoodId: ");
								String fid2 = sc.next();
								
								if(fc.searchRestaurant(rid2).searchFoodItem(fid2) != null)
								{
									System.out.print("Enter Sell FoodItem: ");
									int am1 = sc.nextInt();
									
									if(fc.searchRestaurant(rid2).searchFoodItem(fid2).sellQuantity(am1))
									{
										System.out.println("SellFood Iteam Successfull");
										frwd.writeInFile("SellFoodItem: $"+ am1 +" in Food Id " + fid2 + " by " + rid2);
									}
									else
									{
										System.out.println("Can Not Sell");
									}
								}
								else
								{
									System.out.println("Invalid Food Id");
								}
								
							}
							else
							{
								System.out.println("RID MISMATCH");
							}
							
							break;
						    
						
							
							
						case 3:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose show Addsell History");
							System.out.println("---------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
							
							break;
							
						default:
							System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
							break;
						
						
					
					}
					
					break;
				
				case 5:
					System.out.println("---------------------------------");
					System.out.println("You Choose Exit");
					System.out.println("---------------------------------");
					repeat = false;
					break;
				
				default:
					System.out.println("-----------------------------------");
					System.out.println("Invalid Choice.....");
					break;
			}
			System.out.println("-----------------------------------\n");
		}
	}
}