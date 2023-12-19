import java.util.*;
class Sumof
{
    public static void main(String args[])
    {
        int n,a,r,s=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        n=sc.nextInt();
	if(n!=0)
	{
	a =n%10;
	sum=sum+a;
	n=n/10;
	}
	System.out.println("sum of digits="+sum);
while(n!=0){
r=sum%10;
s=s+r;
sum/=10;
}
System.out.println("sum of digits="+s);
}
}