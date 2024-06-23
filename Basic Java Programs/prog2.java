import java.util.*;
class demo
{
	void prime(int n)
	{
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				break;
		}
		if(i==n)
			System.out.println("Number is Prime "+n);
		else
			System.out.println("Number is Not Prime "+n);
	}
	void fact(int n)
	{
		int s=1,i;
		for(i=1;i<=n;i++)
		{
			s=s*i;
		}
		System.out.printf("Factorial of %d is %d",n,s);
	}
	void armstrong(int n)
	{
		int n1=n,d,s=0;
		while(n>0)
		{
			d=n%10;
			s=s+(d*d*d);
			n=n/10;
		}
		if(n1==s)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is Not Armstrong")
	}
	public static void main(String[] args) 
	{
		int n;
		demo ob=new demo();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number :: ");
		n=sc.nextInt();
		ob.prime(n);
	}
}