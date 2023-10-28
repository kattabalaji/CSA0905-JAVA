import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Date (MM/DD/YYYY): ");
        String input = scanner.nextLine();
        scanner.close();

        int year = extractYear(input);

        if (isLeapYear(year)) {
            System.out.println("Given year is Leap Year");
        } else {
            System.out.println("Given year is Non Leap Year");
        }
    }

    public static int extractYear(String date) {
        // Assuming the date is in the format MM/DD/YYYY
        String[] parts = date.split("/");
        if (parts.length >= 3) {
            try {
                return Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid date format. Please use MM/DD/YYYY.");
            }
        } else {
            System.err.println("Invalid date format. Please use MM/DD/YYYY.");
        }
        return 0;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
