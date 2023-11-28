import java.util.*;
class Fibo_thread extends Thread
{
	public void run()
	{
		int n1=0,n2=1,sum=0;
		System.out.println(+n1);
		System.out.println(+n2);
		for(int i=2;i<10;i++)
		{
			sum=n1+n2;
			System.out.println(+sum);
			n1=n2;
			n2=sum;
		}
	}
}
class Revfibo_thread extends Thread
{

	public void run()
	{
		int fibo[]=new int[100];
		fibo[0]=0;
		fibo[1]=1;
		System.out.println("Reverse Fibonacci");
		for(int i=2;i<10;i++)
		{
			fibo[i]=fibo[i-2]+fibo[i-1];
		}
		for(int i=9;i>=0;i--)
		{
			System.out.println(+fibo[i]);
		}
	}
	public static void main(String args[])
	{
		Fibo_thread obj=new Fibo_thread();
		Revfibo_thread obj1=new Revfibo_thread();
		obj.start();
		obj1.start();
	}
}