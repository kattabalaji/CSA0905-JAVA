import java.util.*;
class Reverse_string.java
{
	public static void main(String args[])
	{
		String s1;
		String s2=" ";
		int i,a;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the string: ");
		s1=s.nextLine();
		a=s1.length();
		for(i=a-1;i>=0;i--)
		{
			s2+=s1.charAt(i);
		}
		System.out.print("reversed string is"+s2);
	}
}
