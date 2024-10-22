/*
 * Q1) Write a Program to illustrate multilevel Inheritance such that country is inherited from
continent. State is inherited from country. Display the place, state, country and continent.
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
public class Slip_20_Q1
{

	public static void main(String[] args) 
	{
		new place("Asia","India","Maharashtra","Shrirampur");
	}

}