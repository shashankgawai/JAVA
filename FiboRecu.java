/* Program to Print Fibonacci Series Using Recursion in Java */

import java.util.*;

class FiboRecu
{
	static int a=0,b=1,c;
	
	public static void main(String[] args)
	{

		FiboRecu i = new FiboRecu();
		i.Info(18);


	}
	void Info(int i)
	{
	
		if(i>=0)
		{	
			c=a+b;
			System.out.println( " "+c);
			a=b;
			b=c;
			Info(i-1);
		}


	}



}