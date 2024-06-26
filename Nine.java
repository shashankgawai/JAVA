/*Program to Check Whether A Number is Prime or Not
-------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.Scanner;

class Nine
{
	public static void main(String[] args)
	{
		
		System.out.print("Enter the Number : ");
		Scanner S = new Scanner(System.in);	
		int num=S.nextInt();
		int temp = 0;
		for(int i =2 ; num-1>=i;i++)
		{
			if(num%i==0)
			{
				temp= temp+1;
			
			}	
		}
		if (temp==0)
		{
			System.out.println("This R Prime Number");	
		}
		else
			{
				System.out.println("This R Not Prime Number");
			}

	}



}