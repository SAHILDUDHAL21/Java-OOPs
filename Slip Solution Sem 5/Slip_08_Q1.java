/*
 * Q1) Create a class Sphere, to calculate the volume and surface area of sphere.
(Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))
 */

import java.util.Scanner;

public class Slip_08_Q1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the sphere: ");
		double radius=sc.nextDouble();
		double surface_area = (4*3.14*(radius*radius));
		double volume = ((double)4/3)*3.14*(radius*radius*radius);
		System.out.println("The surface area of the sphere = "+surface_area);
		System.out.println("The volume of sphere = "+volume);
	}

}
