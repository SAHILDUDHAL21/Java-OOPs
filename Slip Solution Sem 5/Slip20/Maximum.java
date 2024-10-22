package Slip20;


public class Maximum extends Addition
{
	public Maximum(int n1,int n2, float num1, float num2)
	{
		super(n1,n2,num1,num2);
	}
	public void max()
	{
		if (n1>n2)
			System.out.println(n1+" is greater than "+n2);
		else
			System.out.println(n2+" is greater than "+n1);
	}

}
