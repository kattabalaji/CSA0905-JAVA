import java.util.*;
class Sumof
{
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number:");
        n=s.nextInt();
	while(n>0)
	{
	digit=n%10;
	sum=sum+digit;
	n=n/10;
	}
	System.out.println("sum of digits="+sum);
}
}