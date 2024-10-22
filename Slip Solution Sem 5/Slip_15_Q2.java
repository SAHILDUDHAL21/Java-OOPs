/*
 * Q2) Write a program to define a class Account having members custname, accno. Define default
and parameterized constructor. Create a subclass called SavingAccount with member savingbal,
minbal. Create a derived class AccountDetail that extends the class SavingAccount with
members, depositamt and withdrawalamt. Write a appropriate method to display customer
details.
 */

class Account
{
	int acno;
	String custname;
	Account()
	{
		
	}
	
	Account(int acno,String custname)
	{
		this.acno=acno;
		this.custname=custname;
	}
	
	void disp()
	{
		System.out.println("Account No = "+acno);
		System.out.println("Custumer Name = "+custname);
	}
}

class SavingAccount extends Account
{
	int sbal;
	int mibal;
	public SavingAccount(int acno,String custname,int sbal,int minbal) 
	{
		super(acno,custname);
		this.sbal=sbal;
		this.mibal=minbal;
	}
	void disp()
	{
		super.disp();
		System.out.println("Saving Balanse = "+sbal);
		System.out.println("Min Balance = "+mibal);
	}
}

class AccountDetals extends SavingAccount
{
	int damt,wamt;
	public AccountDetals(int acno, String custname, int sbal, int minbal,int damt,int wamt) 
	{
		super(acno, custname, sbal, minbal);
		this.damt=damt;
		this.wamt=wamt;
	}
	
	void disp()
	{
		super.disp();
		System.out.println("Deposite Amount = "+damt);
		System.out.println("Withdraw Amount = "+wamt);
	}	
}
public class Slip_15_Q2 
{

	public static void main(String[] args) 
	{
		AccountDetals ob= new AccountDetals(101, "Om",50000,1000,40000,20000);
		ob.disp();
	}

}

