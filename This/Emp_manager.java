import java.util.*;
class Employee
{
    Scanner sc=new Scanner(System.in);
    int id;
    int sal;
    String name,dept;
    
    Employee()
    {
        id=1;
        name="sai";
        dept="cs";
        sal=0000;
    }
    Employee(int id,String name,String dept,int sal)
    {
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.sal=sal;
    }

    void accept()
    {
        System.out.print("\nEnter Id :: ");
        id=sc.nextInt();
        System.out.print("Enter Name ::");
        name=sc.next();
        System.out.print("Enter Department ::");
        dept=sc.next();
        System.out.print("Enter Salary :: ");
        sal=sc.nextInt();
    }
    
    void disp()
    {
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
        System.out.println("Department = "+dept);
        System.out.println("Salary = "+sal);
    }
}
class Manager extends Employee
{
    int bonus;
     Manager()
    {
        bonus=300;
    }
    Manager(int bonus)
    {
        this.bonus=bonus;
    }
    void acceptm()
    {
        System.out.print("Enter Bonus :: ");
        bonus=sc.nextInt();
    }
    void dispm()
    {
        System.out.print("Bonus = "+bonus);
    }
}
class MD
{
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Limit :: ");
        int n=sc.nextInt();
        Manager ob[]=new Manager[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new Manager();
            ob[i].accept();
            ob[i].acceptm();
        }
        
        int max=ob[0].sal+ob[0].bonus;
        int index=0;
        
        for(int i=1;i<n;i++)
        {
            if(max<(ob[i].sal+ob[i].bonus))
            {
                max=ob[i].sal+ob[i].bonus;
                index=i;
            }
        }
        System.out.println("\n\nEmployee With Maximum Salary :: ");
        ob[index].disp();
        ob[index].dispm();
    }
}
