/*
 * Q2) Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg).
Create an array of n player objects .Calculate the batting average for each player using static
method avg(). Define a static sort method which sorts the array on the basis of average. Display
the player details in sorted order.
 */

import java.util.Scanner;

class CricketPlayer
{
	String name;
	int noi;
	int non;
	int tr;
	double bavg;
	
	public CricketPlayer(String name,int noi,int non,int tr) 
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

public class Slip_02_Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No Of Players :: ");
		int n=sc.nextInt();
		
		CricketPlayer ob[]=new CricketPlayer[n];
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
			ob[i]=new CricketPlayer(nm, noi, non, tr);
		}
		
		sort(ob,n);
		
		System.out.println("\n\nDisplay informantion of Players");
		for(int i=0;i<n;i++) 
		{
			System.out.println();
			ob[i].disp();
		}
	}
	
	static void sort(CricketPlayer ob[],int n)
	{
		CricketPlayer temp;
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


/*
 * Enter No Of Players :: 3
Enter Name = om
Enter No of Innings  = 9
Enter No of times Not Out  = 8
Enter Total Runs = 176
Enter Name = sai
Enter No of Innings  = 5
Enter No of times Not Out  = 4
Enter Total Runs = 88
Enter Name = sham
Enter No of Innings  = 8
Enter No of times Not Out  = 1
Enter Total Runs = 33


Display informantion of Players

Name = sham
No of Innings = 8
No of times Not Out = 1
Total Runs = 33
Bat Average = 4.0

Name = sai
No of Innings = 5
No of times Not Out = 4
Total Runs = 88
Bat Average = 88.0

Name = om
No of Innings = 9
No of times Not Out = 8
Total Runs = 176
Bat Average = 176.0
*/
