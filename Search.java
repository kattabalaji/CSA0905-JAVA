import java.util.Scanner;

public class Search {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine();

        System.out.print("Enter the character to search for: ");
        char targetChar = s.next().charAt(0);

        int l = str.length();
        System.out.println("'" + targetChar + "' is present at index:");
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == targetChar) {
                System.out.println(" " + i);
            }
        }
    }
}
