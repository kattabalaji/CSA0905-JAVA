import java.util.Scanner;
class Pattern3
{
public static void main(String args[])
{
int i,j,k;
Scanner input=new Scanner(System.in);
System.out.println("Enter n :");
int n=input.nextInt(); 
for(i=n;i>=1;i--)
	{
		for(k=0;k<=n-i;k++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(" "+i);
                }
		System.out.println();
	}
}
}
