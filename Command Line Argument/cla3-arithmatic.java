class Demo
{
	public static void main(String arg[])
	{
		int a=Integer.parseInt(arg[0]);
		int b=Integer.parseInt(arg[1]);
		System.out.println("Addition = "+(a+b));
		System.out.println("Subtraction = "+(a-b));
		System.out.println("Multiplication = "+(a*b));
		float c=Float.parseFloat(arg[0]);
		float d=Float.parseFloat(arg[1]);
		System.out.println("Division = "+(c/d));
	}
}