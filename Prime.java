import java.util.*;
class Prime
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in); 
System.out.print("Enter n:");
int n=input.nextInt(); 
int flag=0; 
for(int i=2;i<n/2;i++) 
{ 
    if(n%i==0) 
    System.out.print("It's not a prime number");  
    flag=1;   
} 
if(flag==0) 
    System.out.print("It's a prime number"); 
}
}
