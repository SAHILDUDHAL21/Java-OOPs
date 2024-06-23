class Demo
{
    public static void main(String arg[])
    {
        try
        {
            String s1=null;
            System.out.println("Value = "+s1.charAt(7));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
