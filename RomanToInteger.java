import java.util.Scanner;

class RomanToInteger {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N:");
        n = s.nextInt();
        int originalNumber = n;  
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        if (originalNumber == 1) {
            System.out.println("I");
        } else if (originalNumber == 5) {
            System.out.println("V");
        } else if (originalNumber == 10) {
            System.out.println("X");
        } else if (originalNumber == 50) {
            System.out.println("L");
        } else if (originalNumber == 100) {
            System.out.println("C");
        } else if (originalNumber == 500) {
            System.out.println("D");
        } else if (originalNumber == 1000) {
            System.out.println("M");
        } else {
            System.out.println(-1);
        }
    }
}
