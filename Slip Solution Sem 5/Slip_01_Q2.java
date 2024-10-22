/*Q2) Define an abstract class Staff with protected members id and name. Define a parameterized
constructor. Define one subclass OfficeStaff with member department. Create n objects of
OfficeStaff and display all details.
*/
import java.util.*;
abstract class Staff
{
	protected int id;
	protected String name;
	
	Staff(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

class OfficeStaff extends Staff
{
	
	String dept;
	OfficeStaff(int id,String name,String dept)
	{
		super(id,name);
		this.dept=dept;
	}
	
	void disp()
	{
		System.out.println("Staff Id = "+id);
		System.out.println("Staff Name = "+name);
		System.out.println("Staff Department = "+dept);
	}
}
public class Slip_01_Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No Of Staff :: ");
		int n=sc.nextInt();
		OfficeStaff ob[]=new OfficeStaff[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter Staff ID = ");
			int id=sc.nextInt();
			System.out.print("Enter Staff Name = ");
			String nm=sc.next();
			System.out.print("Enter Department = ");
			String dp=sc.next();
			ob[i]=new OfficeStaff(id, nm, dp);
		}
		
		System.out.println("\n\nDisplay informantion of staffs");
		
		for(int i=0;i<n;i++) 
		{
			System.out.println();
			ob[i].disp();
		}
	}

}



/* 
 * 
 * Output :: 
 * 
Enter No Of Staff :: 2

Enter Staff ID = 3
Enter Staff Name = om
Enter Department = comp

Enter Staff ID = 1
Enter Staff Name = om
Enter Department = sci


Display informantion of staffs

Staff Id = 3
Staff Name = om
Staff Department = comp

Staff Id = 1
Staff Name = om
Staff Department = sci
*/
