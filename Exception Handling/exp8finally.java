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
            System.out.println("Addition="+b);
            c=a-5;
            System.out.println("Subtraction="+c);
            d=a/0;
            System.out.println("Division="+d);
            e=a*2;
            System.out.println("Multiplication="+e);
        }
        catch(Exception z)
        {
            System.out.println(z);
        }
       
    }
}
