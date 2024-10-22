/*
 * Write a program to create a super class Vehicle having members Company and price.
Derive two different classes LightMotorVehicle(mileage) and HeavyMotorVehicle
(capacity_in_tons). Accept the information for "n" vehicles and display the information in
appropriate form. While taking data, ask user about the type of vehicle first.
 */
import java.util.Scanner;

class Vehicle
{
    protected String company;
    protected double price;

    public Vehicle(String company, double price)
    {
        this.company = company;
        this.price = price;
    }

    public void displayInfo()
    {
        System.out.println("Company: " + company);
        System.out.println("Price: " + price);
    }
}

class LightMotorVehicle extends Vehicle
{
    private double mileage;

    public LightMotorVehicle(String company, double price, double mileage)
    {
        super(company, price);
        this.mileage = mileage;
    }

    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

class HeavyMotorVehicle extends Vehicle
{
    private double capacity;

    public HeavyMotorVehicle(String company, double price, double capacity)
    {
        super(company, price);
        this.capacity = capacity;
    }

    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Capacity: " + capacity + " tons");
    }
}

public class Slip_29_Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();
        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter vehicle type (light/heavy): ");
            String type = sc.nextLine().toLowerCase();
            System.out.print("Enter company: ");
            String company = sc.nextLine();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (type.equals("light"))
            {
                System.out.print("Enter mileage (km/l): ");
                double mileage = sc.nextDouble();
                sc.nextLine();
                vehicles[i] = new LightMotorVehicle(company, price, mileage);
            }
            else if (type.equals("heavy"))
            {
                System.out.print("Enter capacity in tons: ");
                double capacity = sc.nextDouble();
                sc.nextLine();
                vehicles[i] = new HeavyMotorVehicle(company, price, capacity);
            }
        }

        System.out.println("\nVehicle Information:");
        for (Vehicle vehicle : vehicles)
        {
            vehicle.displayInfo();
            System.out.println();
        }

        sc.close();
    }
}
