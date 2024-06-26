/* Program to Create Calculator using switch case in Java 
---------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.Scanner;

class Third
{
	public static void main(String[] args)
	{
		int x ,y,z ;
		Scanner S = new Scanner(System.in);
		System.out.print("Enter the 1st Number : ");
		x = S.nextInt();
		System.out.print("Enter the 2nd Number : ");
		y = S.nextInt();
		System.out.print("Enter the Operator : ");
		String sym = ("+ , - ,* , / ");
		sym = S.next();
		switch(sym)
		{
			case "+" : z=x+y;
					System.out.println(" The Two sum Addition is : "+z);
					break;
			case "/" : z=x/y;
					System.out.println(" The Two sum Addition is : "+z);
					break;
			case "-" : z=x-y;
					System.out.println(" The Two sum Addition is : "+z);
					break;
			case "*" : z=x*y;
					System.out.println(" The Two sum Addition is : "+z);
					break;
			default :
					System.out.println("This Symbol is Not Valide . ");

		}
		


	}


}