/*
 * Q2) Write a program to create a package name student. Define class StudentInfo with method to
display information about student such as rollno, class, and percentage. Create another class
StudentPer with method to find percentage of the student. Accept student details like
rollno, name, class and marks of 6 subject from user
 */
import Slip_10_Q2_Student.slip_10_Q2_Student_per;
import java.util.Scanner;

public class Slip_10_Q2 
{

	public static void main(String[] args) 
	{
		String nm, clas;
		int roll;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll no:= ");
		roll = sc.nextInt();
		System.out.print("Enter Name:= ");
		nm = sc.next();
		System.out.print("Enter class:= ");
		clas= sc.next();
		int m1,m2,m3,m4,m5,m6;
		System.out.print("Enter 6 sub mark:= ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
		m6 = sc.nextInt();
		slip_10_Q2_Student_per ob=new slip_10_Q2_Student_per(roll, nm, clas, m1, m2, m3, m4, m5, m6);
		ob.display();
	}

}

/*
 * Enter Roll no:= 1
Enter Name:= sai
Enter class:= ty
Enter 6 sub mark:= 77
66
55
88
44
99
Roll_no : 1
Name : sai
class :ty
-----MARKS-------
Sub 1 : 77
Sub 2 : 66
Sub 3 : 55
Sub 4 : 88
Sub 5 : 44
Sub 6 : 99
Total : 429
percentage: 71.0
------------------
 */
