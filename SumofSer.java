import java.util.*;
class SeriesSum
{
	public static void main(String args[])
	{
	int n,sum=0,i;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the n value: ");
	n=s.nextInt();
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println("Sum of the series is:"+Sum);
	}
}