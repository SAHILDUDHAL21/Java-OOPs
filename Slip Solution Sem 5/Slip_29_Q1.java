/*
 * Q1) Write a program to create a class Customer(custno,custname,contactnumber,custaddr).
Write a method to search the customer name with given contact number and display the
details.
 */

import java.util.Scanner;

class Customer 
{
    private int custNo;
    private String custName;
    private String contactNumber;
    private String custAddr;

    public Customer(int custNo, String custName, String contactNumber, String custAddr) 
    {
        this.custNo = custNo;
        this.custName = custName;
        this.contactNumber = contactNumber;
        this.custAddr = custAddr;
    }

    
    public String getCustName() {
        return custName;
    }

    public void displayDetails() 
    {
        System.out.println("Customer No: " + custNo);
        System.out.println("Customer Name: " + custName);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Address: " + custAddr);
    }
}
public class Slip_29_Q1 
{
	 private static Customer[] customers = new Customer[5];
	    public static void main(String[] args)
	    {
	        customers[0] = new Customer(1, "Om", "1234567890", "1 Om Street");
	        customers[1] = new Customer(2, "Sai", "2345678901", "2 Sai Lane");
	        customers[2] = new Customer(3, "Ram", "3456789012", "3 Ram Road");
	        customers[3] = new Customer(4, "Shyam", "4567890123", "4 Shyam Boulevard");
	        customers[4] = new Customer(5, "Aba", "5678901234", "5 Aba Avenue");

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter customer name to search: ");
	        String nameToSearch = scanner.nextLine();

	        searchCustomerByName(nameToSearch);

	        scanner.close();
	    }

	    private static void searchCustomerByName(String name) 
	    {
	        for (Customer customer : customers) 
	        {
	            if (customer.getCustName().equalsIgnoreCase(name)) 
	            {
	                customer.displayDetails();
	                return;
	            }
	        }
	        System.out.println("Customer not found.");
	    }
}
