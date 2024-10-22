/*
 * Q1) Define an interface “Operation” which has method volume( ).Define a constant PI having a value
3.142 Create a class cylinder which implements this interface (members – radius, height). Create
one object and calculate the volume.
 */

import java.util.Scanner;

interface Operation
{
	final static float pi=3.142f;
	void area();
	void volume();
}
class Cylinder implements Operation
{
	double radius,height;
	public Cylinder()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the radius and height=");
		radius=sc.nextDouble();
		height=sc.nextDouble();
	}
	public void area()
	{
		double a=(2*pi*radius*height)+(2*pi*radius*radius);
		System.out.println("the area of cylinder is " +a);
	}
	public void volume()
	{
		double v=pi*radius*radius*height;
		System.out.println("the volume of cylinder is "+v);
	}
}
public class Slip_11_Q1 {

	public static void main(String[] args)
	{
		Cylinder ob=new Cylinder();
		ob.area();
		ob.volume();
	}

}
