/*
 * Q2) Write a program to using marker interface create a class Product (product_id, product_name,
product_cost, product_quantity) default and parameterized constructor. Create objects of class
product and display the contents of each object and Also display the object count.
 */
import java.util.*;

interface Slip_09_Q2_inter 
{
	
}

class product implements Slip_09_Q2_inter 
{
	int pid, pcost, quantity;
	String pname;
	static int cnt;
	product() 
	{
		pid = 1;
		pcost = 10;
		quantity = 1;
		pname = "pencil";
		cnt++;
	}

	product(int id, String n, int c, int q) 
	{
		pid = id;
		pname = n;
		pcost = c;
		quantity = q;
		cnt++;
		System.out.println("\nCOUNT OF OBJECT IS : " + cnt + "\n");
	}
	public void display() 
	{
		System.out.println("\t" +pid + "\t" + pname + "\t" + pcost + "\t" + quantity);
	}
}
public class Slip_09_Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Product : ");
		int n = sc.nextInt();
		product pr[] = new product[n];
		System.out.println("\nEnter Product Details :\n");
		for (int i = 0; i < n; i++) 
		{
			System.out.println("Enter Product ID: ");
			int pid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Product Name: ");
			String pn = sc.nextLine();
			System.out.println("Enter Product Cost:");
			int pc = sc.nextInt();
			System.out.println("Enter Product Quantity:");
			int pq = sc.nextInt();
			pr[i] = new product(pid, pn, pc, pq);
		}
		
		System.out.println("\tId\tPname\tCost\tQuantity\n");
		for (int i = 0; i < n; i++) 
		{
			pr[i].display();
		}

	}

}
