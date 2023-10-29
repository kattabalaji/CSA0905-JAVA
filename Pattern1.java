import java.util.Scanner;
class Pattern1
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in); 
System.out.print("Enter the number to print: "); 
int n=input.nextInt(); 
System.out.print("no of lines to print: "); 
int m=input.nextInt(); 
for(int i=1;i<=m;i++) 
{ 
    for(int j=1;j<=i;j++) 
    { 
        System.out.print(n); 
    } 
    System.out.println(); 
} 
for(int i=m-1;i>=1;i--) 
{ 
    for(int j=1;j<=i;j++) 
    { 
        System.out.print(n); 
    } 
    System.out.println(); 
} 
}
}
