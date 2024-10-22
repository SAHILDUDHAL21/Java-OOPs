/*
 * Q2) Create an abstract class “order” having members id, description. Create two subclasses
“Purchase Order” and “Sales Order” having members customer name and Vendor name
respectively. Define methods accept and display in all cases. Create 3 objects each of Purchase
Order and Sales Order and accept and display details.
 */

import java.util.Scanner;

abstract class Order
{
	int id;
	String desc;
	 
	public Order(int id,String desc) 
	{
		this.id=id;
		this.desc=desc;
	}
	
	void disp()
	{
		System.out.println("\nOrder Id = "+id);
		System.out.println("Order Description = "+desc);
	}
}

class PurchaseOrder extends Order
{
	String Vn;
	public PurchaseOrder(int id,String desc,String Vn) 
	{
		super(id, desc);
		this.Vn=Vn;
	}
	void disp()
	{
		super.disp();
		System.out.println("Vendor Name  = "+Vn);
	}
		
}

class SalesOrder extends Order
{
	String cn;
	public SalesOrder(int id,String desc,String cn) 
	{
		super(id, desc);
		this.cn=cn;
	}
	void disp()
	{
		super.disp();
		System.out.println("Customer Name  = "+cn);
	}
	
}
public class Slip_06_Q2 
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No Of Orders :: ");
		int n=sc.nextInt();
		
		PurchaseOrder[] obp= new PurchaseOrder[n];
		SalesOrder[] obs=new SalesOrder[n];
		
		for(int i=0;i<n;i++) 
		{
			System.out.print("Enter Order id = ");
			int id=sc.nextInt();
			System.out.print("Enter Order Discription = ");
			String d=sc.next();
			System.out.print("Enter Custumer Name = ");
			String c=sc.next();
			System.out.print("Enter Vendor Name = ");
			String v=sc.next();
			obp[i]=new PurchaseOrder(id, d, v);
			obs[i]=new SalesOrder(id, d, c);
		}
		System.out.print("\nPurchase Order Details = ");
		for(int i=0;i<n;i++) 
		{
			obp[i].disp();
		}
		System.out.print("\nSales Order Details = ");
		for(int i=0;i<n;i++) 
		{
			obs[i].disp();
		}
	}
}



/*
 * output
 * Enter No Of Orders :: 3
Enter Order id = 1
Enter Order Discription = mouse
Enter Custumer Name = om
Enter Vendor Name = sham
Enter Order id = 2
Enter Order Discription = keyboard
Enter Custumer Name = sai
Enter Vendor Name = sham
Enter Order id = 3
Enter Order Discription = wifi
Enter Custumer Name = ram
Enter Vendor Name = aman

Purchase Order Details = 
Order Id = 1
Order Description = mouse
Vendor Name  = sham

Order Id = 2
Order Description = keyboard
Vendor Name  = sham

Order Id = 3
Order Description = wifi
Vendor Name  = aman

Sales Order Details = 
Order Id = 1
Order Description = mouse
Customer Name  = om

Order Id = 2
Order Description = keyboard
Customer Name  = sai

Order Id = 3
Order Description = wifi
Customer Name  = ram

 */



