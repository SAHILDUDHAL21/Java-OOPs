class Demo
{
    public static void main(String arg[])
    {
        int b,c,d,e;
        b=c=d=e=0;
        try
        {
            int a=10;
            b=a+5;
            c=a-5;
            d=a/0;
            e=a*2;
        }
        catch(Exception z)
        {
            System.out.println(z);
        }
        finally
        {
            System.out.println("Addition="+b);
            System.out.println("Subtraction="+c);
            System.out.println("Division="+d);
            System.out.println("Multiplication="+e);
        }
    }
}
