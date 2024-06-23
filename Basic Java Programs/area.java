import java.util.*;
class area
{
	public static void main(String[] args) 
	{
		float r,a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius :: ");
		r=sc.nextFloat();
		a=3.14f*r*r;
		System.out.print("Area Of Circle ="+a);
	}
}