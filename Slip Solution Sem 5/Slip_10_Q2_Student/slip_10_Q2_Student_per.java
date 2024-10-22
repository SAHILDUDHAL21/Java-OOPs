package Slip_10_Q2_Student;

class StudentInfo 
{
	public int r_no;
	public String name, clas;
	public int a,b,c,d,e,f;
	int sum=0;
	double per;
	public void display()
	{
		System.out.println("Roll_no : "+r_no);
		System.out.println("Name : "+name);
		System.out.println("class :"+clas);
		System.out.println("-----MARKS-------");
		System.out.println("Sub 1 : "+a);
		System.out.println("Sub 2 : "+b);
		System.out.println("Sub 3 : "+c);
		System.out.println("Sub 4 : "+d);
		System.out.println("Sub 5 : "+e);
		System.out.println("Sub 6 : "+f);
		System.out.println("Total : "+sum);
		System.out.println("percentage: "+per);
		System.out.println("------------------");
	}
}
public class slip_10_Q2_Student_per extends StudentInfo 
{
	public slip_10_Q2_Student_per(int roll, String nm, String cla,int m1,int m2,int m3,int m4, int m5,int m6)
	{
		r_no = roll;
		clas = cla;
		name = nm;
		a = m1;
		b = m2;
		c = m3;
		d = m4;
		e = m5;
		f = m6;
		sum = a+b+c+d+e+f;
		per = sum/6;
	}
}
