import java.util.*;
class Harshad
{
	public static void main(String args[])
	{
		int sum=0,n,n1,rem;
		Scanner s= new Scanner(System.in);
		System.out.println("enter n: ");
		n=s.nextInt();
		n1=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(n1%sum==0)
		{
			System.out.println("Harshad number");
		}
		else
		{
			System.out.println("Not a Harshad number");
		}
	}
}