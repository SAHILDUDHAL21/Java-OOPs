package Slip_10_Q2_TY;

public class TYMarks 
{
	int Theory,Practicals;
	public TYMarks(int Theory,int Practicals)
	{
		this.Theory=Theory;
		this.Practicals=Practicals;
	}
	public void display()
	{
		System.out.println("\nTy Marks ");
		System.out.println("Theory\tPracticals");
		System.out.println(Theory+"\t"+Practicals);
	}
}
