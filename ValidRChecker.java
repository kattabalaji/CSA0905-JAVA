import java.util.Scanner;

public class ValidRChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (isValidUsername(username)) {
            System.out.println(username + " is a valid username.");
        } else {
            System.out.println(username + " is not a valid username.");
        }
    }

    public static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z0-9_]{3,20}$");
    }
}
