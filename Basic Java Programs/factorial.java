import java.util.*;

class factorial
{
	int s=1,i;
	void fact(int n)
	{
		for(i=1;i<=n;i++)
		{
			s=s*i;
		}
		System.out.printf("Factorial of %d is %d",n,s);
	}
	public static void main(String[] args) 
	{
		int n;
		factorial ob=new factorial();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number :: ");
		n=sc.nextInt();
		ob.fact(n);	
	}
}
