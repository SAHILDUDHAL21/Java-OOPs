//Q1) Write a Program to print all Prime numbers in an array of ‘n’ elements.(use command line arguments)
public class Slip_01_Q1 
{
	
	
	public static void main(String[] args) 
	{
		int a[]=new int[20];
		
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		
		for(int i=0;i<args.length;i++)
		{
			int p=0;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					p=1;
				}
			}
			if(p==0)
			{
				System.out.println(a[i]);
			}
		}
		
		
	}

	
}


/* input 2 3 4 5 7 9 55 21 10 13


Output
2
3
5
7
13
*/

