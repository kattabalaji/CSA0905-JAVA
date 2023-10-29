import java.util.*;
class PalindromeStr
{
public static void main(String args[])
{
String s1="Vineetha"; 
String s2=""; 
int len=s1.length(); 
for(int i=len-1;i>=0;i--) 
{ 
s2=s2+s1.charAt(i); 
} 
System.out.println(s2);
if(s1.equals(s2)) 
System.out.print("Palindrome"); 
else 
System.out.print("Not palindrome"); 
}
}
