import java.util.*;
class Pattern3
{
	public static void main(String args[])
	{
		int i,j,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of rows: ");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(i=n-1;i>=0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}