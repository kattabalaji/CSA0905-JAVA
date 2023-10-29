import java.util.*;
class Perfect
{
public static void main(String args[])
{
	int n,i,factors=0;
Scanner s=new Scanner(System.in); 
    System.out.println("enter a number:"); 
n=s.nextInt(); 

for(i=1;i<n;i++) 
{ 
    if(n%i==0) 
        factors=factors+i; 
} 
if(n==factors) 
    System.out.println("It's a perfect number"); 
else
   System.out.println("It's noe a perfect number");
}
}
