/*
 * Write a program to print an array after changing the rows and columns of a given
two-dimensional array.
 */
import java.util.*;
public class Slip_04_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter numbers of rows :: ");
		int n=sc.nextInt();
		System.out.print("Enter numbers of columns :: ");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("Enter 2 D Array Elements ::");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("output");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}


/*
Enter numbers of rows :: 3
Enter numbers of columns :: 3
Enter 2 D Array Elements ::
1 2 3
4 5 6
7 8 9
output
1 4 7 
2 5 8 
3 6 9 
 */

