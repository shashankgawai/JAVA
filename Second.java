/* Program to Check for Leap Year in Java 
------------------------------------------------------------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.Scanner;

class Second
{
	public static void main(String[] args)
	{
		int year ;
		Scanner S = new Scanner(System.in);
		System.out.print("Enter the Year : ");
		year = S.nextInt();
		if(year % 4== 0 )
		{
			if( year % 100 == 0 )
			{
				if ( year % 400 == 0 )
				{
					System.out.println("This is  Leap Year ");
				}
				else
				{
					System.out.println("This is not Leap Year ");
				}
			}
			else
				{
			System.out.println("This is  Leap Year ");
				}
	
		}
		else
		{
			System.out.println("This is not Leap Year ");
		}





	}



}