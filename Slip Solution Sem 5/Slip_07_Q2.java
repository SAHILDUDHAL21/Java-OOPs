/*
 * Write a program to accept a text file from user and display the contents of a file in
reverse order and change its case.
 */

import java.io.*;

public class Slip_07_Q2 
{

	public static void main(String[] args)
	{
		StringBuffer f=new StringBuffer();
		String l;
		try 
		{
		FileReader f1=new FileReader("Slip_07_Q2.txt");
		BufferedReader b1=new BufferedReader(f1);
		
			while((l=b1.readLine())!=null)
			{
				f.append(l).append("\n");
			}
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
		f.reverse();
		
		System.out.print(f);
		
	}

}
