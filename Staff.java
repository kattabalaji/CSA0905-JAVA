import java.util.*;
class Staff
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter users: ");
		int users=s.nextInt();
		System.out.println("enter the staff users: ");
		int staff=s.nextInt();
		int teaching=(staff/3);
		int student=users-(staff+teaching);
		System.out.println("student users: "+student);
	}
}