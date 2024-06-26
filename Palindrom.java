/* Program To Check for Palindrome Number */

import java.util.*;

class Palindrom
{

	public static void main(String[] args)
	{

		int no;
		Scanner S = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		no=S.nextInt();
		int temp=no;
		int rev=0,rem;
		while(temp != 0)
		{

			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;



		}
		if( rev == no )
		{
			System.out.println(rev+" This is PalindromNumber");


		}
		else
		{
			System.out.println(rev+" This is not PalindromNumber");
			
		}






	}







}