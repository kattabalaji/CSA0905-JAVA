import java.util.*;
class Pattern4
{
	public static void main(String args[])
	{
		int i,j,n,m;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to be printed:");
		m=s.nextInt();
		System.out.println("enter no.of times to be printed: ");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+m);
			}
			System.out.println();
		}
		for(i=n-1;i>=0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+m);
			}
			System.out.println();
		}
	}
}