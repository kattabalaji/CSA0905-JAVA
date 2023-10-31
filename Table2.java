import java.util.*;
class Table1 implements Runnable
{
	public void run()
	{
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" *13 ="+i*13);
		}
	}
}
class Table_thread implements Runnable
{

	public void run()
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" *17 ="+i*17);
		}
	}
	public static void main(String args[])
	{
		Table1 obj=new Table1();
		Thread t1=new Thread(obj);
		t1.start();
		Table_thread obj1=new Table_thread();
		Thread t2=new Thread(obj1);
		t2.start();
		
	}
}