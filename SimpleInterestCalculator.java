import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        System.out.print("Is customer a senior citizen (y/n): ");
        char customerType = scanner.next().charAt(0);

        double rateOfInterest = (customerType == 'y' || customerType == 'Y') ? 0.12 : 0.10;

        double simpleInterest = (principal * rateOfInterest * years);

        System.out.println("Interest: " + simpleInterest);
    }
}
