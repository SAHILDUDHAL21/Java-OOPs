/*
 * Q1) Write a program to find the cube of given number using functional interface.
 */
import java.util.*;
interface Cube
{
	void cube();
}
class Q1 implements Cube
{
	public void cube()
	{
		System.out.println("enter the number");
		Scanner sc= new Scanner (System.in);
		float cu = sc.nextInt();
		double cue = cu*cu*cu;
		System.out.println("cube of no is:"+cue);

	}
}
public class Slip_10_Q1 
{

	public static void main(String[] args) 
	{
		Q1 ob=new Q1();
		ob.cube();
	}

}
