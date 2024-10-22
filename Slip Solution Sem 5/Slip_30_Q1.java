/*
 * Q1) Write program to define class Person with data member as Personname,Aadharno, Panno.
Accept information for 5 objects and display appropriate information (use this keyword).
 */
import java.util.Scanner;

class Person
{
    private String personName;
    private String aadharNo;
    private String panNo;

    public Person(String personName, String aadharNo, String panNo)
    {
        this.personName = personName;
        this.aadharNo = aadharNo;
        this.panNo = panNo;
    }

    public void displayInfo()
    {
        System.out.println("Name: " + this.personName);
        System.out.println("Aadhar No: " + this.aadharNo);
        System.out.println("PAN No: " + this.panNo);
    }
}

public class Slip_30_Q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[5];

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter Aadhar No: ");
            String aadharNo = sc.nextLine();
            System.out.print("Enter PAN No: ");
            String panNo = sc.nextLine();

            persons[i] = new Person(name, aadharNo, panNo);
        }

        System.out.println("\nPerson Information:");
        for (Person person : persons)
        {
            person.displayInfo();
            System.out.println();
        }

        sc.close();
    }
}
