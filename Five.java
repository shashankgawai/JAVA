/*Program to Find the Factorial of the Number in Java
-----------------------------------------------------------------------------

import java.io.*;
import java.util.Scanner;

class Five
{
	public static void main(String[] args)
	{
			int a;
			int fac=1;
			Scanner S = new Scanner(System.in);
			System.out.print("Enter The Number : ");
			a=S.nextInt();
			for(int i=1;i<=a;i++)
			{
				fac = fac*i;
			
			}
			System.out.println("Factorial is : "+fac);


	}

}
---------------------------------------------------------------------------------------
*/

import java.io.*;
import java.util.Scanner;

class Five
{
	public static void main(String[] args)
	{
		int fac=1;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int a = S.nextInt();
		for(int i=a;i>=1;i--)
		{
			fac=fac*i;

		}
		System.out.print("This is Factorial : "+fac);

	}








}






