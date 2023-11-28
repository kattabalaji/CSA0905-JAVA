import java.util.*;
class Decimal
{
	public static void main(String args[])
	{
		int i,n;
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("enter n: ");
		n=s.nextInt();
		for(i=0;n>0;i++)
		{
			a[i]=n%2;
			n=n/2;
		}
		for(i=i-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}