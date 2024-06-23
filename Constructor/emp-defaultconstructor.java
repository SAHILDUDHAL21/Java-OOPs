class Emp
{
	int eno;
	String ename;
	float sal;

	Emp()
	{
		eno=101;
		ename="OM";
		sal=50000;
		System.out.println("Employee No = "+eno);
		System.out.println("Employee Name = "+ename);
		System.out.println("Employee Salary="+sal);
	}
	public static void main(String[] args) 
	{
		Emp ob=new Emp();	
	}
}