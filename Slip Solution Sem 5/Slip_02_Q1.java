/*
 * Q1) Write a program to read the First Name and Last Name of a person, his weight and height using
command line arguments. Calculate the BMI Index which is defined as the individual's body mass
divided by the square of their height.
(Hint : BMI = Wts. In kgs / (ht)2)
 */
public class Slip_02_Q1 
{
	public static void main(String[] args) 
	{
		String fname=args[0];
		String lname=args[1];
		double h=Double.parseDouble(args[2]);
		double w=Double.parseDouble(args[3]);
		double bmi=w/(h*h);
		
		System.out.println("Name = "+fname+" "+lname);
		System.out.println("Height in Meter = "+h);
		System.out.println("Weight in KG = "+w);
		System.out.println("BMI = "+bmi);
	}
}

/*
Name = Sahil Dudhal
Height in Meter = 1.7
Weight in KG = 63.0
BMI = 21.79930795847751
*/