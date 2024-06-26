/* Program to Find the Factorial of the Number using Recursion in Java 
--------------------------------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.Scanner;


class Six
{
	static int fact=1;
	
	public static void main(String[] args)
	{
 		Scanner S = new Scanner(System.in);
		int no=S.nextInt();
		Six S1 = new Six();
		S1.Info(on);
		System.out.print("Eneter the number : "+fact);
	}
		void Info(int on)
		{

			if(on>=1)
			{
			fact=fact*on;
			Info(on-1);
			}
		}

	

}