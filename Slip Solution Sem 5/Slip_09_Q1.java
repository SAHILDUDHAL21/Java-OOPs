/*
 * Q1) Define a “Clock” class that does the following ;
a. Accept Hours, Minutes and Seconds
b. Check the validity of numbers
c. Set the time to AM/PM mode
Use the necessary constructors and methods to do the above task
 */
import java.util.*;
class Clock
{
	int hh,mm,ss;
	Clock()
	{
		System.out.println("enter the time in HH MM SS format");
		Scanner sc= new Scanner(System.in);
		this.hh = sc.nextInt();
		this.mm = sc.nextInt();
		this.ss = sc.nextInt();
	}
	void isValid()
	{
		if(hh>=0 && hh<24 && mm>0 &&mm<60 && ss>0 && ss<60)
			System.out.println("time is valid");
		else
			System.out.println("time is not valid");
	}
	void setTimeMode()
	{
		if(hh<12)
		{
			System.out.println("time ="+hh+":"+mm+":"+ss +" AM");
		}
		else
			hh = hh-12;
		System.out.println("time ="+hh+":"+mm+":"+ss +" PM");
	}
}
public class Slip_09_Q1 
{

	public static void main(String[] args) 
	{
		Clock c=new Clock();
		c.isValid();
		c.setTimeMode();
	}
}
