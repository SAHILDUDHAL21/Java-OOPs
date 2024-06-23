class Demo
{
	int eno;
	String ename;
	float sal;
	
	void accept(int eno,String ename,float sal)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}

	void display()
	{
		System.out.println("Employee  NO = "+eno);
		System.out.println("Employee Name = "+ename);
		System.out.println("Employee salary ="+sal);
	}

	public static void main(String abc[])
	{
		Demo ob= new Demo();
		ob.accept(101,"om",3646464);
		ob.display();
	}
}