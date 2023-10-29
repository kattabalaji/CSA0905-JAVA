import java.util.*;
class Armstrong
 {
    public static void main(String arg[])
{
        int n,r,sum=0,temp;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number: ");
	n=s.nextInt();
	temp=n;
	while(n!=0)
	{
	r=n%10;
	sum=sum+(r*r*r);
	n=n/10;
	}
	if(temp==sum)
	{
	System.out.println("Armstrong number");
	}
	else
	{
	System.out.println("Not an Armstrong number");
	}
    }
}
