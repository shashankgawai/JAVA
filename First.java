/* Program to Check for Even or Odd Number in Java
------------------------------------------------------------------------------------
*/

import java.io.*;
import java.util.Scanner;

class First
{
	public static void main(String[] args)
	{
		int x;
		Scanner S = new Scanner(System.in);
		System.out.print("Enetr the Number : ");
		x=S.nextInt();
		if(x % 2 == 0)
		{
			System.out.println("Even NUmber");

		}
		else
		{
			System.out.println("Odd NUmber");
		}
	}

}