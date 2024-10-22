/*
 * Write a program to accept the two dimensional array from user and display sum of its diagonal
elements.
 */

import java.util.Scanner;

public class Slip_19_Q1 
{
	public static void main(String args[]) 
	{
		int m, i, j, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter order of matrix: ");
		m = sc.nextInt();
		int array[][] = new int[m][m];
		System.out.println("Enter the elements of the array: ");
		for (i = 0; i < m; i++)
			for (j = 0; j < m; j++)
				array[i][j] = sc.nextInt();
		
		
		sc.close();
		System.out.println("Elements of the array are: ");
		for (i = 0; i < m; i++) 
		{
			for (j = 0; j < m; j++) 
			{
				System.out.print(array[i][j] + " ");
				if (i == j)
					sum += array[i][j];
			}
			System.out.println();
		}

		System.out.println("Sum of Diagonal elements is " + sum);
	}

}
