import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
	int n,rem,rev=0,n1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number: ");
	n=s.nextInt();
	n1=n;
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(n1==rev)
	{
		System.out.println("Reverse number");
	}
	else
	{
		System.out.println(" Not a Reverse number");
	}
	}
}