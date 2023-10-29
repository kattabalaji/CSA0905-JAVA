import java.util.Scanner;
class Pascal
{
public static void main(String args[])
{
int i,j,k;
Scanner input=new Scanner(System.in);
System.out.println("Enter n value:");
int n=input.nextInt();  
for(i=1;i<=n;i++) 
{ 
    int a=1; 
    for(k=1;k<=n-i;k++) 
    { 
        System.out.print(" "); 
    } 
    for(j=1;j<=i;j++) 
    { 
        System.out.print(a+" "); 
        a=a*(i-j)/j; 
    } 
    System.out.println(); 
} 
}
}
