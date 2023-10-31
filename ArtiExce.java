import java.util.*;
class ArtiExce {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a and b :");
	int a=s.nextInt();
	int b=s.nextInt();
	try
	{
		int c=a/b;
		System.out.println("output =" +c);
	}
	catch(Exception ex)
	{
	 	System.out.println(" division by zero Error");
		System.out.println("change the value:");
	}
	finally
	{
		System.out.println("always excuted");
	}
}

} 