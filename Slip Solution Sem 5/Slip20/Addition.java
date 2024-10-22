package Slip20;
public class Addition 
{
	public int ans,n1,n2;
	public float answer,num1,num2;
	public Addition(int n1,int n2,float num1,float num2)
	{
		this.n1=n1;
		this.n2=n2;
		this.num1=num1;
		this.num2=num2;
	}
	public void add()
	{
	
		ans=n1+n2;
		System.out.println("addition is="+ans);
	}
	public void sub()
	{
		answer=num1-num2;
		System.out.println("subtraction is="+answer);
	}
}
