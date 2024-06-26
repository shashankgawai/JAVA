import java.util.Scanner;

class ArmstrongNew
{
	public static void main(String[] args)
	{
	Scanner S = new Scanner(System.in);
	System.out.print("eneter the number : ");
	int num=S.nextInt();
	int temp=num;
	int temp1=num;
	int length = 0;
	while( temp != 0)
	{
		temp=temp /10;
		length= length+1;

	}
	int rem;
	int arm=0;
	while( temp1 != 0)
	{
		rem = temp1%10;
		int mul=1;
		
		for(int i = 0;length>i;i++)
		{
			
			mul = mul*rem;
			
			
		}
		arm=arm+mul;
		temp1=temp1/10;

	}
	if(num ==  arm)
	{
		System.out.print("amrstrong");
	}
	else
	{
		System.out.print("not amrstrong");
	}






	}





}