import java.util.*;
class Swap_With
{
    public static void main(String args[])
    {
        int r ,b, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter R value:");
        r=sc .nextInt();
        System.out.println("enter b value:");
        b=sc .nextInt();
        System.out.println("before swap " +r +" " + b);
        a=r;
        r=b;
        b=a;
        System.out.println("after swap "+r +" " + b);
        System.out.println();
        }
}