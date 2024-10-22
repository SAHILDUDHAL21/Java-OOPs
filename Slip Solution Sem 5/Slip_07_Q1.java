/*
 * Q1) Design a class for Bank. Bank Class should support following operations;
a. Deposit a certain amount into an account
b. Withdraw a certain amount from an account
c. Return a Balance value specifying the amount with details
 */

import java.util.Scanner;

class Bank
{
	double bal;
	Bank()
	{
		System.out.print("\n\n                                      Welcome to Bank ::");
		
	}
	
	void Deposite(double amt)
	{
		this.bal=this.bal+amt;
		System.out.print("Successful Deposited..............");
	}
	
	void Withdraw(double amt)
	{
		if((this.bal-amt)>=0)
		{
			this.bal=this.bal-amt;
			System.out.print("Successful Withdrawal ..............");
		
		}
		else
		{
			System.out.print("not enough balance..............");
		}
		
	}
	
	double checkBalance()
	{
		return this.bal;
	}
}

public class Slip_07_Q1
{
	public static void main(String[] args) 
	{
		Bank ob=new Bank();
		Scanner sc = new Scanner(System.in);
		int ch;
			
			do
			{
				System.out.println("\n______________________________________________________________________________________________");
				System.out.println("\n 1 :: Deposit \n 2 :: Withdraw \n 3 :: Check Balance ");
				System.out.println("\n________________________________________Enter Choice________________________________________");
				System.out.print(":=>>   ");
				ch=sc.nextInt();
				
				switch(ch)
				{
					case 1 :	System.out.print("Enter Amount To Deposited ::");
								double am=sc.nextDouble();
								ob.Deposite(am);
								break;
							
					case 2 :	System.out.print("Enter Amount To Withdraw ::");
								double m=sc.nextDouble();
								ob.Withdraw(m);
								break;
							
					case 3 :	System.out.println("Your Current Bank Balance is "+ob.checkBalance());
								break;
				
					default :	System.out.println("Tuza bapa ne "+ch+" Choice delti ka ...");
				}
			
			}while(ch<=3);
		}

}
