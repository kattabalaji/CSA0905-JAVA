import java.util.Scanner;

public class LCMandGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        
        int lcm = 1;
        int gcd = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Number " + i + ": ");
            int num = scanner.nextInt();
            lcm = (lcm * num) / findGCD(lcm, num);
            gcd = findGCD(gcd, num);
        }
        
        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
        
        scanner.close();
    }
    
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}
