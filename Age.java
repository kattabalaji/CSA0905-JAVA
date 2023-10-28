import java.util.*;
class Age
{
    public static void main(String args[])
    {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.println("enter age:");
        age=s.nextInt();
      if(age<=8){
        System.out.println("kids");
      	}
	else if(9>age && age<18)
	{
	System.out.println("teen age");
	}
	else if(19>age && age<39)
	{
	System.out.println("adults");
	}
      	else if(40>age && age<59)
	{
	System.out.println("elders");
      	}
	else {
	System.out.println("Senior citizen");
        }
}
}