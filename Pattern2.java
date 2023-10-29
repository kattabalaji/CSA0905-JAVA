import java.util.Scanner;
class Pattern2
	{
		public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=input.nextInt(); 
		for(int i=1;i<=n;i++) 
			{ 
			    for(int j=1;j<=i;j++) 
			    { 
        			System.out.print("* "); 
   	 			} 
   				 System.out.println(); 
			} 
			for(int i=n-1;i>=1;i--) 
			{ 
			    for(int j=1;j<=i;j++) 
    				{ 
        				System.out.print("* "); 
    					} 
				    System.out.println(); 
				} 
			}	
		}
