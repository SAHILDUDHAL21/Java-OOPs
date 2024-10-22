/*
 * Q1) Write a program for multilevel inheritance such that Country is inherited from Continent.
State is inherited from Country. Display the place, State, Country and Continent.
 */


class Continent
{
	
	Continent(String con)
	{
		System.out.println("Continent Name = "+con);
	}
}

class Country extends Continent
{

	public Country(String con,String cn) 
	{
		super(con);
		System.out.println("Country Name = "+cn);
	}
}

class State extends Country
{
	
	public State(String con,String cn,String s) 
	{
		super(con, cn);
		System.out.println("State Name = "+s);
	}
}

class place extends State
{
	
	public place(String con,String cn,String s,String p)
	{
		super(con,cn,s);
		System.out.println("Place Name = "+p);
	}
}
public class Slip_05_Q1
{

	public static void main(String[] args) 
	{
		new place("Asia","India","Maharashtra","Shrirampur");
	}

}
