
import java.util.Scanner;
class CricketPlayer1
{
	String name;
	int noi;
	int non;
	int tr;
	double bavg;
	
	public CricketPlayer1(String name,int noi,int non,int tr) 
	{
		this.name=name;
		this.noi=noi;
		this.non=non;
		this.tr=tr;
		this.bavg=batavg(noi, non, tr);
	}
	
	static double batavg(int noi,int non,int tr)
	{
		return tr/(noi-non);
	}
	
	void disp() 
	{
		System.out.println("Name = "+name);
		System.out.println("No of Innings = "+noi);
		System.out.println("No of times Not Out = "+non);
		System.out.println("Total Runs = "+tr);
		System.out.println("Bat Average = "+bavg);
	}
}
public class Slip_18_Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No Of Players :: ");
		int n=sc.nextInt();
		
		CricketPlayer1 ob[]=new CricketPlayer1[n];
		for(int i=0;i<n;i++) 
		{
			System.out.print("Enter Name = ");
			String nm=sc.next();
			System.out.print("Enter No of Innings  = ");
			int noi=sc.nextInt();
			System.out.print("Enter No of times Not Out  = ");
			int non=sc.nextInt();
			System.out.print("Enter Total Runs = ");
			int tr=sc.nextInt();
			ob[i]=new CricketPlayer1(nm, noi, non, tr);
		}
		
		sort(ob,n);
		
		System.out.println("\n\nDisplay informantion of Players");
		for(int i=0;i<n;i++) 
		{
			System.out.println();
			ob[i].disp();
		}
		
		sc.close();
	}
	
	static void sort(CricketPlayer1 ob[],int n)
	{
		CricketPlayer1 temp;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(ob[j].bavg>ob[j+1].bavg)
				{
					temp=ob[j];
					ob[j]=ob[j+1];
					ob[j+1]=temp;
				}
			}
		}
		
	}

}
