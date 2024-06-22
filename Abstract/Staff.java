import java.util.*;

abstract class Staff {
    String name, addr;

    abstract void disp();
}

class FullTimeStaff extends Staff {
    String department;
    double sal;

    FullTimeStaff(String name, String addr, String department, double sal) {
        this.name = name;
        this.addr = addr;
        this.department = department;
        this.sal = sal;
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + addr);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + sal);
    }
}

class PartTimeStaff extends Staff {
    int noOfHrs, rateph;

    PartTimeStaff(String name, String addr, int noOfHrs, int rateph) {
        this.name = name;
        this.addr = addr;
        this.noOfHrs = noOfHrs;
        this.rateph = rateph;
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + addr);
        System.out.println("No Of Hours: " + noOfHrs);
        System.out.println("Rate per Hour: " + rateph);
    }
}

class Demo {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Staff :: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Staff ob[] = new Staff[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n1 :: Full Time Staff \n2 :: Part Time Staff \nEnter Choice :: ");
            int ch = sc.nextInt();
            sc.nextLine();  
            if (ch == 1) {
                System.out.print("Enter Staff Name :: ");
                String name = sc.nextLine();
                System.out.print("Enter address: ");
                String addr = sc.nextLine();
                System.out.print("Enter department: ");
                String department = sc.nextLine();
                System.out.print("Enter salary: ");
                double sal = sc.nextDouble();
                sc.nextLine(); 
                ob[i] = new FullTimeStaff(name, addr, department, sal);
            } else if (ch == 2) {
                System.out.print("Enter Staff Name :: ");
                String name = sc.nextLine();
                System.out.print("Enter address: ");
                String addr = sc.nextLine();
                System.out.print("Enter number of hours: ");
                int noOfHrs = sc.nextInt();
                System.out.print("Enter rate per hour: ");
                int rateph = sc.nextInt();
                sc.nextLine();  
                ob[i] = new PartTimeStaff(name, addr, noOfHrs, rateph);
            } else {
                System.out.println("Invalid choice ");
                i--;
            }
        }

        System.out.println("\nFull Time Staff Details ::\n");
            for (int i = 0; i < n; i++) {
              if (ob[i] instanceof FullTimeStaff) {
                ob[i].disp();
                System.out.println();
              }
            }

            System.out.println("\nPart Time Staff Details ::\n");
            for (int i = 0; i < n; i++) {
              if (ob[i] instanceof PartTimeStaff) {
                ob[i].disp();
                System.out.println();
              }
            }


       
    }
}
