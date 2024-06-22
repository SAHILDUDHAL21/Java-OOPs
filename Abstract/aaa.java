import java.util.ArrayList;
import java.util.Scanner;

abstract class Staff {
    String name;
    String address;

    public Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract void display();
}

class FullTimeStaff extends Staff {
    String department;
    double salary;

    public FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    @Override
    void display() {
        System.out.println("Full Time Staff:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class PartTimeStaff extends Staff {
    int numberOfHours;
    double ratePerHour;

    public PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void display() {
        System.out.println("Part Time Staff:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Staff> staffList = new ArrayList<>();

        System.out.print("Enter the number of staff: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.print("Enter 1 for Full Time Staff or 2 for Part Time Staff: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter department: ");
                String department = scanner.nextLine();

                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();

                FullTimeStaff fullTimeStaff = new FullTimeStaff(name, address, department, salary);
                staffList.add(fullTimeStaff);
            } else if (choice == 2) {
                System.out.print("Enter number of hours: ");
                int numberOfHours = scanner.nextInt();

                System.out.print("Enter rate per hour: ");
                double ratePerHour = scanner.nextDouble();

                PartTimeStaff partTimeStaff = new PartTimeStaff(name, address, numberOfHours, ratePerHour);
                staffList.add(partTimeStaff);
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                i--; // Decrement i to redo this iteration
            }
            scanner.nextLine(); // Consume the newline character
        }

        System.out.println("\nStaff Details:");
        for (Staff staff : staffList) {
            staff.display();
        }

        scanner.close();
    }
}