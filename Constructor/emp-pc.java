//accept value from usr
class Emp
{
	int eno;
	String ename;
	float sal;

	Emp(int eno,String ename,float sal)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}

	void disp()
	{
		System.out.println("Employee Eno = "+eno);
		System.out.println("Employee Name = "+ename);
		System.out.println("Employee Salary = "+sal);
	}

	public static void main(String abc[])
	{
		Emp ob=new Emp(101,"Sai",54545);
		ob.disp();
	}

}