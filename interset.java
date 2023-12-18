import java.util.*;
class Senior_citizen
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int p,t,r;
		char x;
		double si;
		System.out.println("enter principal amount: ");
		p=s.nextInt();
		System.out.println("enter no.of years: ");
		t=s.nextInt();
		System.out.println("Is customer senior citizen(y/n:)");
		x=s.next().charAt(0);
		if(x=='y')
		{
			si=(p*t*12)/100;
		}
		else
		{
			si=(p*t*10)/100;
		}
		System.out.println("Interst: "+si);
	}
}
