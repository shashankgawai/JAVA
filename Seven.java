		
/*  Program to Reverse a Number in Java 
-------------------------------------------------------------------------------------------------*/
import java.io.*;
import java.util.Scanner;

class Seven
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter the Number : ");
		Scanner S = new Scanner(System.in);
		int a = S.nextInt();
		int rev =0, rem ;
		while(a!=0)
		{		
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			

		}
		System.out.print(rev);




	}	





}