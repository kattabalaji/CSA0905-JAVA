import java.util.*;
class Multi
{
	public static void main(String args[])
	{
		int m,n,i,a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter M value:");
		m=s.nextInt();
		System.out.println("enter N value:");
		n=s.nextInt();
		for(i=1;i<m;i++)
		{
			a=i*n;
			System.out.println(i + " x " + m + " = " +a);
		}
	}
}

