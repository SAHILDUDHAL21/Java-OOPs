 /*
 * Q1) Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal)
information using toString()
 */
class Employee
{
	public  String toString() 
	{
		return "Empid = 1,\nEmpname = om , \nEmpdesignation = Manager, \nEmpsal = 70000";
	}
}

public class Slip_06_Q1 
{
	public static void main(String[] args) 
	{
		Employee ob=new Employee();
		System.out.println(ob);
	}
	
}
