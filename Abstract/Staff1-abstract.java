import java.util.*;
abstract class Staff
{
    int id;
    String name;
    Staff(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
class OfficeStaff extends Staff
{
    String dept;
    OfficeStaff(int id,String name,String dept)
    {
        super(id,name);
        this.dept=dept;
    }
    void disp()
    {
        System.out.println("Staff Id = "+id);
        System.out.println("Staff Name = "+name);
        System.out.println("Department = "+dept);
    }
}
class MD
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit :: ");
        int n =sc.nextInt();
        OfficeStaff ob[]=new OfficeStaff[n];
        
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter Staff Id :: ");
            int id=sc.nextInt();
            System.out.print("Enter Staff Name :: ");
            String name=sc.next();
            System.out.print("Enter Department :: ");
            String dept=sc.next();
            ob[i]=new OfficeStaff(id,name,dept);
        }
        
        for(int i=0;i<n;i++)
            ob[i].disp();
    }
}
