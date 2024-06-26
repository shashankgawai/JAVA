
/* Program To Check for Armstrong Number in Java */

import java.util.*;

class Armstrong
{
	public static void main(String[] args)
	{
		
		int no;
		System.out.println("Enter the Number : ");
		Scanner S = new Scanner(System.in);
		no=S.nextInt();
		int temp=no;
		int length=0;
		
		
		while (temp != 0)
		{
			
			length = length+1;
			temp=temp/10;
					
		
		}
		 //System.out.print(" The Length is Number is "+length);
		int temp1=no;
		int rem;
		int ams =0;
		
		while( temp1 != 0)
		{
			
			rem=temp1%10;
			int mul=1;
			
			for(int i=0;i<length;i++)
			{
				
			 mul=mul*rem;
			
			}
			ams=ams+mul;
			temp1=temp1/10;	
	
		}
		if(no ==ams)
		{

			System.out.print("THIS NUMBER IS AMRSTRONG ");

		}
		else
		{

			System.out.print("THIS NUMBER IS NOT AMRSTRONG ");
		}
	}


}
			




