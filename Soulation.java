import java.util.Scanner;

public class Soulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();

        System.out.println("Original String: " + str1);
        System.out.println("Length of the last word of the above string: " + lengthWord(str1));
    }

    static int lengthWord(String str1) {
        int lengthWord = 0;
        for (int i = str1.length() - 1; i >= 0; i--) {
        
            if (str1.charAt(i) != ' ') {
                lengthWord++;
            } else if (lengthWord > 0) {
                break;
            }
        }

        return lengthWord;
    }
}
