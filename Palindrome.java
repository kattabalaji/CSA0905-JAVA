import java.util.*;
public class Palindrome 
{
  public static void main(String[] args) 
  {
    
    int num ,originalNum, reversedNum = 0, remainder;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		num=s.nextInt();
        originalNum = num;

    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }
}