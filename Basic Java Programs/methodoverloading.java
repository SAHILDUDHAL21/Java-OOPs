class Method
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition = "+c);
	}
	void add(int a,int b,int d)
	{
		int c=a+b+d;
		System.out.println("Addition = "+c);
	}
	void add(float a,float b)
	{
		float c=a+b;
		System.out.println("Addition = "+c);
	}
	public static void main(String[] args) 
	{
		Method ob=new Method();
		ob.add(11,22);
		ob.add(11,22,33);
		ob.add(12.32f,23.23f);
	}
}