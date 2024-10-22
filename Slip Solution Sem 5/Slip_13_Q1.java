/*
 * Q1) Write a program to accept a file name from command prompt, if the file exits then display
number of words and lines in that file.
 */
import java.io.*;
public class Slip_13_Q1 
{

	public static void main(String[] args) throws Exception 
	{
		String fname=args[0];
		File f=new File(fname);
		if(f.isFile())
		{
			FileInputStream fis=new FileInputStream(fname);
			int ch,cnt=0,cnt1=0;
			while((ch=fis.read())!=-1)
			{
				if(ch=='\n')
				{
					cnt++;
				}
				if(ch==' ')
				{
					cnt1++;
				}
			}
				
			System.out.println("Number of line in Given file is "+cnt);
			System.out.println("Number of Words in Given file is "+cnt1);
		}
		else
		{	
			System.out.println("file not exists");
		}
			
	}

}
