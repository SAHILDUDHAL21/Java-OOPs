class Demo
{
	int rno;
	String sname;
	float per;
	
	void accept(int rno,String sname,float per)
	{
		this.rno=rno;
		this.sname=sname;
		this.per=per;
	}

	void display()
	{
		System.out.println("Student Roll NO = "+rno);
		System.out.println("Student Name = "+sname);
		System.out.println("Student Persentage ="+per);
	}

	public static void main(String abc[])
	{
		Demo ob= new Demo();
		ob.accept(101,"sai",76f);
		ob.display();
	}
}