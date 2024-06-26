/* Program to Reverse A String in Java
--------------------------------------------------------------------------------------------
*/

import java.io.*;
import java.util.Scanner;

class Eight
{
	
		
	public static void main(String[] args)
	{
		
		String name="shashamk";
	/*	System.out.println("Enter the Name : ");
		Scanner S = new Scanner(System.in);
		name=S.nextLine(); */
		int leng= name.length(); 
		System.out.println(leng);
		String res=" ";
		for(int i = leng-1;i>=0;i--)
		{
			
			res=res+name.charAt(i);
		
		}
		System.out.println(res);






	}


}
 
