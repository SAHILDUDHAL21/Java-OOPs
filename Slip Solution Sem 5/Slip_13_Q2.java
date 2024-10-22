/*
 * Q2) Write a program to display the system date and time in various formats shown below:
Current date is : 31/08/2021
Current date is : 08-31-2021
Current date is : Tuesday August 31 2021
Current date and time is : Fri August 31 15:25:59 IST 2021
Current date and time is : 31/08/21 15:25:59 PM +0530
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Slip_13_Q2 
{

	public static void main(String[] args) 
	{
		Date date = new Date();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String d= f.format(date);
		System.out.println(d);
		SimpleDateFormat f1 = new SimpleDateFormat("MM-dd-yyyy");
		String d1= f.format(date);
		System.out.println(d1);
		SimpleDateFormat f2 = new SimpleDateFormat("EEEEE MMMMM dd yyyy");
		String d2= f2.format(date);
		System.out.println(d2);
		SimpleDateFormat f3 = new SimpleDateFormat("EEEEE MMMMM dd HH:mm:ss z yyyy");
		String d3= f3.format(date);
		System.out.println(d3);
		SimpleDateFormat f4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
		String d4= f4.format(date);
		System.out.println(d3);
	}

}

/*
29/09/2024
29/09/2024
Sunday September 29 2024
Sunday September 29 23:37:35 IST 2024
Sunday September 29 23:37:35 IST 2024
*/