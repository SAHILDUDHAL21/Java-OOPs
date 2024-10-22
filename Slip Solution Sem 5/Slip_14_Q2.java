/*
 * Q2) Write a Java program to create a Package “SY” which has a class SYMarks (members –
ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY which has a
class TYMarks (members – Theory, Practicals). Create ‘n’ objects of Student class (having
rollNumber, name, SYMarks and TYMarks). Add the marks of SY and TY computer subjects
and calculate the Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50, Pass Class for > =40
else‘FAIL’) and display the result of the student in proper format.
 */
import java.util.*;
import Slip_14_Q2_Sy.*;
import Slip_10_Q2_TY.*;

class student
{
	int rno;
	String name;
	SYMarks sy;
	TYMarks ty;
	double per;
	char grade;
	student(int rno,String name,int ct,int mt,int et,int Theory,int Practicals)
	{
		sy=new SYMarks(ct, mt, et);
		ty=new TYMarks(Theory, Practicals);
		this.rno=rno;
		this.name=name;
		perCalc(ct, mt, et, Theory, Practicals);
		Grade();
	}
	
	void perCalc(int ct,int mt,int et,int Theory,int Practicals)
	{
		this.per=(double)(ct+mt+et+Theory+Practicals)/5;
	}
	
	void Grade()
	{
		if(per>=70)
			grade='A';
		else if(per>=60)
			grade='B';
		else if(per>=50)
			grade ='C';
		else if(grade>=40)
			grade='D';
		else
			grade='F';
	}
	
	void disp()
	{
		System.out.println("Roll no = "+rno);
		System.out.println("Name = "+name);
		sy.display();
		ty.display();
		System.out.println("Persentage = "+per);
		System.out.println("Grade = "+grade);
	}
}
public class Slip_14_Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit ");
		int n=sc.nextInt();
		student ob[]= new student[n];
		for (int i =0;i<n;i++)
		{
			System.out.println("Enter roll no :: ");
			int r=sc.nextInt();
			System.out.println("Enter Name :: ");
			String nm=sc.next();
			System.out.println("Enter Computer Marks :: ");
			int c=sc.nextInt();
			System.out.println("Enter MAth MArks");
			int m=sc.nextInt();
			System.out.println("Enter Eletronic marks");
			int e=sc.nextInt();
			System.out.println("Enter Theory marks");
			int t=sc.nextInt();
			System.out.println("Enter Practal marks");
			int p=sc.nextInt();
			ob[i]=new student(r, nm, c, m, e, t, p);
		}
		
		for(int i =0;i<n;i++)
		{
			ob[i].disp();
		}
	}

}
