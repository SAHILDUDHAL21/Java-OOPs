class Demo
{
    public static void main(String arg[])
    {
        try
        {
            int a[]=new int[-2];
            System.out.println("Division = "+a[1]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
