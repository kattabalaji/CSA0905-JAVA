import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        int n,n1=0,n2=1,n3,i,count=10,a;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number:");
        n=s.nextInt();
	for(i=2;i<n;i++)
	{
	n3=n1+n2;
	System.out.println(" "+n3);
	n1=n2;
	n2=n3;
	}
    }
}