import java.util.*;
class GcdLcm_3
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n1,n2,n,gcd=1,lcm,i,n3;
		System.out.println("enter the n value: ");
		n=s.nextInt();
		System.out.println("enter n1: ");
		n1=s.nextInt();
		System.out.println("enter n2: ");
		n2=s.nextInt();
		System.out.println("enter n3: ");
		n3=s.nextInt();
		for(i=1;i<=n1 && i<=n2 && i<=n3;i++)
		{
			if(n1%i==0 && n2%i==0 && n3%i==0)
			{

				gcd=i;
			}
		}
		lcm=(n1*n2*n3)/gcd;
		System.out.println("gcd is: "+gcd);
		System.out.println("lcm is: "+lcm);
	}
}
