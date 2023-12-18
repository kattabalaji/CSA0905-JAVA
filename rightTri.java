import java.util.*;
class Right_triangle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of rows: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
