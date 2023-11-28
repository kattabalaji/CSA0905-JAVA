import java.util.*;
class DecimaltoBinary
{
    public static void main(String args[])
    {
        int decimal_number,binary_number=0,i=1,rem;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number :");
        decimal_number=s.nextInt();
        s.close();
        while(decimal_number!=0)
        {
            rem=decimal_number%8;
            decimal_number=decimal_number/8;
            binary_number=binary_number+rem*i;
            i=i*8;
        }
        System.out.print("The binary equivalent is :"+binary_number);
}
}