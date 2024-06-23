class Demo
{
    public static void main(String arg[])
    {
        try
        {
            String s1="Hello";
            int n=Integer.parseInt(s1);
            System.out.println("Value = "+s1.charAt(7));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
