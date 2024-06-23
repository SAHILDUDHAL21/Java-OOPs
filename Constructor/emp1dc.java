//use default constructor to accept from user and display emp info
import java.util.*;
class Emp{
    int eno;
    String ename;
    float sal;

    Emp(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter emp no ");
        eno=sc.nextInt();
        System.out.println("Enter Emp name ");
        ename=sc.next();
        System.out.println("Enter emp sal ");
        sal=sc.nextFloat();
        System.out.println("Emp no = "+eno);
        System.out.println("Emp name = "+ename);
        System.out.println("Emp Salary = "+sal);
    }
    public static void main(String abc[]){
        Emp ob =new Emp();
    }
    
}